package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
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
public class AttendanceSaveClockRequest extends AbstractOpenapiRequest<OpenapiResponse> {
    /**
     * 员工ID
     */
    private String employeeId;
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
    private Integer source = 2;

    public AttendanceSaveClockRequest(String accessToken) {
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

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>();
        map.put("employeeId", employeeId);
        map.put("clockTime", clockTime);
        map.put("longitude", longitude);
        map.put("latitude", latitude);
        map.put("source", source);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<OpenapiResponse> getResponseClass() {
        return OpenapiResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if(XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工ID为空");
        }
        if (clockTime == null) {
            throw new ParamNotValidException("打卡时间戳（精确到秒）");
        }
        if (longitude == null) {
            throw new ParamNotValidException("打卡经度位置为空");
        }
        if (latitude == null){
            throw new ParamNotValidException("打卡维度位置为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v2/attendance/saveClock";
    }
}
