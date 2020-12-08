package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.PayrollSettingResponse;

import java.util.Map;

/**
 * 工资项配置信息request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 15:49
 **/
public class PayrollSettingRequest extends AbstractOpenapiJsonRequest<PayrollSettingResponse> {

    public PayrollSettingRequest(String accessToken) {
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
    public OpenapiResponse<PayrollSettingResponse> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public TypeReference<OpenapiResponse<PayrollSettingResponse>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<PayrollSettingResponse>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/payroll/setting";
    }
}
