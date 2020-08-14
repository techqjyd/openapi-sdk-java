package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;

/**
 * 出差打卡response
 *
 * @author: jiazijie
 * @create: 2019-11-12 11:45
 **/
public class AttendanceTravelResponse extends OpenapiResponse {
    /**
     * 出差记录ID
     */
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
