package com.xinrenxinshi.domain;

/**
 * <一句话描述> <详细介绍>
 *
 * @author: liuchenhui
 * @create: 2019-11-11 17:51
 **/
public class EmployeeSimple {
    /**
     * 员工ID
     */
    public String employeeId;
    /**
     * 员工名字
     */
    public String name;
    /**
     * 手机号
     */
    public String mobile;

    /**
     * 入职时间
     */
    public String entryDate;
    /**
     * 聘用类型
     */
    public Integer hireType;
    /**
     * 员工状态
     */
    public Integer status;

    /**
     * 添加时间
     */
    private Integer addtime;

    /**
     * 更新时间
     */
    private Integer modtime;

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getModtime() {
        return modtime;
    }

    public void setModtime(Integer modtime) {
        this.modtime = modtime;
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

    public Integer getHireType() {
        return hireType;
    }

    public void setHireType(Integer hireType) {
        this.hireType = hireType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
