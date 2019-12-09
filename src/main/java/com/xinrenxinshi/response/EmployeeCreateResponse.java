package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;

/**
 * 员工创建response
 *
 * @author: liuchenhui
 * @create: 2019-11-06 17:23
 **/
public class EmployeeCreateResponse extends OpenapiResponse {
    /**
     * 员工id
     */
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
