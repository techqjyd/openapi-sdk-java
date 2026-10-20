package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttendanceHolidayBalanceDetailResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zhaopc
 * @Date 2025/9/23
 * @Version 1.0.0
 * @Description
 */
@Data
public class AttendanceHolidayBalanceRequest extends AbstractOpenapiJsonRequest<List<AttendanceHolidayBalanceDetailResult>> {


    private List<String> employeeIds;

    private Integer holidayType;

    private String endDateStr;

    public AttendanceHolidayBalanceRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("employeeIds", employeeIds);
        map.put("holidayType", holidayType);
        map.put("endDateStr", endDateStr);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<AttendanceHolidayBalanceDetailResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<AttendanceHolidayBalanceDetailResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<AttendanceHolidayBalanceDetailResult>>>() {};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (employeeIds == null || employeeIds.isEmpty()) {
            throw new ParamNotValidException("员工ID不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/holiday/balance";
    }
}
