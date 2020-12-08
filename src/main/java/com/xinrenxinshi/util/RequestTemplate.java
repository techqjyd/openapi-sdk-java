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
    public static <T> T execute(IOpenapiRequest<T> request) throws ApiException {
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse<T> response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getData();
        }
        assert response != null;
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 返回值为 {"errcode":0,"errmsg":"成功"} 类型的接口调用,
     * 没有返回的值 data, 只接口是否调用成功
     */
    public static <T> boolean executeIgnoreData(IOpenapiRequest<T> request) throws ApiException {
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse<T> response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        assert response != null;
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }


}
