package com.xinrenxinshi.openapi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.request.OpenapiTokenRequest;
import com.xinrenxinshi.response.EmployeeFileDownloadResponse;
import com.xinrenxinshi.response.OpenapiTokenResponse;
import com.xinrenxinshi.util.FileItem;
import com.xinrenxinshi.util.JsonUtils;
import com.xinrenxinshi.util.HttpUtil;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.io.InputStream;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;


/**
 * 执行客户端请求公共处理类
 *
 * @author: liuchenhui
 * @create: 2019-10-31 11:55
 **/
@SuppressWarnings("all")
@Slf4j
public abstract class AbstractOpenapiClient implements IOpenapiClient {

    protected static final String SERVERURL = "https://api.xinrenxinshi.com";

    private String serverUrl;
    private String appKey;
    private String appSecret;
    protected boolean needCheckRequest = false; // 是否在客户端校验请求
    private int connectTimeout = 15000; // 默认连接超时时间为15秒
    private int readTimeout = 30000; // 默认响应超时时间为30秒

    public AbstractOpenapiClient() {
    }

    @Override
    public OpenapiTokenResponse token(OpenapiTokenRequest request) throws ApiException {
        return _token(request);
    }

    protected OpenapiTokenResponse _token(OpenapiTokenRequest request) throws ApiException {
        if (this.needCheckRequest) {
            request.check();
        }

        String body = invokeApi(request);

        if (XRXSStrUtils.isEmpty(body)) {
            throw new ApiException("返回结果为空");
        }
        OpenapiTokenResponse response = JSON.parseObject(body, OpenapiTokenResponse.class);
        if (response == null) {
            throw new ApiException("返回结果为空");
        }

        return response;
    }

    @Override
    public <T> OpenapiResponse<T> execute(IOpenapiRequest<T> request) throws ApiException {
        return _execute(request);
    }

    protected <T> OpenapiResponse<T> _execute(IOpenapiRequest<T> request) throws ApiException {
        if (this.needCheckRequest) {
            request.check();
        }

        String body = invokeApi(request);

        if (XRXSStrUtils.isEmpty(body)) {
            throw new ApiException("返回结果为空");
        }
        OpenapiResponse<T> tOpenapiResponse = parseBody(request, body);
        if (tOpenapiResponse == null) {
            throw new ApiException("返回结果为空");
        }

        return tOpenapiResponse;
    }

    @Override
    public <T> OpenapiResponse<T> upload(AbstractOpenapiUploadRequest<T> request) throws ApiException {
        return _execute(request);
    }

    @Override
    public EmployeeFileDownloadResponse download(IOpenapiRequest request) throws ApiException {
        if (this.needCheckRequest) {
            request.check();
        }
        try {
            EmployeeFileDownloadResponse localResponse = new EmployeeFileDownloadResponse();
            InputStream inputStream = HttpUtil.doDownloadFileWithJson(this.serverUrl.concat(request.getBizUrl()), request.getParamMap(), connectTimeout,readTimeout, request.getHeaderMap());

            localResponse.setInputStream(inputStream);
            return localResponse;
        } catch (ApiException e) {
            String msg = e.getMessage();
            Map<String, String> map = JSON.parseObject(msg, new TypeReference<Map<String, String>>() {
            });
            String errcode = map.get("errcode");
            String errmsg = map.get("errmsg");
            throw new ApiException(Integer.parseInt(errcode), errmsg);
        }
    }


    private String invokeApi(IOpenapiRequest request) throws ApiException {
        Map<String, String> headerMap = request.getHeaderMap();
        Map<String, Object> paraMap = request.getParamMap();
        String data = XRXSStrUtils.EMPTY;

        if ("GET".equals(request.getMethod().getMethod())) {
            data = HttpUtil.doGet(this.serverUrl.concat(request.getBizUrl()), paraMap, connectTimeout, readTimeout, headerMap);
        } else {
            if (request instanceof AbstractOpenapiUploadRequest) {
                AbstractOpenapiUploadRequest uploadRequest = (AbstractOpenapiUploadRequest) request;
                Map<String, FileItem> fileItemMap = uploadRequest.getFileItemMap();
                data = HttpUtil.doPostWithFile(this.serverUrl.concat(request.getBizUrl()), paraMap, fileItemMap, connectTimeout, readTimeout, headerMap);
            } else if (request instanceof AbstractOpenapiJsonRequest) {
                AbstractOpenapiJsonRequest apiRequest = (AbstractOpenapiJsonRequest) request;
                data = HttpUtil.doPostWithJson(this.serverUrl.concat(request.getBizUrl()), paraMap, connectTimeout, readTimeout, headerMap);
            } else {
                data = HttpUtil.doPost(this.serverUrl.concat(request.getBizUrl()), paraMap, connectTimeout, readTimeout, headerMap);
            }
        }
        return data;
    }


    private <T> OpenapiResponse<T> parseBody(IOpenapiRequest<T> request, String body) throws ApiException {
        try {
            TypeReference<OpenapiResponse<T>> typeRef = request.getResponseTypeRef();
            OpenapiResponse<T> openapiResponse;
            if (null != typeRef) {
                openapiResponse = JsonUtils.formJson(body, request.getResponseTypeRef());
            } else {
                openapiResponse = JsonUtils.formJson(request.getResponseClass().getClass(), body);
            }
            if (openapiResponse != null && null != openapiResponse.getErrcode()) {
                openapiResponse.setErrcode(openapiResponse.getErrcode());
                openapiResponse.setErrmsg(openapiResponse.getErrmsg());
            }
            return openapiResponse;
        } catch (Exception e) {
            log.error("deserialization fail responseClass:{}, responseBody:{}", request.getResponseClass().toString(), body, e);
            throw new ApiException("deserialization fail responseClass:" + request.getResponseClass() + ", responseBody:" + body);
        }
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public boolean isNeedCheckRequest() {
        return needCheckRequest;
    }

    public void setNeedCheckRequest(boolean needCheckRequest) {
        this.needCheckRequest = needCheckRequest;
    }
}
