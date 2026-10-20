package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttendanceDailyReportResult;
import com.xinrenxinshi.domain.attendance.AttendanceExceptionNumberResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PageResult;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : AttendanceDailyReportRequest
 * @date : 2024/7/23 14:24
 */
@Getter
@Setter
public class AttendanceExceptionNumberRequest extends AbstractOpenapiJsonRequest<AttendanceExceptionNumberResult> {

    private String employeeId;
    private String yearmo;

    public AttendanceExceptionNumberRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(2);
        map.put("employeeId", employeeId);
        map.put("yearmo", yearmo);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<AttendanceExceptionNumberResult> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<AttendanceExceptionNumberResult>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<AttendanceExceptionNumberResult>>() {
    };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (employeeId == null) {
            throw new ParamNotValidException("employeeId为空");
        }
        if (yearmo == null) {
            throw new ParamNotValidException("yearmo为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/exception/number";
    }
}
