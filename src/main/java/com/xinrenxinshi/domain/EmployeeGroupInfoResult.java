package com.xinrenxinshi.domain;

/**
 * 员工分组返回对象
 *
 * @author hzz on 2022/05/07
 */
public class EmployeeGroupInfoResult {
    /**
     * 分组id
     */
    private String groupId;
    /**
     * 分组名称
     */
    private String groupName;
    /**
     * 是否固定分组 0：非固定，1：固定
     */
    private Integer isFix;


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getIsFix() {
        return isFix;
    }

    public void setIsFix(Integer isFix) {
        this.isFix = isFix;
    }
}
