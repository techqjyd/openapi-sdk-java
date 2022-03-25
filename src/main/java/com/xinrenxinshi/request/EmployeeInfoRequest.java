package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.EmpStatusEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
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
public class EmployeeInfoRequest extends AbstractOpenapiJsonRequest<EmployeeDetail> {
    /**
     * 员工id
     */
    private String employeeId;
    /**
     * 员工手机号和员工id任一必需，两者不能同时为空
     */
    private String mobile;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<EmployeeDetail> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId) && XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("员工id 和 手机号同时为空");
        }
    }

    @Override
    public TypeReference<OpenapiResponse<EmployeeDetail>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<EmployeeDetail>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/detail";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("employeeId", employeeId);
        map.put("mobile", mobile);
        if (status == null) {
            map.put("status", 0);
        } else {
            map.put("status", status.getStatus());
        }
        return map;
    }
}
