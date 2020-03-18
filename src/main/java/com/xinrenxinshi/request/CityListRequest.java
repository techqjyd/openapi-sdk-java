package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.CityListResponse;

import java.util.Map;

/**
 * 城市列表request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 10:57
 **/
public class CityListRequest extends AbstractOpenapiRequest<CityListResponse> {

    public CityListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<CityListResponse> getResponseClass() {
        return CityListResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无需参数检查
         */
    }


    @Override
    public String getBizUrl() {
        return "/v3/common/citys";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }
}
