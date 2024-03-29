package com.xinrenxinshi.domain.recruit;

public class RecruitmentResumeEducationExprienceInfo {
    // 开始时间
    private String startDate;
    // 结束时间
    private String endDate;
    // 学校名称
    private String school;
    // 专业
    private String major;
    // 学历
    private Integer degree;
    // 学历描述
    private String degreeDesc;
    // 班级排名
    private String classRank;
    // 院系
    private String collegeName;
    // 教育机构地点
    private String eduLocation;
    // 教育性质,如在职,统招,自考,成人,专升本,全日制,交换生,自学等
    private String eduNature;
    // 是否统招
    private Integer isTongzhao;
    // 学校参考排名（国内）
    private Integer schoolRank;
    // 学校类型. 0 普通院校 1 985院校 2 211院校 3 港澳台院校 4 国外院校 5 中学 6 职业教育 7 培训机构 8 985_211_双一流院校 9 985_211院校 10 985_双一流院校 11 211_双一流院校
    private String schoolType;
    // 毕业设计/论文
    private String thesis;
    // 是否是最高学历 1是 0否
    private Integer isHighestDegree;

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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getDegreeDesc() {
        return degreeDesc;
    }

    public void setDegreeDesc(String degreeDesc) {
        this.degreeDesc = degreeDesc;
    }

    public String getClassRank() {
        return classRank;
    }

    public void setClassRank(String classRank) {
        this.classRank = classRank;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getEduLocation() {
        return eduLocation;
    }

    public void setEduLocation(String eduLocation) {
        this.eduLocation = eduLocation;
    }

    public String getEduNature() {
        return eduNature;
    }

    public void setEduNature(String eduNature) {
        this.eduNature = eduNature;
    }

    public Integer getIsTongzhao() {
        return isTongzhao;
    }

    public void setIsTongzhao(Integer isTongzhao) {
        this.isTongzhao = isTongzhao;
    }

    public Integer getSchoolRank() {
        return schoolRank;
    }

    public void setSchoolRank(Integer schoolRank) {
        this.schoolRank = schoolRank;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }


    public Integer getIsHighestDegree() {
        return isHighestDegree;
    }

    public void setIsHighestDegree(Integer isHighestDegree) {
        this.isHighestDegree = isHighestDegree;
    }
}
