package com.xinrenxinshi.domain.recruit;

import java.util.List;

/**简历上传对象
 * @author hzz on 2022/01/14
 */
public class RecruitmentResumeParamModel {

    private String name;
    private String mobile;
    private String email;
    private String headImage;
    private Integer sex;
    private String birthDate;
    private String workStartDate;
    private Integer workAge;
    private String lastCompany;
    private String lastJob;
    private Integer degree;
    private String school;
    private String schoolType;
    private String major;
    private Integer birthPlace;
    private String liveCity;
    private String politicalStatus;
    private String nation;
    private Integer marriage;
    private String resume;
    private String resumePreview;
    private List<RecruitmentResumeAttachmentModel> attachmentModels;
    private String industry;
    private String skill;
    private String interesting;
    private String remark;
    private Integer videoResumeMark;
    private List<RecruitmentResumeStatusModel> statusModelList;
    private RecruitmentResumeBriefModel resumeBriefModel;
    private RecruitmentResumeTagModel resumeTagModel;
    private List<RecruitmentResumeJobIntentionModel> jobIntentionModelList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(String workStartDate) {
        this.workStartDate = workStartDate;
    }

    public Integer getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Integer workAge) {
        this.workAge = workAge;
    }

    public String getLastCompany() {
        return lastCompany;
    }

    public void setLastCompany(String lastCompany) {
        this.lastCompany = lastCompany;
    }

    public String getLastJob() {
        return lastJob;
    }

    public void setLastJob(String lastJob) {
        this.lastJob = lastJob;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(Integer birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getLiveCity() {
        return liveCity;
    }

    public void setLiveCity(String liveCity) {
        this.liveCity = liveCity;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getMarriage() {
        return marriage;
    }

    public void setMarriage(Integer marriage) {
        this.marriage = marriage;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getResumePreview() {
        return resumePreview;
    }

    public void setResumePreview(String resumePreview) {
        this.resumePreview = resumePreview;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getInteresting() {
        return interesting;
    }

    public void setInteresting(String interesting) {
        this.interesting = interesting;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getVideoResumeMark() {
        return videoResumeMark;
    }

    public void setVideoResumeMark(Integer videoResumeMark) {
        this.videoResumeMark = videoResumeMark;
    }

    public List<RecruitmentResumeAttachmentModel> getAttachmentModels() {
        return attachmentModels;
    }

    public void setAttachmentModels(List<RecruitmentResumeAttachmentModel> attachmentModels) {
        this.attachmentModels = attachmentModels;
    }

    public List<RecruitmentResumeStatusModel> getStatusModelList() {
        return statusModelList;
    }

    public void setStatusModelList(List<RecruitmentResumeStatusModel> statusModelList) {
        this.statusModelList = statusModelList;
    }

    public RecruitmentResumeBriefModel getResumeBriefModel() {
        return resumeBriefModel;
    }

    public void setResumeBriefModel(RecruitmentResumeBriefModel resumeBriefModel) {
        this.resumeBriefModel = resumeBriefModel;
    }

    public RecruitmentResumeTagModel getResumeTagModel() {
        return resumeTagModel;
    }

    public void setResumeTagModel(RecruitmentResumeTagModel resumeTagModel) {
        this.resumeTagModel = resumeTagModel;
    }

    public List<RecruitmentResumeJobIntentionModel> getJobIntentionModelList() {
        return jobIntentionModelList;
    }

    public void setJobIntentionModelList(List<RecruitmentResumeJobIntentionModel> jobIntentionModelList) {
        this.jobIntentionModelList = jobIntentionModelList;
    }
}
