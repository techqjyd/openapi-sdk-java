package com.xinrenxinshi.common;

/**
 * 离职类型enum
 *
 * @author: liuchenhui
 * @create: 2019-11-12 10:52
 **/
public enum DismissionTypeEnum {
    /**
     * 主动离职
     */
    TAKE_INITIATIVE_TO_LEAVE(0, "主动离职"),
    /**
     * 被动离职
     */
    PASSIVE_RESIGNATION(1, "被动离职"),
    /**
     * 退休
     */
    RETIRED(2, "退休");

    private Integer dismissionType;
    private String description;

    DismissionTypeEnum(Integer dismissionType, String description) {
        this.dismissionType = dismissionType;
        this.description = description;
    }

    public Integer getDismissionType() {
        return dismissionType;
    }

    public void setDismissionType(Integer dismissionType) {
        this.dismissionType = dismissionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
