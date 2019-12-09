package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;

/**
 * @author: liuchenhui
 * @create: 2019-11-05 12:10
 **/
public class EmployeeFileUploadResponse extends OpenapiResponse {
    /**
     * 文件key，用于更新员工对应文件字段
     */
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
