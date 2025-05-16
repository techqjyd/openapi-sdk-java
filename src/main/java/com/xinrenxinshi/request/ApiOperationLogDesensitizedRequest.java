package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.log.ApiOperationLogResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

import static com.xinrenxinshi.common.Constants.LIMIT_NUMBER_PAGES;

public class ApiOperationLogDesensitizedRequest extends AbstractOpenapiJsonRequest<PageResult<ApiOperationLogResult>> {

    private Integer pageNo;
    private Integer pageSize;
    private Integer startTime;
    private Integer endTime;
    private String requestUrl;
    private String code;
    private String result;

    public ApiOperationLogDesensitizedRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("pageNo", pageNo);
        map.put("pageSize", pageSize);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        if (!XRXSStrUtils.isEmpty(requestUrl)) {
            map.put("requestUrl", requestUrl);
        }
        if (!XRXSStrUtils.isEmpty(code)) {
            map.put("code", code);
        }
        if (!XRXSStrUtils.isEmpty(result)) {
            map.put("result", result);
        }
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PageResult<ApiOperationLogResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<PageResult<ApiOperationLogResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PageResult<ApiOperationLogResult>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (pageNo == null) {
            throw new ParamNotValidException("起始页码为空");
        }
        if (pageSize == null || pageSize > LIMIT_NUMBER_PAGES) {
            throw new ParamNotValidException("pageSize为空或者数量超过100");
        }

    }

    @Override
    public String getBizUrl() {
        return "/v5/log/api/operation/list/desensitized";
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
