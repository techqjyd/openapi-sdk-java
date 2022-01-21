package com.xinrenxinshi.request;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.MethodEnum;
import com.xinrenxinshi.domain.recruit.*;
import com.xinrenxinshi.exception.ParamNotValidException;
import com.xinrenxinshi.openapi.AbstractOpenapiJsonRequest;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 招聘添加简历request
 *
 * @author: hzz
 * @create: 2022-01-14
 **/
public class RecruitmentSyncResumeRequest extends AbstractOpenapiJsonRequest<String> {

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
    private List<RecruitmentResumeAttachmentInfo> attachmentModels;
    private String industry;
    private String skill;
    private String interesting;
    private String remark;
    private Integer videoResumeMark;
    private List<RecruitmentResumeStatusInfo> statusModelList;
    private RecruitmentResumeBriefInfo resumeBriefModel;
    private RecruitmentResumeTagInfo resumeTagModel;
    private List<RecruitmentResumeJobIntentionInfo> jobIntentionModelList;
    private List<RecruitmentResumeEducationExprienceInfo> educationExperienceModelList;
    private List<RecruitmentResumeLanguageInfo> languageModelList;
    private List<RecruitmentResumeProjectExperienceInfo> projectExperienceModelList;
    private List<RecruitmentResumeSelfEvaluationInfo> selfEvaluationModelList;
    private List<RecruitmentResumeSocialInfo> socialModelList;
    private List<RecruitmentResumeTrainingExperienceInfo> trainingExperienceModelList;
    private List<RecruitmentResumeWorkExperienceInfo> workExperienceModelList;
    private List<RecruitmentResumeAwardExperienceInfo> awardExperienceModelList;
    private List<RecruitmentResumeUnderstandingInfo> understandingModelList;

    public RecruitmentSyncResumeRequest(String accessToken){
        super(accessToken);
    }

    @Override
    protected Map<String, Object> getParamMap0() {
        Map<String,Object> map = new HashMap<>(10);
        map.put("name",name);
        map.put("mobile",mobile);
        map.put("email",email);
        map.put("headImage",headImage);
        map.put("sex",sex);
        map.put("birthDate",birthDate);
        map.put("workStartDate",workStartDate);
        map.put("workAge",workAge);
        map.put("lastCompany",lastCompany);
        map.put("lastJob",lastJob);
        map.put("degree",degree);
        map.put("school",school);
        map.put("schoolType",schoolType);
        map.put("major",major);
        map.put("birthPlace",birthPlace);
        map.put("liveCity",liveCity);
        map.put("politicalStatus",politicalStatus);
        map.put("nation",nation);
        map.put("marriage",marriage);
        map.put("resume",resume);
        map.put("resumePreview",resumePreview);
        map.put("attachmentModels",attachmentModels);
        map.put("industry",industry);
        map.put("skill",skill);
        map.put("remark",remark);
        map.put("videoResumeMark",videoResumeMark);
        map.put("statusModelList",statusModelList);
        map.put("resumeBriefModel",resumeBriefModel);
        map.put("resumeTagModel",resumeTagModel);
        map.put("jobIntentionModelList",jobIntentionModelList);
        map.put("educationExperienceModelList",educationExperienceModelList);
        map.put("languageModelList",languageModelList);
        map.put("projectExperienceModelList",projectExperienceModelList);
        map.put("selfEvaluationModelList",selfEvaluationModelList);
        map.put("socialModelList",socialModelList);
        map.put("trainingExperienceModelList",trainingExperienceModelList);
        map.put("workExperienceModelList",workExperienceModelList);
        map.put("awardExperienceModelList",awardExperienceModelList);
        map.put("understandingModelList",understandingModelList);
        return map;
    }

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.METHOD_POST;
    }

    @Override
    public OpenapiResponse<String> getResponseClass() {
        return new OpenapiResponse<>();
    }

    @Override
    public TypeReference<OpenapiResponse<String>> getResponseTypeRef() {
        return new TypeReference<OpenapiResponse<String>>() {
        };
    }

    @Override
    public void check() throws ParamNotValidException {

    }

    @Override
    public String getBizUrl() {
        return "/v5/recruitment/addRecruitmentResume";
    }

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

    public List<RecruitmentResumeAttachmentInfo> getAttachmentModels() {
        return attachmentModels;
    }

    public void setAttachmentModels(List<RecruitmentResumeAttachmentInfo> attachmentModels) {
        this.attachmentModels = attachmentModels;
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

    public List<RecruitmentResumeStatusInfo> getStatusModelList() {
        return statusModelList;
    }

    public void setStatusModelList(List<RecruitmentResumeStatusInfo> statusModelList) {
        this.statusModelList = statusModelList;
    }

    public RecruitmentResumeBriefInfo getResumeBriefModel() {
        return resumeBriefModel;
    }

    public void setResumeBriefModel(RecruitmentResumeBriefInfo resumeBriefModel) {
        this.resumeBriefModel = resumeBriefModel;
    }

    public RecruitmentResumeTagInfo getResumeTagModel() {
        return resumeTagModel;
    }

    public void setResumeTagModel(RecruitmentResumeTagInfo resumeTagModel) {
        this.resumeTagModel = resumeTagModel;
    }

    public List<RecruitmentResumeJobIntentionInfo> getJobIntentionModelList() {
        return jobIntentionModelList;
    }

    public void setJobIntentionModelList(List<RecruitmentResumeJobIntentionInfo> jobIntentionModelList) {
        this.jobIntentionModelList = jobIntentionModelList;
    }

    public List<RecruitmentResumeEducationExprienceInfo> getEducationExperienceModelList() {
        return educationExperienceModelList;
    }

    public void setEducationExperienceModelList(List<RecruitmentResumeEducationExprienceInfo> educationExperienceModelList) {
        this.educationExperienceModelList = educationExperienceModelList;
    }

    public List<RecruitmentResumeLanguageInfo> getLanguageModelList() {
        return languageModelList;
    }

    public void setLanguageModelList(List<RecruitmentResumeLanguageInfo> languageModelList) {
        this.languageModelList = languageModelList;
    }

    public List<RecruitmentResumeProjectExperienceInfo> getProjectExperienceModelList() {
        return projectExperienceModelList;
    }

    public void setProjectExperienceModelList(List<RecruitmentResumeProjectExperienceInfo> projectExperienceModelList) {
        this.projectExperienceModelList = projectExperienceModelList;
    }

    public List<RecruitmentResumeSelfEvaluationInfo> getSelfEvaluationModelList() {
        return selfEvaluationModelList;
    }

    public void setSelfEvaluationModelList(List<RecruitmentResumeSelfEvaluationInfo> selfEvaluationModelList) {
        this.selfEvaluationModelList = selfEvaluationModelList;
    }

    public List<RecruitmentResumeSocialInfo> getSocialModelList() {
        return socialModelList;
    }

    public void setSocialModelList(List<RecruitmentResumeSocialInfo> socialModelList) {
        this.socialModelList = socialModelList;
    }

    public List<RecruitmentResumeTrainingExperienceInfo> getTrainingExperienceModelList() {
        return trainingExperienceModelList;
    }

    public void setTrainingExperienceModelList(List<RecruitmentResumeTrainingExperienceInfo> trainingExperienceModelList) {
        this.trainingExperienceModelList = trainingExperienceModelList;
    }

    public List<RecruitmentResumeWorkExperienceInfo> getWorkExperienceModelList() {
        return workExperienceModelList;
    }

    public void setWorkExperienceModelList(List<RecruitmentResumeWorkExperienceInfo> workExperienceModelList) {
        this.workExperienceModelList = workExperienceModelList;
    }

    public List<RecruitmentResumeAwardExperienceInfo> getAwardExperienceModelList() {
        return awardExperienceModelList;
    }

    public void setAwardExperienceModelList(List<RecruitmentResumeAwardExperienceInfo> awardExperienceModelList) {
        this.awardExperienceModelList = awardExperienceModelList;
    }

    public List<RecruitmentResumeUnderstandingInfo> getUnderstandingModelList() {
        return understandingModelList;
    }

    public void setUnderstandingModelList(List<RecruitmentResumeUnderstandingInfo> understandingModelList) {
        this.understandingModelList = understandingModelList;
    }
}
