package com.xinrenxinshi.util;

import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.IOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;

/**
 * 请求发送模板
 *
 * @author Ke Zhan on 2020/11/18
 */
public class RequestTemplate {


    /**
     * 发送模板请求, 如果接口调用成功, 返回 data.
     * data 可能为空
     */
    public static <T> OpenapiResponse<T> execute(IOpenapiRequest<T> request) throws ApiException {
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        return openapiClient.execute(request);
    }

}
