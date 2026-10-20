package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.CompanyModel;
import com.xinrenxinshi.domain.CostCenterDetailModel;
import com.xinrenxinshi.domain.DepartmentModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CompanyListRequest extends AbstractOpenapiJsonRequest<List<CompanyModel>> {

    public CompanyListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<CompanyModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<CompanyModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<CompanyModel>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/department/company/list";
    }
}
