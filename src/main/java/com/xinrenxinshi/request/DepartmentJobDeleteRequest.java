package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class DepartmentJobDeleteRequest extends AbstractOpenapiJsonRequest<Void> {
    public DepartmentJobDeleteRequest(String accessToken) {
        super(accessToken);
    }

    /**
     * 岗位id
     */
    private String jobId;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(5);
        map.put("jobId", jobId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Void> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(jobId)) {
            throw new ParamNotValidException("jobId为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/jobdictionary/delete";
    }
}
