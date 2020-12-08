package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.ExternalFailMsgModel;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;
import java.util.Map;

/**
 * 失败消息获取request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 17:15
 **/
public class PushMsgFailRequest extends AbstractOpenapiJsonRequest<List<ExternalFailMsgModel>> {

    public PushMsgFailRequest(String accessToken) {
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
    public OpenapiResponse<List<ExternalFailMsgModel>> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public TypeReference<OpenapiResponse<List<ExternalFailMsgModel>>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<List<ExternalFailMsgModel>>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/message/faillist";
    }
}
