package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttendanceStatusRangeResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttendanceStatusRequest extends AbstractOpenapiJsonRequest<List<AttendanceStatusRangeResult>> {
    /**
     * 员工id
     */
    private String employeeId;

    /**
     * 开始时间，按秒的时间戳
     */
    private String startDate;

    /**
     * 结束时间,按秒的时间戳
     */
    private String endDate;

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

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public AttendanceStatusRequest(String accessToken) {
        super(accessToken);
    }


    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("employeeId", employeeId);
        map.put("startDate", startDate);
        map.put("endDate", endDate);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<AttendanceStatusRangeResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<AttendanceStatusRangeResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<AttendanceStatusRangeResult>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工employeeId为空");
        }
        if (XRXSStrUtils.isEmpty(startDate)||XRXSStrUtils.isEmpty(endDate)) {
            throw new ParamNotValidException("开始时间或结束时间为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/employee/status";
    }
}
