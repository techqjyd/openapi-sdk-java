package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSDateUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class FlowCancelApplyRequest extends AbstractOpenapiJsonRequest<Object> {
    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 原审批sid
     */
    private Long originSid;

    /**
     * 申请时间单位，0-按天，1-按小时
     */
    private Integer timeUnit;

    /**
     * 销假开始日期，日期格式：yyyy-MM-dd
     */
    private String startDate;
    /**
     * 销假开始时间，0:上半天、1：下半天
     */
    private Integer startTime;
    /**
     * 销假结束日期，日期格式：yyyy-MM-dd
     */
    private String endDate;
    /**
     * 销假结束时间，0：上半天、1：下半天
     */
    private Integer endTime;


    public FlowCancelApplyRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Long getOriginSid() {
        return originSid;
    }

    public void setOriginSid(Long originSid) {
        this.originSid = originSid;
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

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("originSid", originSid);
        map.put("employeeId", employeeId);
        map.put("startDate", startDate);
        map.put("startTime", startTime);
        map.put("endDate", endDate);
        map.put("endTime", endTime);
        map.put("timeUnit",timeUnit);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Object> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工employeeId不能为空");
        }
        if (!XRXSDateUtils.isDateStr(startDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("销假开始日期, 不符合yyyy-MM-dd格式校验");
        }
        if (startTime == null) {
            throw new ParamNotValidException("销假开始时间为空");
        }
        if (!XRXSDateUtils.isDateStr(endDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("销假结束日期, 不符合yyyy-MM-dd格式校验");
        }
        if (endTime == null) {
            throw new ParamNotValidException("销假结束时间为空");
        }
        if (originSid == null) {
            throw new ParamNotValidException("原审批sid为空");
        }
        if (timeUnit == null) {
            throw new ParamNotValidException("timeUnit为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/destory/leave/apply";
    }
}
