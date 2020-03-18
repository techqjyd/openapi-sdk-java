package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.FreeLoginToken;

/**
 * 免登token获取response
 *
 * @author: liuchenhui
 * @create: 2019-11-06 18:18
 **/
public class FreeLoginTokenGetResponse extends OpenapiResponse {
    /**
     * 返回数据
     */
    private FreeLoginToken data;

    public FreeLoginToken getData() {
        return data;
    }

    public void setData(FreeLoginToken data) {
        this.data = data;
    }
}
