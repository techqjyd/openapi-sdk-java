package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

public class FlowRepairCheckRequest extends AbstractOpenapiJsonRequest<String> {
    /**
     * 员工id
     */
    private String employeeId;
    /**
     * 补打卡时间
     */
    private String bdkDate;
    /**
     * 班次id
     */
    private String clockSettingId;
    /**
     * 时段id
     */
    private String rangeId;
    /**
     * 上下班卡类型 必填
     * 1:上班卡 2:下班卡 0:无效卡(休息日补卡)
     */
    private Integer clockType;
    /**
     * 打卡时间yyyy-MM-dd HH:mm
     */
    private String clockTime;
    /**
     * 补卡理由
     */
    private String reason;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getBdkDate() {
        return bdkDate;
    }

    public void setBdkDate(String bdkDate) {
        this.bdkDate = bdkDate;
    }

    public String getClockSettingId() {
        return clockSettingId;
    }

    public void setClockSettingId(String clockSettingId) {
        this.clockSettingId = clockSettingId;
    }

    public String getRangeId() {
        return rangeId;
    }

    public void setRangeId(String rangeId) {
        this.rangeId = rangeId;
    }

    public Integer getClockType() {
        return clockType;
    }

    public void setClockType(Integer clockType) {
        this.clockType = clockType;
    }

    public String getClockTime() {
        return clockTime;
    }

    public void setClockTime(String clockTime) {
        this.clockTime = clockTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public FlowRepairCheckRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        map.put("bdkDate", bdkDate);
        map.put("clockSettingId", clockSettingId);
        map.put("rangeId", rangeId);
        map.put("clockType", clockType);
        map.put("clockTime",clockTime);
        map.put("reason",reason);
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
            throw new ParamNotValidException("员工id为空");
        }
        if (XRXSStrUtils.isEmpty(bdkDate)) {
            throw new ParamNotValidException("补卡日期为空");
        }
        if (XRXSStrUtils.isEmpty(clockSettingId)) {
            throw new ParamNotValidException("班次id为空");
        }
        if (XRXSStrUtils.isEmpty(rangeId)) {
            throw new ParamNotValidException("时段id为空");
        }
        if (clockType == null) {
            throw new ParamNotValidException("补卡类型为空");
        }
        if (XRXSStrUtils.isEmpty(clockTime)) {
            throw new ParamNotValidException("补卡时间为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/repair/check";
    }
}
