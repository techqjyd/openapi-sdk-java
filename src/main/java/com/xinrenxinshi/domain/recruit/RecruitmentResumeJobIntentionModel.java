package com.xinrenxinshi.domain.recruit;

public class RecruitmentResumeJobIntentionModel {
    private Integer jobNature;
    private String workPosition;
    private String expectedJob;
    private String onboardTime;
    private String expectSalary;
    private Integer entryTime;
    private String expectIndustry;

    public Integer getJobNature() {
        return jobNature;
    }

    public void setJobNature(Integer jobNature) {
        this.jobNature = jobNature;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public String getExpectedJob() {
        return expectedJob;
    }

    public void setExpectedJob(String expectedJob) {
        this.expectedJob = expectedJob;
    }

    public String getOnboardTime() {
        return onboardTime;
    }

    public void setOnboardTime(String onboardTime) {
        this.onboardTime = onboardTime;
    }

    public String getExpectSalary() {
        return expectSalary;
    }

    public void setExpectSalary(String expectSalary) {
        this.expectSalary = expectSalary;
    }

    public Integer getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Integer entryTime) {
        this.entryTime = entryTime;
    }

    public String getExpectIndustry() {
        return expectIndustry;
    }

    public void setExpectIndustry(String expectIndustry) {
        this.expectIndustry = expectIndustry;
    }
}
