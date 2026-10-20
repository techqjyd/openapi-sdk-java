package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttSimpleShiftResult;
import com.xinrenxinshi.domain.attendance.AttendanceScheduleInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.AttendanceStatisticsResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class AttendanceSimpleShiftRequest extends AbstractOpenapiJsonRequest<AttSimpleShiftResult> {
    private String employeeId;

    private String date;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AttendanceSimpleShiftRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(2);
        map.put("employeeId",employeeId);
        map.put("date",date);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return  MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<AttSimpleShiftResult> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<AttSimpleShiftResult>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<AttSimpleShiftResult>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工employeeId不能为空");
        }
        if (XRXSStrUtils.isEmpty(date)) {
            throw new ParamNotValidException("日期不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/shift/simple";
    }
}
