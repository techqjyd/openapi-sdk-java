package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工打卡request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 16:42
 **/
public class AttendanceClockRequest extends AbstractOpenapiJsonRequest<Void> {
    /**
     * 员工ID
     */
    private String employeeId;
    /**
     * 员工手机号
     */
    private String mobile;
    /**
     * 打卡时间戳（精确到秒）
     */
    private Integer clockTime;
    /**
     * 经度(打卡位置)
     */
    private Double longitude;
    /**
     * 纬度(打卡位置)
     */
    private Double latitude;
    /**
     * 打卡类型，固定值：2、考勤机打卡
     */
    private Integer source;
    /**
     * 备注
     */
    private String remark;

    public AttendanceClockRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getClockTime() {
        return clockTime;
    }

    public void setClockTime(Integer clockTime) {
        this.clockTime = clockTime;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("employeeId", employeeId);
        map.put("mobile", mobile);
        map.put("clockTime", clockTime);
        map.put("longitude", longitude);
        map.put("latitude", latitude);
        map.put("source",source);
//        map.put("source", source);
        map.put("remark", remark);
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
            throw new ParamNotValidException("员工ID, 和员工手机号不能同时为空");
        }
        if (clockTime == null) {
            throw new ParamNotValidException("打卡时间戳（精确到秒）不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/clock";
    }
}
