package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门删除request≈
 *
 * @author: liuchenhui
 * @create: 2019-11-11 11:43
 **/
public class DepartmentDeleteRequest extends AbstractOpenapiRequest<OpenapiResponse> {
    /**
     * 部门id
     */
    private String departmentId;

    public DepartmentDeleteRequest(String accessToken) {
        super(accessToken);
    }

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
    public Class<OpenapiResponse> getResponseClass() {
        return OpenapiResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(departmentId)) {
            throw new ParamNotValidException("部门id为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v3/department/delete";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("departmentId", departmentId);
        return map;
    }
}
