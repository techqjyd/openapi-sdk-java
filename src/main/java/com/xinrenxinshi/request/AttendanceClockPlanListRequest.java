package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.AreaInfo;
import com.xinrenxinshi.domain.attendance.AttendanceSimplePlanInfo;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

public class AttendanceClockPlanListRequest  extends AbstractOpenapiJsonRequest<List<AttendanceSimplePlanInfo>> {

    public AttendanceClockPlanListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<AttendanceSimplePlanInfo>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<AttendanceSimplePlanInfo>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<AttendanceSimplePlanInfo>>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无需参数检查
         */
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/clockPlans";
    }
}
