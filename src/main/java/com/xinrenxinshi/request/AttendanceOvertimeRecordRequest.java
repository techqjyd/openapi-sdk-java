package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

public class AttendanceOvertimeRecordRequest extends AbstractOpenapiJsonRequest<String> {
    /**
     * 员工id
     */
    private String employeeId;
    /**
     * 所属考勤日 必填
     * yyyy-MM-dd
     */
    private String overtimeDate;
    /**
     * 开始时间 必填
     * HH:mm
     */
    private String startTime;
    /**
     * 结束时间 必填
     * HH:mm
     */
    private String endTime;
    /**
     * 加班小时数 必填
     */
    private Double overtimeHour;
    /**
     * 补偿方式 必填
     * 1:调休 2:加班费 0:无补偿
     */
    private Integer compensationWay;
    /**
     * 过期时间 非必填
     * yyyy-MM-dd
     * 若不填,则表示该加班记录为永久有效
     */
    private String expireDate;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getOvertimeDate() {
        return overtimeDate;
    }

    public void setOvertimeDate(String overtimeDate) {
        this.overtimeDate = overtimeDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getOvertimeHour() {
        return overtimeHour;
    }

    public void setOvertimeHour(Double overtimeHour) {
        this.overtimeHour = overtimeHour;
    }

    public Integer getCompensationWay() {
        return compensationWay;
    }

    public void setCompensationWay(Integer compensationWay) {
        this.compensationWay = compensationWay;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public AttendanceOvertimeRecordRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("overtimeDate", overtimeDate);
        map.put("startTime", startTime);
        map.put("endTime", endTime);
        map.put("overtimeHour", overtimeHour);
        map.put("compensationWay",compensationWay);
        map.put("expireDate",expireDate);
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
        return "/v5/attendance/sync/overtime";
    }
}
