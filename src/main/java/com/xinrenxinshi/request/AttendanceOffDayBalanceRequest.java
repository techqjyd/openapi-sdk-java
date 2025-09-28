package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttendanceOffDayBalanceDetailResult;
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
public class AttendanceOffDayBalanceRequest extends AbstractOpenapiJsonRequest<List<AttendanceOffDayBalanceDetailResult>> {

    /**
     * 员工ID
     */
    private List<String> employeeIds;

    /**
     * 截止日期(yyyy-MM-dd)，为空则默认为当前日期
     */
    private String endDateStr;

    public AttendanceOffDayBalanceRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("employeeIds", employeeIds);
        map.put("endDateStr", endDateStr);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<AttendanceOffDayBalanceDetailResult>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<AttendanceOffDayBalanceDetailResult>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<AttendanceOffDayBalanceDetailResult>>>() {};
    }

    @Override
    public void check() throws ParamNotValidException {
        if (employeeIds == null || employeeIds.isEmpty()) {
            throw new ParamNotValidException("员工ID不能为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/offday/balance";
    }
}
