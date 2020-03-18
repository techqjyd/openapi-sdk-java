package com.xinrenxinshi.response;

import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.domain.DepartmentModel;

import java.util.List;

/**
 * 部门列表信息response
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:22
 **/
public class DepartmentListResponse extends OpenapiResponse {
    /**
     * 部门信息
     */
    private List<DepartmentModel> department;

    public List<DepartmentModel> getDepartment() {
        return department;
    }

    public void setDepartment(List<DepartmentModel> department) {
        this.department = department;
    }
}
