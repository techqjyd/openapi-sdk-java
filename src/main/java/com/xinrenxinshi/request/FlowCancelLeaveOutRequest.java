package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ApprovalApplyResponse;
import com.xinrenxinshi.response.AttendanceLeaveOutResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class FlowCancelLeaveOutRequest extends AbstractOpenapiJsonRequest<ApprovalApplyResponse> {
    /**
     * employeeId
     */
    private String employeeId;

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

    private String approvalId;

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


    public FlowCancelLeaveOutRequest(String accessToken) {
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

    public String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("timeUnit", timeUnit);
        map.put("startDate", startDate);
        map.put("startTime", startTime);
        map.put("endDate", endDate);
        map.put("endTime", endTime);
        map.put("approvalId",approvalId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<ApprovalApplyResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<ApprovalApplyResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<ApprovalApplyResponse>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工employeeId和mobile不能同时为空");
        }
        if (startDate == null) {
            throw new ParamNotValidException("出差开始日期为空");
        }
        if (endDate == null) {
            throw new ParamNotValidException("出差结束日期为空");
        }
        if (timeUnit == null) {
            throw new ParamNotValidException("外出申请类型为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/apply/leaveout/cancel";
    }
}
