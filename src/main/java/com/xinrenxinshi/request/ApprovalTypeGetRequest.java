package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.approval.FlowType;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.response.ApprovalTypeGetResponse;

import java.util.List;
import java.util.Map;

/**
 * 公司审批类型请求参数
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:14
 **/
public class ApprovalTypeGetRequest extends AbstractOpenapiJsonRequest<List<FlowType>> {

    public ApprovalTypeGetRequest(String accessToken) {
        super(accessToken);
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<List<FlowType>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        /**
         * 无参数，无需校验
         */
    }

    @Override
    public TypeReference<OpenapiResponse<List<FlowType>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<FlowType>>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/workflow/flowtypes";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        return null;
    }
}
