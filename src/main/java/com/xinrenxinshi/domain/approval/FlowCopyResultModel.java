package com.xinrenxinshi.domain.approval;

/**
 * 抄送人信息返回结果
 *
 * @author hzz
 * @date 2022/5/6
 * @since
 */
public class FlowCopyResultModel {

    /**
     * 抄送人id
     */
    private String copyPersonId;

    /**
     * 审批人名字
     */
    private String name;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 排序用的 也是前端的唯一id
     */
    private Integer position;

    /**
     * 备注
     */
    private String remark;

    public String getCopyPersonId() {
        return copyPersonId;
    }

    public void setCopyPersonId(String copyPersonId) {
        this.copyPersonId = copyPersonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
