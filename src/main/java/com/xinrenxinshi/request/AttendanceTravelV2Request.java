package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class AttendanceTravelV2Request extends AbstractOpenapiJsonRequest<String> {
    /**
     * employeeId
     */
    private String employeeId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 出差开始日期，日期格式：yyyy-MM-dd
     */
    private String startDate;

    /**
     * 出差开始时间，AM：上半天、PM：下半天
     */
    private String startTime;

    /**
     * 出差结束日期，日期格式：yyyy-MM-dd
     */
    private String endDate;

    /**
     * 出差结束时间，AM：上半天、PM：下半天
     */
    private String endTime;

    private Integer timeUnit;


    public AttendanceTravelV2Request(String accessToken) {
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(Integer timeUnit) {
        this.timeUnit = timeUnit;
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
        map.put("startDate", startDate);
        map.put("startTime", startTime);
        map.put("endDate", endDate);
        map.put("endTime", endTime);
        map.put("timeUnit",timeUnit);
        map.put("mobile",mobile);
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
            throw new ParamNotValidException("员工employeeId不能为空");
        }
        if (startDate == null) {
            throw new ParamNotValidException("出差开始日期为空");
        }
        if (startTime == null) {
            throw new ParamNotValidException("出差开始时间为空");
        }
        if (endDate == null) {
            throw new ParamNotValidException("出差结束日期为空");
        }
        if (endTime == null) {
            throw new ParamNotValidException("出差结束时间为空");
        }
        if (timeUnit == null) {
            throw new ParamNotValidException("时间单位为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/travel/v2";
    }
}
