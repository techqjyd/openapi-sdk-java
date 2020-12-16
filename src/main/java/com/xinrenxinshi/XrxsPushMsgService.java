package com.xinrenxinshi;

import com.xinrenxinshi.domain.ExternalFailMsgModel;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.PushMsgFailRequest;
import com.xinrenxinshi.util.RequestTemplate;

import java.util.List;

/**
 * 消息订阅service
 *
 * @author: liuchenhui
 * @create: 2019-11-14 14:49
 **/
public abstract class XrxsPushMsgService {
    /**
     * 获取失败消息
     *
     * @param access_token 授权token
     */
    public static OpenapiResponse<List<ExternalFailMsgModel>> getFailMsg(String access_token) throws ApiException {
        PushMsgFailRequest request = new PushMsgFailRequest(access_token);
        return getFailMsg(request);
    }

    /**
     * 获取失败消息
     */
    public static OpenapiResponse<List<ExternalFailMsgModel>> getFailMsg(PushMsgFailRequest request) throws ApiException {
        OpenapiResponse<List<ExternalFailMsgModel>> execute = RequestTemplate.execute(request);
        return execute;
    }
}
