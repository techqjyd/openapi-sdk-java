package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.DepartmentHeadcountResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门创建request
 *
 * @author: liuchenhui
 * @create: 2019-11-08 16:34
 **/
public class DepartmentHeadcountRequest extends AbstractOpenapiJsonRequest<DepartmentHeadcountResponse> {

    private String departmentId;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<DepartmentHeadcountResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(departmentId)) {
            throw new ParamNotValidException("部门ID为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/headcount/query";
    }

    @Override
    public TypeReference<OpenapiResponse<DepartmentHeadcountResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<DepartmentHeadcountResponse>>() {
        };
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("departmentId", departmentId);
        return map;
    }
}
