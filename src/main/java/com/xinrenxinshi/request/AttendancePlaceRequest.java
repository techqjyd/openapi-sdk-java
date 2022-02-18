package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttendancePlaceRequest extends AbstractOpenapiJsonRequest<List<AttendancePlaceResponse>> {
    private Integer planId;
    private Integer clockType;

    public AttendancePlaceRequest(String accessToken) {
        super(accessToken);
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getClockType() {
        return clockType;
    }

    public void setClockType(Integer clockType) {
        this.clockType = clockType;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(2);
        map.put("planId",planId);
        map.put("clockType",clockType);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<AttendancePlaceResponse>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<AttendancePlaceResponse>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<AttendancePlaceResponse>>>(){};
    }

    @Override
    public void check() throws ParamNotValidException {
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/clockplaces";
    }
}