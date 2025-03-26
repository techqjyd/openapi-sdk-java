package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class CompanyCreateRequest extends AbstractOpenapiJsonRequest<String> {
    /**
     * 公司名称
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("name", name);
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

    public CompanyCreateRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(name)) {
            throw new ParamNotValidException("name为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/company/create";
    }
}
