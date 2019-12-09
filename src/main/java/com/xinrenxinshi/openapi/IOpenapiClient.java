package com.xinrenxinshi.openapi;

import com.xinrenxinshi.exception.ApiException;

/**
 * 普通HTTP请求接口
 *
 * @author: liuchenhui
 * @create: 2019-10-31 12:00
 **/
public interface IOpenapiClient {

    /**
     * 执行API请求。
     */
    <T extends OpenapiResponse> T execute(IOpenapiRequest<T> request) throws ApiException;

    /**
     * 执行文件上传
     */
    <T extends OpenapiResponse> T upload(AbstractOpenapiUploadRequest<T> request) throws ApiException;

    /**
     * 执行文件下载
     */
    <T extends AbstractOpenapiDownloadResponse> T download(IOpenapiRequest<T> request) throws ApiException;
}
