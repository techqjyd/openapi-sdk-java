package com.xinrenxinshi.domain.approval;

public class AttendanceTimeRangeInfo {
    private Long id;
    private String planId;
    private String companyId;
    private Integer seqId;
    private String startTime;
    private String endTime;
    private Integer type;
    private Integer workdayType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getWorkdayType() {
        return workdayType;
    }

    public void setWorkdayType(Integer workdayType) {
        this.workdayType = workdayType;
    }
}