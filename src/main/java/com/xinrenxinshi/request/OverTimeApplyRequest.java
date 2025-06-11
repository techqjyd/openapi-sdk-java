package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.MultipleRelaxTimeParam;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ApprovalApplyResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OverTimeApplyRequest extends AbstractOpenapiJsonRequest<String> {
    /**
     * 发起人
     */
    private String employeeId;
    /**
     * 工作日类型
     */
    private String workType;
    /**
     * 隐藏补偿方式
     */
    private Integer compensationWayHideSwitch;
    /**
     * 加班单位 0 按天 1按小时
     */
    private Integer timeUnit;
    /**
     * 加班开始时间
     */
    private Integer startDate;
    /**
     * 加班结束时间
     */
    private Integer endDate;
    /**
     * 补偿方式
     */
    private Integer overtimeCompensationRule;

    /**
     * 加班时长小时
     */
    private Double overtimeHour;

    /**
     * 加班时长天
     */
    private Double overtimeDay;

    /**
     * 用户自定义休息时间
     */
    private List<MultipleRelaxTimeParam> multipleCustomRelaxTimes;

    /**
     * 固定休息时间
     */
    private String multipleRelaxTime;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public Integer getCompensationWayHideSwitch() {
        return compensationWayHideSwitch;
    }

    public void setCompensationWayHideSwitch(Integer compensationWayHideSwitch) {
        this.compensationWayHideSwitch = compensationWayHideSwitch;
    }

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public Integer getOvertimeCompensationRule() {
        return overtimeCompensationRule;
    }

    public void setOvertimeCompensationRule(Integer overtimeCompensationRule) {
        this.overtimeCompensationRule = overtimeCompensationRule;
    }

    public Double getOvertimeHour() {
        return overtimeHour;
    }

    public void setOvertimeHour(Double overtimeHour) {
        this.overtimeHour = overtimeHour;
    }

    public Double getOvertimeDay() {
        return overtimeDay;
    }

    public void setOvertimeDay(Double overtimeDay) {
        this.overtimeDay = overtimeDay;
    }

    public List<MultipleRelaxTimeParam> getMultipleCustomRelaxTimes() {
        return multipleCustomRelaxTimes;
    }

    public void setMultipleCustomRelaxTimes(List<MultipleRelaxTimeParam> multipleCustomRelaxTimes) {
        this.multipleCustomRelaxTimes = multipleCustomRelaxTimes;
    }

    public String getMultipleRelaxTime() {
        return multipleRelaxTime;
    }

    public void setMultipleRelaxTime(String multipleRelaxTime) {
        this.multipleRelaxTime = multipleRelaxTime;
    }

    public OverTimeApplyRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("timeUnit", timeUnit);
        map.put("startDate", startDate);
        map.put("endDate", endDate);
        map.put("workType", workType);
        map.put("compensationWayHideSwitch", compensationWayHideSwitch);
        map.put("overtimeCompensationRule", overtimeCompensationRule);
        map.put("overtimeHour", overtimeHour);
        map.put("overtimeDay", overtimeDay);
        map.put("multipleCustomRelaxTimes", multipleCustomRelaxTimes);
        map.put("multipleRelaxTime", multipleRelaxTime);
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
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/apply/overtime";
    }
}
