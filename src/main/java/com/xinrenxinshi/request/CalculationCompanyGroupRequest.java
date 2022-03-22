package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.CalculationCompanyGroupResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.List;
import java.util.Map;

/**
 * @author fj
 * @version 1.0
 * @date 2021/12/7 3:34 下午
 * @desc
 */
public class CalculationCompanyGroupRequest extends AbstractOpenapiJsonRequest<List<CalculationCompanyGroupResponse>> {

    public CalculationCompanyGroupRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }

    @Override
    public MethodEnum getMethod() {
        return  MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<CalculationCompanyGroupResponse>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<CalculationCompanyGroupResponse>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<CalculationCompanyGroupResponse>>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/calculation/getAllCompanyGroup";
    }
}
