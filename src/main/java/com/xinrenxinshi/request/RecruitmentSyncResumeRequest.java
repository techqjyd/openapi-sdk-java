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

    public List<RecruitmentResumeAttachmentModel> getAttachmentModels() {
        return attachmentModels;
    }

    public void setAttachmentModels(List<RecruitmentResumeAttachmentModel> attachmentModels) {
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
