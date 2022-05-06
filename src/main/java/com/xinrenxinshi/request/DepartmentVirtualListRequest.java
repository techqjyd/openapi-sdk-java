package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.DepartmentModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentVirtualListRequest extends AbstractOpenapiJsonRequest<List<DepartmentModel>> {

    public DepartmentVirtualListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<DepartmentModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<DepartmentModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<DepartmentModel>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/department/virtual/list";
    }
}
