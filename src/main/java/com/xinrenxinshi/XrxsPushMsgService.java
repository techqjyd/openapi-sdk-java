package com.xinrenxinshi;

import com.xinrenxinshi.domain.ExternalFailMsgModel;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.PushMsgFailGetRequest;
import com.xinrenxinshi.response.PushMsgFailGetResponse;

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
    public static List<ExternalFailMsgModel> getFailMsg(String access_token) throws ApiException {
        PushMsgFailGetRequest request = new PushMsgFailGetRequest(access_token);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        PushMsgFailGetResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getData();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }
}
