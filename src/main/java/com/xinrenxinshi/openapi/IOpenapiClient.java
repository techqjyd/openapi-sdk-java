package com.xinrenxinshi.openapi;

import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.request.OpenapiTokenRequest;
import com.xinrenxinshi.response.EmployeeFileDownloadResponse;
import com.xinrenxinshi.response.OpenapiTokenResponse;

/**
 * 普通HTTP请求接口
 *
 * @author: liuchenhui
 * @create: 2019-10-31 12:00
 **/
public interface IOpenapiClient {


    /**
     * 执行获取token请求。
     *
     * @param request
     * @return
     * @throws ApiException
     */
    OpenapiTokenResponse token(OpenapiTokenRequest request) throws ApiException;

    /**
     * 执行API请求。
     *
     * @param request
     * @param <T>
     * @return
     * @throws ApiException
     */
    <T> OpenapiResponse<T> execute(IOpenapiRequest<T> request) throws ApiException;

    /**
     * 执行文件上传
     *
     * @param request
     * @param <T>
     * @return
     * @throws ApiException
     */
    <T> OpenapiResponse<T> upload(AbstractOpenapiUploadRequest<T> request) throws ApiException;

    /**
     * 执行文件下载
     *
     * @param request
     * @return
     * @throws ApiException
     */
    EmployeeFileDownloadResponse download(IOpenapiRequest request) throws ApiException;
}
