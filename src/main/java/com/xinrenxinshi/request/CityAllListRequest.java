package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.AreaInfo;
import com.xinrenxinshi.domain.AreaModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityAllListRequest  extends AbstractOpenapiJsonRequest<List<AreaModel>> {

    public CityAllListRequest(String accessToken) {
        super(accessToken);
    }

    /**
     * 区域类型，1-中国，2-国际化
     */
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String,Object> map = new HashMap<>(2);
        map.put("type",type);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<AreaModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<AreaModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<AreaModel>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/common/city/all";
    }
}
