package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.JobDictionaryFieldModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 岗位自定义字段列表request
 *
 * @author: zhangdongliang
 * @create: 2026-10-20
 **/
public class DepartmentJobFieldListRequest extends AbstractOpenapiJsonRequest<List<JobDictionaryFieldModel>> {

    public DepartmentJobFieldListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<JobDictionaryFieldModel>> getResponseClass() {
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
        return "/v5/department/jobdictionary/fields";
    }

    @Override
    public TypeReference<OpenapiResponse<List<JobDictionaryFieldModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<JobDictionaryFieldModel>>>() {
        };
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return new HashMap<>(2);
    }
}
