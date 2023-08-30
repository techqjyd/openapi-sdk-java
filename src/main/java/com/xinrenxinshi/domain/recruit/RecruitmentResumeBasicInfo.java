package com.xinrenxinshi.domain.recruit;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : RecruitmentResumeBasicInfo
 * @date : 2023/5/8 11:50
 */
public class RecruitmentResumeBasicInfo {
    /**
     * 候选人姓名
     */
    private String name;
    /**
     * 候选人手机号
     */
    private String mobile;
    /**
     * 候选人邮箱
     */
    private String email;
    /**
     * 候选人头像url
     */
    private String headImage;
    private Integer sex;
    /**
     * 出生日期,格式:yyyy-MM-dd
     */
    private String birthDate;
    /**
     * 工作开始时间 ,格式:yyyy-MM
     */
    private String workStartDate;
    /**
     * 工作年限
     */
    private Integer workAge;
    /**
     * 最近受聘公司
     */
    private String lastCompany;

    /**
     * 最近工作职位
     */
    private String lastJob;
    /**
     * 学历,0-无学历,1-初中,2-高中,3-中专,4-大专,5-本科,6-硕士,7-博士,8-其他,9-小学,10-中职,11-中技
     */
    private Integer degree;
    /**
     * 学校
     */
    private String school;
    /**
     * 学校类型，分为 普通院校 ,985院校 , 211院校 , 港澳台院校 , 国外院校 , 中学 , 职业教育 , 培训机构 , 985211双一流院校 , 985211院校 , 985双一流院校 , 211_双一流院校
     */
    private String schoolType;
    /**
     * 最近毕业专业
     */
    private String major;
    /**
     * 籍贯，传城市id，通过通用接口查询城市id
     */
    private Integer birthPlace;
    /**
     * 居住城市
     */
    private String liveCity;
    /**
     * 政治面貌
     */
    private String politicalStatus;
    /**
     * 民族
     */
    private String nation;
    /**
     * 婚姻状态，0-无，1-未婚，2-已婚，3-离异
     */
    private Integer marriage;
    /**
     * 原始简历url，支持支持PDF、DOC、DOCX、JPG、JPEG、PNG、BMP、PPT、PPTX等格式，必须是可下载的链接
     */
    private String resume;
    /**
     * 简历预览文件url
     */
    private String resumePreview;

    /**
     * 所在行业
     */
    private String industry;
    /**
     * 技能
     */
    private String skill;
    /**
     * 兴趣爱好
     */
    private String interesting;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否是视频面试  0 不是 1 是
     */
    private Integer videoResumeMark = 0;


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
}
