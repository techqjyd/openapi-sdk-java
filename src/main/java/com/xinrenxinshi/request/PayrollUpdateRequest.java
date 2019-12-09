package com.xinrenxinshi.request;

import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.payroll.EmployeePayroll;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.JsonUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 更新工资项request
 *
 * @author: liuchenhui
 * @create: 2019-11-14 15:52
 **/
public class PayrollUpdateRequest extends AbstractOpenapiRequest<OpenapiResponse> {
    /**
     * 需要更新的员工及工资数据
     */
    private List<EmployeePayroll> employeePayrolls;

    public PayrollUpdateRequest(String accessToken) {
        super(accessToken);
    }

    public List<EmployeePayroll> getEmployeePayrolls() {
        return employeePayrolls;
    }

    public void setEmployeePayrolls(List<EmployeePayroll> employeePayrolls) {
        this.employeePayrolls = employeePayrolls;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>();
        map.put("employeePayrolls", JsonUtils.toJson(employeePayrolls));
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public Class<OpenapiResponse> getResponseClass() {
        return OpenapiResponse.class;
    }

    @Override
    public void check() throws ParamNotValidException {
        if (employeePayrolls == null) {
            throw new ParamNotValidException("更新员工工资项请求参数为空");
        }
        for (EmployeePayroll employeePayroll : employeePayrolls) {
            String employeeId = employeePayroll.getEmployeeId();
            if (XRXSStrUtils.isEmpty(employeeId)) {
                throw new ParamNotValidException("需要更新工资项的员工ID为空");
            }
        }
    }

    @Override
    public String getBizUrl() {
        return "/v3/payroll/update";
    }
}
