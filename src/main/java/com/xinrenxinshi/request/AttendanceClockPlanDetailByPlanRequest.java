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
 * 根据方案id获取打卡方案明细
 * @author hzz on 2022/02/08
 */
public class AttendanceClockPlanDetailByPlanRequest extends AbstractOpenapiJsonRequest<AttendanceClockPlanDeteilInfo> {
    private Integer planId;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public AttendanceClockPlanDetailByPlanRequest(String accessToken){super(accessToken);}

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(8);
        map.put("planId", planId);
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
        return "/v5/attendance/clockPlan/Detail/planId";
    }
}
