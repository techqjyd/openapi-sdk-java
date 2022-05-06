package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.common.LaborTypeEnum;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.common.SimpleHireTypeEnum;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.util.XRXSDateUtils;
import com.xinrenxinshi.util.XRXSStrUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 待入职员工入职操作
 *
 * @author Ke Zhan on 2020/11/18
 */
public class EmployeeEmployedRequest extends AbstractOpenapiJsonRequest<Void> {

    /**
     * 员工ID
     */
    private String employeeId;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工手机号
     */
    private String mobile;

    /**
     * 工作邮箱
     */
    private String email;
    /**
     * 入职日期，格式：yyyy-MM-dd
     */
    private String entryDate;
    /**
     * 雇佣类型 0：正式，1：非正式
     */
    private SimpleHireTypeEnum hireType;
    /**
     * 当hireType=1的时候必填。10-实习,11-劳务,12-顾问,13-返聘,14-外包
     */
    private LaborTypeEnum laborType;
    /**
     * 转正日期
     */
    private String regularDate;
    /**
     * 工号
     */
    private String jobNumber;
    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 性别，1:男，2:女
     */
    private Integer gender;
    /**
     * 岗位ID，对应的是岗位信息接口中的jobId
     */
    private String jobId;
    /**
     * 管理形式，0:总部，1:分城市
     */
    private Integer subjection;
    /**
     * 最高学历，1:初中，2:高中，3:中专，4:大专，5:本科，6:硕士，7:博士，8:其他，9:小学，10:中职，11:中技
     */
    private Integer highestDegree;

    public EmployeeEmployedRequest(String accessToken) {
        super(accessToken);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public SimpleHireTypeEnum getHireType() {
        return hireType;
    }

    public void setHireType(SimpleHireTypeEnum hireType) {
        this.hireType = hireType;
    }

    public LaborTypeEnum getLaborType() {
        return laborType;
    }

    public void setLaborType(LaborTypeEnum laborType) {
        this.laborType = laborType;
    }

    public String getRegularDate() {
        return regularDate;
    }

    public void setRegularDate(String regularDate) {
        this.regularDate = regularDate;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Integer getSubjection() {
        return subjection;
    }

    public void setSubjection(Integer subjection) {
        this.subjection = subjection;
    }

    public Integer getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(Integer highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String, Object> map = new HashMap<>(10);
        map.put("employeeId", employeeId);
        map.put("name", name);
        map.put("mobile", mobile);
        map.put("email",email);
        map.put("entryDate", entryDate);
        map.put("hireType", hireType.getHireType());
        if (laborType != null) {
            map.put("laborType", laborType.getLaborType());
        }
        map.put("regularDate", regularDate);
        map.put("jobNumber", jobNumber);
        map.put("departmentId", departmentId);
        map.put("gender", gender);
        map.put("jobId", jobId);
        map.put("subjection", subjection);
        map.put("highestDegree", highestDegree);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<Void> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public void check() throws ParamNotValidException {
        if (XRXSStrUtils.isEmpty(employeeId)) {
            throw new ParamNotValidException("员工ID为空");
        }
        if (XRXSStrUtils.isEmpty(name)) {
            throw new ParamNotValidException("员工姓名为空");
        }
        if (XRXSStrUtils.isEmpty(mobile)) {
            throw new ParamNotValidException("员工手机号为空");
        }
        if (!XRXSDateUtils.isDateStr(entryDate, Constants.DATE_STRING_FORMAT)) {
            throw new ParamNotValidException("入职时间不符合yyyy-MM-dd格式校验");
        }
        if (hireType.getHireType() == 1 && laborType == null) {
            throw new ParamNotValidException("当hireType=1的时候 laborType 必填");
        }
    }

    @Override
    public TypeReference<OpenapiResponse<Void>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<Void>>() {
        };
    }

    @Override
    public String getBizUrl() {
        return "/v5/employee/entrypending";
    }
}
