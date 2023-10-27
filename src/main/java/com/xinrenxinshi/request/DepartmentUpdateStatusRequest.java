package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 部门启用或停用
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:41
 **/
public class DepartmentUpdateStatusRequest extends AbstractOpenapiJsonRequest<Void> {

    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 部门名称
     */
    private Integer status;
    /**
     * 上级部门ID
     */
    private String disableRemark;

    public DepartmentUpdateStatusRequest(String accessToken) {
        super(accessToken);
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDisableRemark() {
        return disableRemark;
    }

    public void setDisableRemark(String disableRemark) {
        this.disableRemark = disableRemark;
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
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(departmentId)) {
            throw new ParamNotValidException("部门id为空");
        }
        if (!XRXSStrUtils.isNumeric(status)) {
            throw new ParamNotValidException("状态不是数字");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/department/updateStatus";
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(3);
        map.put("departmentId", departmentId);
        if (!XRXSStrUtils.isNumeric(status)) {
            map.put("status", status);
        }
        if (!XRXSStrUtils.isEmpty(disableRemark)) {
            map.put("disableRemark", disableRemark);
        }
        return map;
    }
}
