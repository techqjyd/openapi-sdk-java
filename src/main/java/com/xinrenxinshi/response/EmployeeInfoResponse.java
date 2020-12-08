package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.EmployeeDetail;

/**
 * 员工信息返回参数
 *
 * @author: liuchenhui
 * @create: 2019-10-30 17:26
 **/
public class EmployeeInfoResponse {

    private EmployeeDetail data;

    public EmployeeDetail getData() {
        return data;
    }

    public void setData(EmployeeDetail data) {
        this.data = data;
    }
}
