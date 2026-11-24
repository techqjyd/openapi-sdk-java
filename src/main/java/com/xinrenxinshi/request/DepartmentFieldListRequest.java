package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.DepartmentFieldModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 部门自定义字段列表request
 *
 * @author: zhangdongliang
 * @create: 2026-10-20
 **/
public class DepartmentFieldListRequest extends AbstractOpenapiJsonRequest<List<DepartmentFieldModel>> {

    public DepartmentFieldListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<DepartmentFieldModel>> getResponseClass() {
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
        return "/v5/department/fields";
    }

    @Override
    public TypeReference<OpenapiResponse<List<DepartmentFieldModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<DepartmentFieldModel>>>() {
        };
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return new HashMap<>(2);
    }
}
