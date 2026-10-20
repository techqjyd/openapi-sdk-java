package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.EmployeeOvertimeRuleResult;
import com.xinrenxinshi.domain.approval.MultipleRelaxTimeParam;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OvertimeApplyRuleRequest extends AbstractOpenapiJsonRequest<EmployeeOvertimeRuleResult> {

    private List<String> employeeIdList;
    private int approveStartTime;
    private int approveEndTime;
    private List<MultipleRelaxTimeParam> multipleCustomRelaxTimes;
    private Integer timeUnit;

    public OvertimeApplyRuleRequest(String accessToken) {
        super(accessToken);
    }

    public List<String> getEmployeeIdList() {
        return employeeIdList;
    }

    public void setEmployeeIdList(List<String> employeeIdList) {
        this.employeeIdList = employeeIdList;
    }

    public int getApproveStartTime() {
        return approveStartTime;
    }

    public void setApproveStartTime(int approveStartTime) {
        this.approveStartTime = approveStartTime;
    }

    public int getApproveEndTime() {
        return approveEndTime;
    }

    public void setApproveEndTime(int approveEndTime) {
        this.approveEndTime = approveEndTime;
    }

    public List<MultipleRelaxTimeParam> getMultipleCustomRelaxTimes() {
        return multipleCustomRelaxTimes;
    }

    public void setMultipleCustomRelaxTimes(List<MultipleRelaxTimeParam> multipleCustomRelaxTimes) {
        this.multipleCustomRelaxTimes = multipleCustomRelaxTimes;
    }

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(14);
        map.put("employeeIdList", employeeIdList);
        map.put("approveStartTime", approveStartTime);
        map.put("approveEndTime", approveEndTime);
        map.put("multipleCustomRelaxTimes", multipleCustomRelaxTimes);
        map.put("timeUnit", timeUnit);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<EmployeeOvertimeRuleResult> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<EmployeeOvertimeRuleResult>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<EmployeeOvertimeRuleResult>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/apply/overtime/rule";
    }
}
