package com.xinrenxinshi.domain.recruit;

public class RecruitmentResumeTrainingExperienceModel {
    /**
     * 开始时间
     */
    private String startDate;
    /**
     * 结束时间
     */
    private String endDate;
    /**
     * 培训机构
     */
    private String training;
    /**
     * 培训课程
     */
    private String trainingCourse;
    /**
     * 培训描述
     */
    private String trainingDetail;
    /**
     * 培训认证
     */
    private String name;
    /**
     * 培训地点
     */
    private String location;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public String getTrainingCourse() {
        return trainingCourse;
    }

    public void setTrainingCourse(String trainingCourse) {
        this.trainingCourse = trainingCourse;
    }

    public String getTrainingDetail() {
        return trainingDetail;
    }

    public void setTrainingDetail(String trainingDetail) {
        this.trainingDetail = trainingDetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
