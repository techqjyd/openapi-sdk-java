package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ApprovalApplyResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class TravelApprovalApplyV2Request extends AbstractOpenapiJsonRequest<ApprovalApplyResponse> {
    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 开始时间 yyyy-MM-dd HH:mm:ss
     */
    private String startDate;

    /**
     * 时间类型 0 上半天 1 下半天
     */
    private Integer startTime;

    /**
     * 结束时间
     */
    private String endDate;

    /**
     * 时间类型 0 上半天 1 下半天
     */
    private Integer endTime;

    /**
     * 申请原因
     */
    private String reason;

    /**
     * 出发地
     */
    private String placeOfDeparture;

    /**
     * 目的地
     */
    private String destination;


    /**
     * 交通工具 1:高铁 2:动车 3:火车 4:飞机 5:汽车 6:轮船 7:自驾
     */
    private Integer vehicleType;

    /**
     * 预算
     */
    private Double budget;

    /**
     * 备注
     */
    private String remark;

    /**
     * 时间单位 0-按天 1-按小时
     */
    private Integer timeUnit;

    public TravelApprovalApplyV2Request(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public void setPlaceOfDeparture(String placeOfDeparture) {
        this.placeOfDeparture = placeOfDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Integer vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        map.put("employeeId", employeeId);
        map.put("mobile", mobile);
        map.put("startDate", startDate);
        map.put("startTime", startTime);
        map.put("endDate", endDate);
        map.put("endTime", endTime);
        map.put("reason", reason);
        map.put("placeOfDeparture", placeOfDeparture);
        map.put("destination", destination);
        map.put("vehicleType", vehicleType);
        map.put("budget", budget);
        map.put("remark", remark);
        map.put("timeUnit",timeUnit);
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
        if (XRXSStrUtils.isEmpty(employeeId) && XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("员工employeeId和mobile不能同时为空");
        }
        if (startDate == null) {
            throw new ParamNotValidException("出差开始日期为空");
        }
        if (endDate == null) {
            throw new ParamNotValidException("出差结束日期为空");
        }
        if (startTime == null) {
            throw new ParamNotValidException("出差开始时间为空");
        }
        if (endTime == null) {
            throw new ParamNotValidException("出差结束时间为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/apply/travel/v2";
    }
}
