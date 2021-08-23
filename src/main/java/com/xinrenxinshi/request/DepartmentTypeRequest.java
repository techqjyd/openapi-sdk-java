package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.DepartmentTypeModel;
import com.xinrenxinshi.domain.RankModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

/**
 * 获取公司部门类型列表
 *
 * @author Ke Zhan on 2020/11/19
 */
public class DepartmentTypeRequest extends AbstractOpenapiJsonRequest<List<DepartmentTypeModel>> {


    public DepartmentTypeRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<DepartmentTypeModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
    }

    @Override
    public TypeReference<OpenapiResponse<List<DepartmentTypeModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<DepartmentTypeModel>>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/depttype/list";
    }
}
