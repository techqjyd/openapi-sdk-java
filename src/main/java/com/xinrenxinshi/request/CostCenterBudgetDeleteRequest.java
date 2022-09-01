package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class CostCenterBudgetDeleteRequest extends AbstractOpenapiJsonRequest<Void> {
    public CostCenterBudgetDeleteRequest(String accessToken) {
        super(accessToken);
    }

    private String costId;

    public String getCostId() {
        return costId;
    }

    public void setCostId(String costId) {
        this.costId = costId;
    }
    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(5);
        map.put("costId", costId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Void> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(costId)) {
            throw new ParamNotValidException("costId为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/costcenter/budget/delete";
    }
}
