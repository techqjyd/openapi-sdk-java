package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.PayrollSettingResponse;

import java.util.Map;

/**
 * 工资项配置信息request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 15:49
 **/
public class PayrollSettingRequest extends AbstractOpenapiRequest<PayrollSettingResponse> {

    public PayrollSettingRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<PayrollSettingResponse> getResponseClass() {
        return PayrollSettingResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v3/payroll/setting";
    }
}
