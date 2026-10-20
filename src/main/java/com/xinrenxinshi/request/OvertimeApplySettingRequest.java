package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.OvertimeOffDaySettingModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class OvertimeApplySettingRequest extends AbstractOpenapiJsonRequest<OvertimeOffDaySettingModel> {

    /**
     * 员工id
     */
    private String employeeId;

    public OvertimeApplySettingRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("employeeId", employeeId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<OvertimeOffDaySettingModel> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<OvertimeOffDaySettingModel>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<OvertimeOffDaySettingModel>>() {};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工employeeId不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/apply/overtime/setting";
    }
}
