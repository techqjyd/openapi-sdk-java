package com.xinrenxinshi.domain.recruit;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : RecruitmentResumeModel
 * @date : 2023/5/8 11:47
 */
public class RecruitmentResumeModel {

    /**
     * 简历上传参数
     */
    private RecruitmentResumeUploadParam uploadParam;

    /**
     * 标准简历信息
     */
    private RecruitmentResumeStandardFieldInfo standardResume;

    public RecruitmentResumeUploadParam getUploadParam() {
        return uploadParam;
    }

    public void setUploadParam(RecruitmentResumeUploadParam uploadParam) {
        this.uploadParam = uploadParam;
    }

    public RecruitmentResumeStandardFieldInfo getStandardResume() {
        return standardResume;
    }

    public void setStandardResume(RecruitmentResumeStandardFieldInfo standardResume) {
        this.standardResume = standardResume;
    }
}
