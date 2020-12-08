package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttendanceScheduleInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSListUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 员工考勤排班request
 *
 * @author: jiazijie
 * @create: 2019-11-14 16:42
 **/
public class AttendanceSchedulingRequest extends AbstractOpenapiJsonRequest<AttendanceScheduleInfo> {
    /**
     * 多个employeeId，逗号分隔
     */
    private List<String> employeeIds;

    /**
     * 排班日期，日期格式：yyyy-MM-dd
     */
    private String date;

    public AttendanceSchedulingRequest(String accessToken) {
        super(accessToken);
    }

    public List<String> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(List<String> employeeIds) {
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
        Map<String, Object> map = new HashMap<>(4);
        map.put("employeeIds", employeeIds);
        map.put("date", date);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<AttendanceScheduleInfo> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSListUtils.isEmpty(employeeIds)) {
            throw new ParamNotValidException("员工employeeIds为空");
        }
        if (date == null) {
            throw new ParamNotValidException("排班日期为空");
        }
    }

    @Override
    public TypeReference<OpenapiResponse<AttendanceScheduleInfo>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<AttendanceScheduleInfo>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/scheduling";
    }
}
