package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.FlowSettingGroupModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 请假审批发起
 *
 * @author: hzz
 * @create: 2022-05-12
 **/
public class AttendanceLeaveApplyRequest extends AbstractOpenapiJsonRequest<String> {

    /**
     * 员工id
     */
    private String employeeId;
    /**
     * 请假类型
     */
    private Integer holidayType;
    /**
     * 申请单位，0-按天，1-按小时
     */
    private Integer timeUnit;
    /**
     * 开始日期
     */
    private String startDate;
    /**
     * 按天的话，0-上半天，1-下半天
     */
    private Integer startTime;
    /**
     * 结束日期
     */
    private String endDate;
    /**
     * 按天的话，0-上半天，1-下半天
     */
    private Integer endTime;
    /**
     * 自定义字段组
     */
    private List<FlowSettingGroupModel> customField;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(Integer holidayType) {
        this.holidayType = holidayType;
    }

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public List<FlowSettingGroupModel> getCustomField() {
        return customField;
    }

    public void setCustomField(List<FlowSettingGroupModel> customField) {
        this.customField = customField;
    }

    public AttendanceLeaveApplyRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("employeeId", employeeId);
        map.put("holidayType", holidayType);
        map.put("timeUnit", timeUnit);
        map.put("startDate", startDate);
        map.put("startTime", startTime);
//        map.put("source", source);
        map.put("endDate", endDate);
        map.put("endTime", endTime);
        map.put("customField", customField);
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
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工ID不能为空");
        }
        if (holidayType == null) {
            throw new ParamNotValidException("请假类型不能为空");
        }
        if (timeUnit == null) {
            throw new ParamNotValidException("申请单位不能为空");
        }
        if (XRXSStrUtils.isEmpty(startDate)) {
            throw new ParamNotValidException("开始日期不能为空");
        }
        if (XRXSStrUtils.isEmpty(endDate)) {
            throw new ParamNotValidException("结束日期不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/leave/apply";
    }
}
