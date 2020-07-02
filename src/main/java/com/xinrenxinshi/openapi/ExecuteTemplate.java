package com.xinrenxinshi.openapi;

import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.response.OpenApiResponseAdapter;

import java.util.function.Supplier;

/**
 * @author wangyuan
 * @date 2020/7/2 下午4:39
 */
public class ExecuteTemplate {

    /**
     * 服务执行模版
     *
     * @param supplier 服务
     * @return 执行结果
     * @throws ApiException 统一异常
     */
    public static <T> T execute(Supplier<IOpenapiRequest<OpenApiResponseAdapter<T>>> supplier) throws ApiException {
        IOpenapiRequest<OpenApiResponseAdapter<T>> request = supplier.get();
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        OpenApiResponseAdapter<T> response = instance.execute(request);
        if (response.getErrcode() == 0) {
            return response.getData();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 无结果服务执行模版
     *
     * @param runnable 服务
     * @throws ApiException 统一异常
     */
    public static void executeNoResult(Runnable runnable) throws ApiException {
        execute(() -> {
            runnable.run();
            return null;
        });
    }

}
