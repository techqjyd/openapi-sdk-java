package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.ApprovalTypeGetResponse;

import java.util.Map;

/**
 * 公司审批类型请求参数
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:14
 **/
public class ApprovalTypeGetRequest extends AbstractOpenapiRequest<ApprovalTypeGetResponse> {

    public ApprovalTypeGetRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<ApprovalTypeGetResponse> getResponseClass() {
        return ApprovalTypeGetResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无参数，无需校验
         */
    }

    @Override
    public String getBizUrl() {
        return "/v4/flow/flowTypes";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }
}
