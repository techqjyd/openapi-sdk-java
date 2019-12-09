package com.xinrenxinshi.common;

/**
 * 在职，离职枚举
 *
 * @author: liuchenhui
 * @create: 2019-11-05 11:48
 **/
public enum EmpStatusEnum {
    /**
     * 在职
     */
    ON_JOB(0),
    /**
     * 离职
     */
    OFF_JOB(1);
    private Integer status;

    EmpStatusEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
