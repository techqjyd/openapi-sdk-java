package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据销假审批id获取原假审批id
 *
 * @author: hzz
 * @create: 2022-07-11
 **/
public class ApprovalOriginSidRequest extends AbstractOpenapiJsonRequest<String> {

    public ApprovalOriginSidRequest(String accessToken) {
        super(accessToken);
    }

    private String destorySid;

    private String employeeId;

    public String getDestorySid() {
        return destorySid;
    }

    public void setDestorySid(String destorySid) {
        this.destorySid = destorySid;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("destorySid", destorySid);
        map.put("employeeId", employeeId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<String> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(destorySid)) {
            throw new ParamNotValidException("destorySid不能为空");
        }
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("employeeId不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/origin/get";
    }
}
