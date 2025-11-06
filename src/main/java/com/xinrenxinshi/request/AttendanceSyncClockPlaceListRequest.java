package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.attendance.AttendancePlaceModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 同步打卡地点列表request
 */
public class AttendanceSyncClockPlaceListRequest extends AbstractOpenapiJsonRequest<Void> {
    private Integer planId;
    private AttendancePlaceModel attendancePlaceModel;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public AttendancePlaceModel getAttendancePlaceModel() {
        return attendancePlaceModel;
    }

    public void setAttendancePlaceModel(AttendancePlaceModel attendancePlaceModel) {
        this.attendancePlaceModel = attendancePlaceModel;
    }

    public AttendanceSyncClockPlaceListRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(1);
        map.put("planId", planId);
        map.put("attendancePlaceModel", attendancePlaceModel);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Void> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (planId == null) {
            throw new ParamNotValidException("planId can not be null");
        }
        if (attendancePlaceModel == null) {
            throw new ParamNotValidException("attendancePlaceModel can not be null");
        }
    }

    @Override
    public String getBizUrl() {
        return "/sync/clock/place/list";
    }
}