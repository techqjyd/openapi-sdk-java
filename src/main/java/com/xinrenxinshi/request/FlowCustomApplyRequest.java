package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.FlowGroupForOpenapiModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.FlowCustomApplyResult;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowCustomApplyRequest extends AbstractOpenapiJsonRequest<String> {

    private String companyId;
    private String employeeId;
    private String departmentId;
    private Integer settingId;
    private List<FlowGroupForOpenapiModel> formData;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getSettingId() {
        return settingId;
    }

    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    public List<FlowGroupForOpenapiModel> getFormData() {
        return formData;
    }

    public void setFormData(List<FlowGroupForOpenapiModel> formData) {
        this.formData = formData;
    }

    public FlowCustomApplyRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("employeeId", employeeId);
        map.put("departmentId", departmentId);
        map.put("settingId", settingId);
        map.put("formData", formData);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<String> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(companyId)) {
            throw new ParamNotValidException("公司id为空");
        }
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工id为空");
        }
        if (XRXSStrUtils.isEmpty(departmentId)) {
            throw new ParamNotValidException("部门id为空");
        }
        if (settingId == null) {
            throw new ParamNotValidException("审批设置id为空");
        }
        if (formData == null) {
            throw new ParamNotValidException("审批表单数据为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/apply/custom/flow";
    }
}
