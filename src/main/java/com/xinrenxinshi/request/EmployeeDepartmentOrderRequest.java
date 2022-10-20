package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeDepartmentOrder;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDepartmentOrderRequest extends AbstractOpenapiJsonRequest<Map<String,List<EmployeeDepartmentOrder>>> {

    private List<String> employeeIds;

    public List<String> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(List<String> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public EmployeeDepartmentOrderRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        HashMap<String, Object> map = new HashMap<>(3);
        map.put("employeeIds", employeeIds);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Map<String,List<EmployeeDepartmentOrder>>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Map<String,List<EmployeeDepartmentOrder>>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Map<String,List<EmployeeDepartmentOrder>>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/orderInDepartment";
    }
}
