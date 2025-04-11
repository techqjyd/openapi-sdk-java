package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.FlowSettingFormResult;

import java.util.HashMap;
import java.util.Map;

public class FlowSettingFormRequest extends AbstractOpenapiJsonRequest<FlowSettingFormResult> {

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

    public FlowSettingFormRequest(String accessToken) {
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
    public OpenapiResponse<FlowSettingFormResult> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<FlowSettingFormResult>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<FlowSettingFormResult>>() {
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
        return "/v5/workflow/setting/form";
    }
}
