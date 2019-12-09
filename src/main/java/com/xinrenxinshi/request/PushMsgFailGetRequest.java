package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.PushMsgFailGetResponse;

import java.util.Map;

/**
 * 失败消息获取request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 17:15
 **/
public class PushMsgFailGetRequest extends AbstractOpenapiRequest<PushMsgFailGetResponse> {

    public PushMsgFailGetRequest(String accessToken) {
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
    public Class<PushMsgFailGetResponse> getResponseClass() {
        return PushMsgFailGetResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v2/pushMessage/getFailMessage";
    }
}
