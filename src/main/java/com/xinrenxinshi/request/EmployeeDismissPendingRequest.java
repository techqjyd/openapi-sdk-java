package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.DismissionTypeEnum;
import com.xinrenxinshi.common.HouseFundSubEnum;
import com.xinrenxinshi.common.InsuranceSubEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSDateUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

import static com.xinrenxinshi.util.XRXSDateUtils.DATE_FORMAT_NORMAL;
import static com.xinrenxinshi.util.XRXSDateUtils.DATE_FORMAT_YEARMO;

public class EmployeeDismissPendingRequest extends AbstractOpenapiJsonRequest<Object> {

    /**
     * 员工ID
     */
    private String employeeId;
    /**
     * 离职时间,格式2017-03-02
     */
    private String dismissDate;
    /**
     * 离职类型,0表示主动离职,1表示被动离职,2表示退休
     */
    private DismissionTypeEnum dismissionType;
    /**
     * 社保减员月,0表示当月,1表示下月
     */
    private InsuranceSubEnum insuranceSub;
    /**
     * 公积金减员月,0表示当月,1表示下月
     */
    private HouseFundSubEnum houseFundSub;
    /**
     * 离职减员月，格式：yyyyMM
     */
    private String payrollSub;
    /**
     * 员工账号是否可以登陆开关，0关1开
     */
    private Integer employeeLoginSwitch;
    /**
     * 管理员账号是否可以登陆开关，0关1开
     */
    private Integer adminLoginSwitch;

    /**
     * 离职原因
     */
    private String dismissionReason;
    /**
     * 离职备注
     */
    private String dismissRemark;

    public EmployeeDismissPendingRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDismissDate() {
        return dismissDate;
    }

    public void setDismissDate(String dismissDate) {
        this.dismissDate = dismissDate;
    }

    public DismissionTypeEnum getDismissionType() {
        return dismissionType;
    }

    public void setDismissionType(DismissionTypeEnum dismissionType) {
        this.dismissionType = dismissionType;
    }

    public InsuranceSubEnum getInsuranceSub() {
        return insuranceSub;
    }

    public void setInsuranceSub(InsuranceSubEnum insuranceSub) {
        this.insuranceSub = insuranceSub;
    }

    public HouseFundSubEnum getHouseFundSub() {
        return houseFundSub;
    }

    public void setHouseFundSub(HouseFundSubEnum houseFundSub) {
        this.houseFundSub = houseFundSub;
    }

    public String getPayrollSub() {
        return payrollSub;
    }

    public void setPayrollSub(String payrollSub) {
        this.payrollSub = payrollSub;
    }

    public Integer getEmployeeLoginSwitch() {
        return employeeLoginSwitch;
    }

    public void setEmployeeLoginSwitch(Integer employeeLoginSwitch) {
        this.employeeLoginSwitch = employeeLoginSwitch;
    }

    public Integer getAdminLoginSwitch() {
        return adminLoginSwitch;
    }

    public void setAdminLoginSwitch(Integer adminLoginSwitch) {
        this.adminLoginSwitch = adminLoginSwitch;
    }

    public String getDismissionReason() {
        return dismissionReason;
    }

    public void setDismissionReason(String dismissionReason) {
        this.dismissionReason = dismissionReason;
    }

    public String getDismissRemark() {
        return dismissRemark;
    }

    public void setDismissRemark(String dismissRemark) {
        this.dismissRemark = dismissRemark;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Object> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<Object>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Object>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工id为空");
        }
        if (XRXSStrUtils.isEmpty(dismissDate) || !XRXSDateUtils.isDateStr(dismissDate, DATE_FORMAT_NORMAL)) {
            throw new ParamNotValidException("离职时间为空或者时间格式不符合yyyy-MM-dd校验");
        }
        if (dismissionType == null) {
            throw new ParamNotValidException("离职类型为空");
        }
        if (insuranceSub == null) {
            throw new ParamNotValidException("社保减员月为空");
        }
        if (houseFundSub == null) {
            throw new ParamNotValidException("公积金减员月为空");
        }
        if (!XRXSStrUtils.isEmpty(payrollSub) && !XRXSDateUtils.isDateStr(payrollSub, DATE_FORMAT_YEARMO)) {
            throw new ParamNotValidException("离职减员月时间格式不符合yyyyMM校验");
        }
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/dismiss/pending";
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("employeeId", employeeId);
        map.put("dismissDate", dismissDate);
        map.put("dismissionType", dismissionType.getDismissionType());
        map.put("insuranceSub", insuranceSub.getInsuranceSub());
        map.put("houseFundSub", houseFundSub.getHouseFundSub());
        map.put("employeeLoginSwitch",employeeLoginSwitch);
        map.put("adminLoginSwitch",adminLoginSwitch);
        if (!XRXSStrUtils.isEmpty(payrollSub)) {
            map.put("payrollSub", payrollSub);
        }
        if (!XRXSStrUtils.isEmpty(dismissionReason)) {
            map.put("dismissionReason", dismissionReason);
        }
        if (!XRXSStrUtils.isEmpty(dismissRemark)) {
            map.put("dismissRemark", dismissRemark);
        }
        return map;
    }
}
