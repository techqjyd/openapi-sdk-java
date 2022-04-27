package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.CalculationCompanyGroupV2Response;
import java.util.Map;

/**
 * @author fj
 * @version 1.0
 * @date 2021/12/7 3:34 下午
 * @desc
 */
public class CalculationCompanyGroupV2Request extends AbstractOpenapiJsonRequest<CalculationCompanyGroupV2Response> {

    public CalculationCompanyGroupV2Request(String accessToken) {
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
    public OpenapiResponse<CalculationCompanyGroupV2Response> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<CalculationCompanyGroupV2Response>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<CalculationCompanyGroupV2Response>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/calculation/getAllCompanyGroupV2";
    }
}
