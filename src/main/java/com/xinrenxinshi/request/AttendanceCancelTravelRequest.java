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

/**
 * 销出差接口请求
 *
 * @author Ke Zhan on 2020/11/19
 */
public class AttendanceCancelTravelRequest extends AbstractOpenapiJsonRequest<Object> {
    /**
     * 员工id
     */
    private String employeeId;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 销出差开始日期，日期格式：yyyy-MM-dd
     */
    private String startDate;
    /**
     * 销出差开始时间，AM：上半天、PM：下半天
     */
    private String startTime;
    /**
     * 销出差结束日期，日期格式：yyyy-MM-dd
     */
    private String endDate;
    /**
     * 销出差结束时间，AM：上半天、PM：下半天
     */
    private String endTime;

    public AttendanceCancelTravelRequest(String accessToken) {
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("mobile", mobile);
        map.put("employeeId", employeeId);
        map.put("startDate", startDate);
        map.put("startTime", startTime);
        map.put("endDate", endDate);
        map.put("endTime", endTime);
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
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId) && XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("员工employeeId和mobile不能同时为空");
        }
        if (!XRXSDateUtils.isDateStr(startDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("销出差开始日期, 不符合yyyy-MM-dd格式校验");
        }
        if (XRXSStrUtils.isEmpty(startTime)) {
            throw new ParamNotValidException("销出差开始时间为空");
        }
        if (!XRXSDateUtils.isDateStr(endDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("销出差结束日期, 不符合yyyy-MM-dd格式校验");
        }
        if (XRXSStrUtils.isEmpty(endTime)) {
            throw new ParamNotValidException("销出差结束时间为空");
        }
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/canceltravel";
    }
}
