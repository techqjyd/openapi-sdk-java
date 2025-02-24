package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.FieldConfig;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeFieldsSettingRequest extends AbstractOpenapiJsonRequest<List<FieldConfig>> {
    public EmployeeFieldsSettingRequest(String accessToken) {
        super(accessToken);
    }
    public EmployeeFieldsSettingRequest() {
        super();
    }
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }
    public String getBizUrl() {
        return "/v5/employee/fields/setting";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        return map;
    }
    public void check() throws ParamNotValidException {
    }
    public OpenapiResponse<List<FieldConfig>> getResponseClass() {
        return new OpenapiResponse<>();
    }
    public TypeReference<OpenapiResponse<List<FieldConfig>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<FieldConfig>>>() {
        };
    }
}
