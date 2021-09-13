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
 * 销外出状态同步
 * @author zhaopengcheng
 */
public class AttendanceCancelLeaveOutRequest extends AbstractOpenapiJsonRequest<Void> {
    /**
     * employeeId
     */
    private String employeeId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 0--按天外出，1–按小时外出
     */
    private Integer timeUnit;

    /**
     * 外出开始日期，日期格式：yyyy-MM-dd HH:mm:ss
     */
    private String startDate;


    /**
     * 外出开始日期 按天申请，0：上半天、1：下半天
     */
    private Integer startTime;

    /**
     * 外出开始日期，日期格式：yyyy-MM-dd
     */
    private String endDate;

    /**
     * 出差结束时间，0：上半天、1：下半天
     */
    private Integer endTime;

    /**
     * 申请原因
     */
    private String reason;

    /**
     * 原外出申请id
     */
    private String approvalId;

    public String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId;
    }

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public AttendanceCancelLeaveOutRequest(String accessToken) {
        super(accessToken);
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }



    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("mobile", mobile);
        map.put("timeUnit", timeUnit);
        map.put("startDate", startDate);
        map.put("startTime", startTime);
        map.put("endDate", endDate);
        map.put("endTime", endTime);
        map.put("reason", reason);
        map.put("approvalId", approvalId);
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
        if (XRXSStrUtils.isEmpty(employeeId) && XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("员工employeeId和mobile不能同时为空");
        }
        if (startDate == null) {
            throw new ParamNotValidException("外出开始日期为空");
        }
        if (endDate == null) {
            throw new ParamNotValidException("外出结束日期为空");
        }
        if (timeUnit == null) {
            throw new ParamNotValidException("外出申请类型为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/cancelleaveout";
    }
}
