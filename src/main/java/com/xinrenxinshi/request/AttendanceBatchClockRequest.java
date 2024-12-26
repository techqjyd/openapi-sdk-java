package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.BatchClockModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.JsonUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 批量打卡request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 16:58
 **/
public class AttendanceBatchClockRequest extends AbstractOpenapiJsonRequest<Object> {

    /**
     * 批量打卡数据
     */
    private List<BatchClockModel> clockData;

    public AttendanceBatchClockRequest(String accessToken) {
        super(accessToken);
    }

    public List<BatchClockModel> getClockData() {
        return clockData;
    }

    public void setClockData(List<BatchClockModel> clockData) {
        this.clockData = clockData;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(4);
        map.put("clockData", clockData);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Object> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (clockData == null) {
            throw new ParamNotValidException("批量打卡数据为空");
        }
        for (BatchClockModel batchClockModel : clockData) {
            Integer clockTime = batchClockModel.getClockTime();
            String mobile = batchClockModel.getMobile();
            if (clockTime == null || XRXSStrUtils.isEmpty(mobile)) {
                throw new ParamNotValidException("手机号或者打卡时间戳为空");
            }
        }
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/attendance/batchclock";
    }
}
