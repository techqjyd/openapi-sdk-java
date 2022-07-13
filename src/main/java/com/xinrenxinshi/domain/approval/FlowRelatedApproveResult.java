package com.xinrenxinshi.domain.approval;

public class FlowRelatedApproveResult {
    private Long id;//审批id
    private String title;//审批标题
    private String flowName;//审批类型名称
    private String flowNumber;//审批编号
    private String relatedDate;//发起时间
    private Integer status;//审批状态
    private String statusName;//审批状态名称
    private String currentTab;//数据来源tab页，myApply.我发起的、waitApply.待处理、endApprove.已处理

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public String getFlowNumber() {
        return flowNumber;
    }

    public void setFlowNumber(String flowNumber) {
        this.flowNumber = flowNumber;
    }

    public String getRelatedDate() {
        return relatedDate;
    }

    public void setRelatedDate(String relatedDate) {
        this.relatedDate = relatedDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getCurrentTab() {
        return currentTab;
    }

    public void setCurrentTab(String currentTab) {
        this.currentTab = currentTab;
    }
}
