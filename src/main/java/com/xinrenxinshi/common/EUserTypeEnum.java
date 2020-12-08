package com.xinrenxinshi.common;

/**
 * <免登的用户类型>.
 *
 * @author peng cheng
 * @date 2020/11/26
 * @since
 */
public enum EUserTypeEnum {

    /**
     * 身份类型
     */
    EMPLOYEE(0, "员工"),
    ADMIN(1, "管理员"),
    ADMIN_FIRST(2, "管理员优先");
    /**
     * 身份类型
     */
    private Integer userType;
    /**
     * 描述
     */
    private String desc;

    EUserTypeEnum(Integer userType, String desc) {
        this.userType = userType;
        this.desc = desc;
    }

    public Integer getUserType() {
        return userType;
    }

    public String getDesc() {
        return desc;
    }
}
