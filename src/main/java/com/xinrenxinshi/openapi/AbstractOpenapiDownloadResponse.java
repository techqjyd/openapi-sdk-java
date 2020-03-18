package com.xinrenxinshi.openapi;

import java.io.InputStream;

/**
 * @author: liuchenhui
 * @create: 2019-11-13 18:07
 **/
public abstract class AbstractOpenapiDownloadResponse extends OpenapiResponse {
    /**
     * 下载的文件流
     */
    private InputStream inputStream;

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
