package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;

/**
 * 待入职员工创建
 *
 * @author: liuchenhui
 * @create: 2019-11-12 15:04
 **/
public class EmpToBeHiredCreateResponse extends OpenapiResponse {
    /**
     * 员工ID
     */
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
