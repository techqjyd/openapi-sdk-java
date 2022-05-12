package com.xinrenxinshi.domain.approval;

/**
 * 审批人信息返回结果
 *
 * @author hzz
 * @date 2022/5/6
 * @since
 */
public class FlowApproveResultModel {

    /**
     * 审批人id
     */
    private String approveId;

    /**
     * 审批人名字
     */
    private String name;

    /**
     * 0审批中 1同意 2驳回 3转发 8等待
     */
    private Integer status;

    /**
     * 角色名
     */
    private String roleName;


    /**
     * 时间
     */
    private String time;

    /**
     * 排序用的 也是前端的唯一id
     */
    private Integer position;

    /**
     * 备注
     */
    private String remark;

    /**
     * 审批通过签名
     */
    private String sign;

    /**
     * 代理人信息
     */
    private String agentInfo;

    public String getApproveId() {
        return approveId;
    }

    public void setApproveId(String approveId) {
        this.approveId = approveId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAgentInfo() {
        return agentInfo;
    }

    public void setAgentInfo(String agentInfo) {
        this.agentInfo = agentInfo;
    }
}
