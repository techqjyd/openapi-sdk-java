package com.xinrenxinshi.request;

import com.xinrenxinshi.common.EmpStatusEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.response.EmployeeInfoResponse;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工信息request类
 *
 * @author: liuchenhui
 * @create: 2019-11-05 11:47
 **/
public class EmployeeInfoRequest extends AbstractOpenapiRequest<EmployeeInfoResponse> {
    /**
     * 员工id
     */
    private String employeeId;
    /**
     * 员工状态，默认为0。0:在职员工、1:离职员工
     */
    private EmpStatusEnum status;

    public EmployeeInfoRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public EmpStatusEnum getStatus() {
        return status;
    }

    public void setStatus(EmpStatusEnum status) {
        this.status = status;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_GET;
    }

    @Override
    public Class<EmployeeInfoResponse> getResponseClass() {
        return EmployeeInfoResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工id为空");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v3/employee/details";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("employeeId", employeeId);
        if (status == null) {
            map.put("status", 0);
        } else {
            map.put("status", status.getStatus());
        }
        return map;
    }
}
