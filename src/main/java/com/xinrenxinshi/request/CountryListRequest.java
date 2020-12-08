package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.CountryModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

/**
 * 国籍列表request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 10:57
 **/
public class CountryListRequest extends AbstractOpenapiJsonRequest<List<CountryModel>> {

    public CountryListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<CountryModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无需参数检查
         */
    }

    @Override
    public String getBizUrl() {
        return "/v5/common/country";
    }

    @Override
    public TypeReference<OpenapiResponse<List<CountryModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<CountryModel>>>() {
        };
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }
}
