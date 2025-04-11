package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.FlowGroupForOpenapiModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowSettingFormRequest extends AbstractOpenapiJsonRequest<List<FlowGroupForOpenapiModel>> {

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
    public OpenapiResponse<List<FlowGroupForOpenapiModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<List<FlowGroupForOpenapiModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<FlowGroupForOpenapiModel>>>() {
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
