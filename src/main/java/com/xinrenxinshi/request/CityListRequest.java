package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.AreaInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

/**
 * 城市列表request
 *
 * @author: liuchenhui
 * @create: 2019-11-11 10:57
 **/
public class CityListRequest extends AbstractOpenapiJsonRequest<List<AreaInfo>> {

    public CityListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<AreaInfo>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无需参数检查
         */
    }

    @Override
    public TypeReference<OpenapiResponse<List<AreaInfo>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<AreaInfo>>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/common/citys";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }
}
