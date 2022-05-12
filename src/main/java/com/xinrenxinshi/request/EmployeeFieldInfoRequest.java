package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeGroupFieldData;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeFieldInfoRequest extends AbstractOpenapiJsonRequest<List<EmployeeGroupFieldData>> {

    private List<String> employeeIds;

    private String groupId;

    private Integer status;

    private Integer hasDel;

    public List<String> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(List<String> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getHasDel() {
        return hasDel;
    }

    public void setHasDel(Integer hasDel) {
        this.hasDel = hasDel;
    }

    public EmployeeFieldInfoRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        HashMap<String, Object> map = new HashMap<>(4);
        map.put("groupId", groupId);
        map.put("employeeIds",employeeIds);
        map.put("status",status);
        map.put("hasDel",hasDel);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<EmployeeGroupFieldData>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<EmployeeGroupFieldData>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<EmployeeGroupFieldData>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(groupId)) {
            throw new ParamNotValidException("分组id为空");
        }
        if(employeeIds == null || employeeIds.size() == 0){
            throw new ParamNotValidException("员工id集合为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/group/employee/fields";
    }
}
