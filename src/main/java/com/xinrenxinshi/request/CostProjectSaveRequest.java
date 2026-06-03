package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.payroll.CostProjectSaveParamModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目保存/修改request
 *
 * @author panhuiwen
 */
public class CostProjectSaveRequest extends AbstractOpenapiJsonRequest<Object> {

    private CostProjectSaveParamModel model;

    public CostProjectSaveRequest(String accessToken) {
        super(accessToken);
    }

    public CostProjectSaveParamModel getModel() {
        return model;
    }

    public void setModel(CostProjectSaveParamModel model) {
        this.model = model;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.putAll(com.alibaba.fastjson.JSON.parseObject(
                com.alibaba.fastjson.JSON.toJSONString(model), Map.class));
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
        if (model == null) {
            throw new ParamNotValidException("项目信息不能为空");
        }
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/payroll/cost/project/save";
    }
}
