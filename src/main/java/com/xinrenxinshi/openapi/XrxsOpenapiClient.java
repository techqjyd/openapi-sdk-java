package com.xinrenxinshi.openapi;

import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.common.FreeLoginParam;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.exception.OpenapiClientUninitializedException;
import com.xinrenxinshi.request.EmployeeFileDownloadRequest;
import com.xinrenxinshi.request.OpenapiTokenRequest;
import com.xinrenxinshi.response.EmployeeFileDownloadResponse;
import com.xinrenxinshi.response.EmployeeFileUploadResponse;
import com.xinrenxinshi.response.FreeLoginTokenGetResponse;
import com.xinrenxinshi.response.OpenapiTokenResponse;
import com.xinrenxinshi.util.HttpUtil;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.io.InputStream;

/**
 * 请求openapi接口客户端
 *
 * @author: liuchenhui
 * @create: 2019-10-25 18:14
 **/
public class XrxsOpenapiClient extends AbstractOpenapiClient {

    private final static XrxsOpenapiClient INSTANCE = new XrxsOpenapiClient();

    private XrxsOpenapiClient() {
    }

    /**
     * 初始化OpenapiClient
     *
     * @param appKey    申请的appKey
     * @param appSecret 申请的appSecret
     */
    public static void init(String appKey, String appSecret) {
        INSTANCE.setServerUrl(SERVERURL);
        INSTANCE.setAppKey(appKey);
        INSTANCE.setAppSecret(appSecret);
    }

    public static XrxsOpenapiClient getInstance() throws OpenapiClientUninitializedException {
        String appKey = INSTANCE.getAppKey();
        String appSecret = INSTANCE.getAppSecret();
        if (XRXSStrUtils.areNotEmpty(appKey, appSecret)) {
            return INSTANCE;
        }
        throw new OpenapiClientUninitializedException("XrxsOpenapiClient uninitialized...");
    }

    /**
     * 获取token
     *
     * @return OpenapiTokenResponse
     */
    public OpenapiTokenResponse getToken() throws ApiException {
        OpenapiTokenRequest openqpiRequest = new OpenapiTokenRequest();
        openqpiRequest.setClientId(super.getAppKey());
        openqpiRequest.setClientSecret(super.getAppSecret());
        return this.execute(openqpiRequest);
    }

    /**
     * 获取免登token
     *
     * @param request 请求参数request
     */
    public FreeLoginTokenGetResponse getFreeLoginToken(IOpenapiRequest<FreeLoginTokenGetResponse> request) throws ApiException {
        return this.execute(request);
    }

    /**
     * 执行HTTP请求上传文件
     *
     * @param request 文件上传请求
     */
    public EmployeeFileUploadResponse uploadFile(AbstractOpenapiUploadRequest<EmployeeFileUploadResponse> request) throws ApiException {
        return this.upload(request);
    }

    /**
     * 文件下载
     */
    public InputStream downloadEmpFile(EmployeeFileDownloadRequest request) throws ApiException {
        EmployeeFileDownloadResponse download = this.download(request);
        if (download == null) {
            return null;
        }
        return download.getInputStream();
    }

    /**
     * 获取免登url
     *
     * @param param  参数
     * @param bizUrl 业务url
     */
    public String getFreeLoginUrl(FreeLoginParam param, String bizUrl) throws ApiException {
        if (param == null || XRXSStrUtils.isEmpty(bizUrl)) {
            return null;
        }
        param.check();

        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        String serverUrl = instance.getServerUrl();
        serverUrl = serverUrl.concat(bizUrl);

        StringBuilder sb = new StringBuilder();
        sb.append(serverUrl);
        sb.append("?");
        sb.append(HttpUtil.buildQuery(param.getParamMap(), Constants.CHARSET_UTF8));
        return sb.toString();
    }

    /**
     * 获取免登url
     *
     * @param param  参数
     * @param bizUrl 业务url
     */
    public String getFreeLoginUrl(IOpenapiRequest param, String bizUrl) throws ApiException {
        if (param == null || XRXSStrUtils.isEmpty(bizUrl)) {
            return null;
        }
        param.check();

        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        String serverUrl = instance.getServerUrl();
        serverUrl = serverUrl.concat(bizUrl);

        StringBuilder sb = new StringBuilder();
        sb.append(serverUrl);
        sb.append("?");
        sb.append(HttpUtil.buildQuery(param.getParamMap(), Constants.CHARSET_UTF8));
        return sb.toString();
    }
}
