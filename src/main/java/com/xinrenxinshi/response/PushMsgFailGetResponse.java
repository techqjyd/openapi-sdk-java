package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.ExternalFailMsgModel;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * 失败消息获取response
 *
 * @author: liuchenhui
 * @create: 2019-11-14 17:14
 **/
public class PushMsgFailGetResponse extends OpenapiResponse {
    /**
     * 失败消息列表
     */
    private List<ExternalFailMsgModel> data;

    public List<ExternalFailMsgModel> getData() {
        return data;
    }

    public void setData(List<ExternalFailMsgModel> data) {
        this.data = data;
    }
}

