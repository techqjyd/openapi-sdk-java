package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiAPIRequest;
import com.xinrenxinshi.response.AttendanceScheduleInfoResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工考勤排班request
 *
 * @author: jiazijie
 * @create: 2019-11-14 16:42
 **/
public class AttendanceSchedulingRequest  extends AbstractOpenapiAPIRequest<AttendanceScheduleInfoResponse> {
    /**
     * 多个employeeId，逗号分隔
     */
    private String employeeIds;

    /**
     * 排班日期，日期格式：yyyy-MM-dd
     */
    private String date;

    public AttendanceSchedulingRequest(String accessToken) {
        super(accessToken);
    }


    public String getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(String employeeIds) {
        this.employeeIds = employeeIds;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>();
        map.put("employeeIds", employeeIds);
        map.put("date", date);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<AttendanceScheduleInfoResponse> getResponseClass() {
        return AttendanceScheduleInfoResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if(XRXSStrUtils.isEmpty(employeeIds)) {
            throw new ParamNotValidException("员工employeeIds为空");
        }
        if (date == null) {
            throw new ParamNotValidException("排班日期为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v4/attendance/scheduling";
    }
}
