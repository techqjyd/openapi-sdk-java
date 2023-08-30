package com.xinrenxinshi.domain.recruit;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : RecruitmentResumeUploadParam
 * @date : 2023/5/8 11:48
 */
public class RecruitmentResumeUploadParam {

    private String applyJobName;

    private Integer talentType;

    private String channelTypeDesc;

    public String getApplyJobName() {
        return applyJobName;
    }

    public void setApplyJobName(String applyJobName) {
        this.applyJobName = applyJobName;
    }

    public Integer getTalentType() {
        return talentType;
    }

    public void setTalentType(Integer talentType) {
        this.talentType = talentType;
    }

    public String getChannelTypeDesc() {
        return channelTypeDesc;
    }

    public void setChannelTypeDesc(String channelTypeDesc) {
        this.channelTypeDesc = channelTypeDesc;
    }
}
