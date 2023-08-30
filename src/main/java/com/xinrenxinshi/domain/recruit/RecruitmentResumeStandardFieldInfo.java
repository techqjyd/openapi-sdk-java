package com.xinrenxinshi.domain.recruit;

import java.util.List;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : RecruitmentResumeStandardFieldInfo
 * @date : 2023/5/8 11:48
 */
public class RecruitmentResumeStandardFieldInfo  extends RecruitmentResumeBasicInfo{

    /**
     * 简历附件
     */
    private List<RecruitmentResumeAttachmentInfo> attachmentModels;

    /**
     * 简历简要信息
     */
    private RecruitmentResumeBriefInfo resumeBriefModel;
    /**
     * 简历标签
     */
    private RecruitmentResumeTagInfo resumeTagModel;
    /**
     * 求职意向
     */
    private List<RecruitmentResumeJobIntentionInfo> jobIntentionModelList;
    /**
     * 教育经历
     */
    private List<RecruitmentResumeEducationExprienceInfo> educationExperienceModelList;
    /**
     * 语言
     */
    private List<RecruitmentResumeLanguageInfo> languageModelList;
    /**
     * 项目经历
     */
    private List<RecruitmentResumeProjectExperienceInfo> projectExperienceModelList;
    /**
     * 自我评价
     */
    private List<RecruitmentResumeSelfEvaluationInfo> selfEvaluationModelList;
    /**
     * 社交主页
     */
    private List<RecruitmentResumeSocialInfo> socialModelList;
    /**
     * 培训经历
     */
    private List<RecruitmentResumeTrainingExperienceInfo> trainingExperienceModelList;
    /**
     * 工作经历
     */
    private List<RecruitmentResumeWorkExperienceInfo> workExperienceModelList;
    /**
     * 获奖经历
     */
    private List<RecruitmentResumeAwardExperienceInfo> awardExperienceModelList;
    /**
     * 简历亮点
     */
    private List<RecruitmentResumeUnderstandingInfo> understandingModelList;


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

    public List<RecruitmentResumeAttachmentInfo> getAttachmentModels() {
        return attachmentModels;
    }

    public void setAttachmentModels(List<RecruitmentResumeAttachmentInfo> attachmentModels) {
        this.attachmentModels = attachmentModels;
    }
}
