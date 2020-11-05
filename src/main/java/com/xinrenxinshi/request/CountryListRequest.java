package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.CountryListResponse;

import java.util.Map;

/**
 * 国籍列表request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 10:57
 **/
public class CountryListRequest extends AbstractOpenapiRequest<CountryListResponse> {

    public CountryListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<CountryListResponse> getResponseClass() {
        return CountryListResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无需参数检查
         */
    }


    @Override
    public String getBizUrl() {
        return "/v4/common/country";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }
}
