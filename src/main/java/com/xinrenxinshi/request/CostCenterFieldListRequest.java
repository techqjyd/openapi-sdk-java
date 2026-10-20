package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.CostCenterFieldModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 成本中心自定义字段列表request
 *
 * @author: zhangdongliang
 * @create: 2026-10-20
 **/
public class CostCenterFieldListRequest extends AbstractOpenapiJsonRequest<List<CostCenterFieldModel>> {

    public CostCenterFieldListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<CostCenterFieldModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        /*
         * 无需校验
         */
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/costcenter/fields";
    }

    @Override
    public TypeReference<OpenapiResponse<List<CostCenterFieldModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<CostCenterFieldModel>>>() {
        };
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return new HashMap<>(2);
    }
}
