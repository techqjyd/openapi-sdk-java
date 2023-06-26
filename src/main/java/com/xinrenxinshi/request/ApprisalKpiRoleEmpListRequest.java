package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.apprisal.ApprisalKpiRoleEmpPageResult;
import com.xinrenxinshi.domain.approval.ProcessFlowInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

public class ApprisalKpiRoleEmpListRequest extends AbstractOpenapiJsonRequest<ApprisalKpiRoleEmpPageResult> {
    private String roleId;

    private Integer pageNum;

    private Integer pageSize;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ApprisalKpiRoleEmpListRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("roleId", roleId);
        map.put("pageNum", pageNum);
        map.put("pageSize", pageSize);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<ApprisalKpiRoleEmpPageResult> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<ApprisalKpiRoleEmpPageResult>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<ApprisalKpiRoleEmpPageResult>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/apprisal/kpi/role/empList";
    }
}
