package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目删除request
 *
 * @author panhuiwen
 */
public class CostProjectDelRequest extends AbstractOpenapiJsonRequest<Object> {

    private Integer id;

    public CostProjectDelRequest(String accessToken) {
        super(accessToken);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("id", id);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Object> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (id == null) {
            throw new ParamNotValidException("id 不能为空");
        }
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/payroll/cost/project/del";
    }
}
