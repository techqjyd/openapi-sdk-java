package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttendanceClockPlanDeteilInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据员工id获取打卡方案明细
 * @author hzz on 2022/02/08
 */
public class AttendanceClockPlanDetailByEmployeeRequest extends AbstractOpenapiJsonRequest<AttendanceClockPlanDeteilInfo> {
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public AttendanceClockPlanDetailByEmployeeRequest(String accessToken){super(accessToken);}

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("employeeId", employeeId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<AttendanceClockPlanDeteilInfo> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<AttendanceClockPlanDeteilInfo>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<AttendanceClockPlanDeteilInfo>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/clockPlan/Detail/employeeId";
    }
}
