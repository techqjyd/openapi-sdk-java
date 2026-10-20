package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PayrollEmployeePreBasePayFormResponse;

import java.util.HashMap;
import java.util.Map;

public class PayrollPreBaseFormRequest extends AbstractOpenapiJsonRequest<PayrollEmployeePreBasePayFormResponse> {

    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public PayrollPreBaseFormRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("employeeId", employeeId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<PayrollEmployeePreBasePayFormResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public TypeReference<OpenapiResponse<PayrollEmployeePreBasePayFormResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PayrollEmployeePreBasePayFormResponse>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/payroll/pre/base/form";
    }
}
