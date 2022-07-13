package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.FlowSettingDetailResult;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.Map;

public class FlowSettingDetailRequest extends AbstractOpenapiJsonRequest<FlowSettingDetailResult> {
    /**
     * 审批设置id
     */
    private Integer settingId;

    public Integer getSettingId() {
        return settingId;
    }

    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    public FlowSettingDetailRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("settingId", settingId);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<FlowSettingDetailResult> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<FlowSettingDetailResult>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<FlowSettingDetailResult>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (settingId == null) {
            throw new ParamNotValidException("审批设置id为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/setting/detail";
    }
}
