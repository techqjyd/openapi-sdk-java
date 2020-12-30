package com.xinrenxinshi.domain;

/**
 * <岗位词典详细信息>.
 *
 * @author peng cheng
 * @date 2020/12/28
 * @since
 */
public class JobDictionaryModel {

    /**
     * 岗位id
     */
    private String jobId;

    /**
     * 岗位所属的分类id
     */
    private String parentId;

    /**
     *  岗位分类 // 0-岗位分类，1-岗位实体
     */
    private Integer type;

    /**
     * 岗位名称
     */
    private String name;

    /**
     * 岗位编码
     */
    private String code;

    /**
     * 岗位备注
     */
    private String remark;

    /**
     * 岗位说明
     */
    private String introduction;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
