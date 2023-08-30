package com.xinrenxinshi.domain.recruit;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : TalentBankInfo
 * @date : 2023/5/8 11:46
 */
public class TalentBankInfo {

    /**
     * 人才库分类id
     */
    private Integer id;
    /**
     * 人才库名称
     */
    private String labelName;

    /**
     * 人才库的父分类id 根节点id是 -1
     */
    private Integer parentId;
    /**
     * 权限类型。0:默认；1:公开；2:保密
     */
    private Integer authType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }
}

