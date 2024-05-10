package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.apprisal.ApprisalKpiRoleEmployeeModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApprisalkpiSaveRoleEmpRequest extends AbstractOpenapiJsonRequest<Void> {
    private String roleId;

    private List<ApprisalKpiRoleEmployeeModel> kpiRoleEmpList;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<ApprisalKpiRoleEmployeeModel> getKpiRoleEmpList() {
        return kpiRoleEmpList;
    }

    public void setKpiRoleEmpList(List<ApprisalKpiRoleEmployeeModel> kpiRoleEmpList) {
        this.kpiRoleEmpList = kpiRoleEmpList;
    }

    public ApprisalkpiSaveRoleEmpRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("roleId", roleId);
        map.put("kpiRoleEmpList", kpiRoleEmpList);
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

    }

    @Override
    public String getBizUrl() {
        return "/v5/apprisal/kpi/roleEmp/save";
    }
}
