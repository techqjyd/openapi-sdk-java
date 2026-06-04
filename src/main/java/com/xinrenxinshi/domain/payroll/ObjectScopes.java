package com.xinrenxinshi.domain.payroll;

import java.io.Serializable;

/**
 * @author panhuiwen
 */
public class ObjectScopes implements Serializable {

    private static final long serialVersionUID = -9145914574166078112L;

    private String objectId;
    private String name;
    private int type;
    private int isAbnormal;

    public static final int DEPARTMENT_TYPE = 1;
    public static final int EMPLOYEE_TYPE = 2;
    public static final int HIRE_TYPE = 3;
    public static final int COST_TYPE = 4;
    public static final int CONTRACT = 5;
    public static final int CITY = 6;
    public static final int RANK = 7;
    public static final int JOB = 8;
    public static final int SUBJECTION = 9;
    public static final int INSURANCE_BODY = 10;
    public static final int SOCIAL_INSURANCE_CITY = 11;
    public static final int HOUSE_FUND_BODY = 12;
    public static final int HOUSE_FUND_CITY = 13;

    public ObjectScopes() {
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getIsAbnormal() {
        return isAbnormal;
    }

    public void setIsAbnormal(int isAbnormal) {
        this.isAbnormal = isAbnormal;
    }
}
