package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttendancePlaceModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 同步打卡地点列表request
 */
public class AttendanceClockPlaceAddRequest extends AbstractOpenapiJsonRequest<Boolean> {
    private Integer clockPlanId;
    private List<AttendancePlaceModel> attendancePlaceModels;

    public Integer getClockPlanId() {
        return clockPlanId;
    }

    public void setClockPlanId(Integer clockPlanId) {
        this.clockPlanId = clockPlanId;
    }

    public List<AttendancePlaceModel> getAttendancePlaceModels() {
        return attendancePlaceModels;
    }

    public void setAttendancePlaceModels(List<AttendancePlaceModel> attendancePlaceModels) {
        this.attendancePlaceModels = attendancePlaceModels;
    }

    public AttendanceClockPlaceAddRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("clockPlanId", clockPlanId);
        map.put("attendancePlaceModels", attendancePlaceModels);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Boolean> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Boolean>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Boolean>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (clockPlanId == null) {
            throw new ParamNotValidException("planId can not be null");
        }
        if (attendancePlaceModels == null) {
            throw new ParamNotValidException("attendancePlaceModel can not be null");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/clock/place/add";
    }
}