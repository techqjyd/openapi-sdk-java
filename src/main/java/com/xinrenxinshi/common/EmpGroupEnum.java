package com.xinrenxinshi.common;

/**
 * <员工分组枚举>
 *
 * @author Ke Zhan on 2020/11/20
 */
public enum EmpGroupEnum {
    /**
     * 合同记录
     */
    CONTRACT_RECORD(1, "合同记录"),
    /**
     * 兼职信息
     */
    PART_TIME_INFO(5, "兼职信息"),
    /**
     * 教育经历
     */
    EDU_EXPERIENCE(7, "教育经历"),
    /**
     * 工作经历
     */
    WORK_EXPERIENCE(8, "工作经历"),
    /**
     * 培训经历
     */
    TRAINING_EXPERIENCE(9, "培训经历"),
    /**
     * 证书记录
     */
    CERTIFICATE_RECORD(10, "证书记录"),
    /**
     * 联系人记录
     */
    CONTACT_RECORD(11, "联系人记录");

    private int code;
    private String description;

    EmpGroupEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
