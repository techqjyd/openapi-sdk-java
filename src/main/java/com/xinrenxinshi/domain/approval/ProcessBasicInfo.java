package com.xinrenxinshi.domain.approval;

/**
 * 审批数据
 *
 * @author: liuchenhui
 * @create: 2019-11-11 14:53
 **/
public class ProcessBasicInfo {
    /**
     * 审批ID
     */
    private Integer id;
    /**
     * 审批所属人的员工Id
     */
    private String ownerId;
    /**
     * 审批所属人姓名
     */
    private String ownerName;
    /**
     * 发起人姓名
     */
    private String sponsorName;
    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 审批类型ID
     */
    private Integer flowTypeId;
    /**
     * 审批类型名称
     */
    private String flowTypeName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 审批状态：
     * 0.审批中、
     * 1.已通过、
     * 2.已驳回、
     * 3.已撤销
     */
    private Integer status;
    /**
     * 离职确认时间
     */
    private String confirmDate;
    /**
     * 审批发起时间
     */
    private Integer addtime;
    /**
     * 审批修改时间
     */
    private Integer modtime;
    /**
     * 审批最后操作时间
     */
    private Integer lastStepModtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getFlowTypeId() {
        return flowTypeId;
    }

    public void setFlowTypeId(Integer flowTypeId) {
        this.flowTypeId = flowTypeId;
    }

    public String getFlowTypeName() {
        return flowTypeName;
    }

    public void setFlowTypeName(String flowTypeName) {
        this.flowTypeName = flowTypeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getModtime() {
        return modtime;
    }

    public void setModtime(Integer modtime) {
        this.modtime = modtime;
    }

    public Integer getLastStepModtime() {
        return lastStepModtime;
    }

    public void setLastStepModtime(Integer lastStepModtime) {
        this.lastStepModtime = lastStepModtime;
    }
}
