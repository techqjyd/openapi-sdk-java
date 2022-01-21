package com.xinrenxinshi.domain.recruit;

/**简历状态对象
 * @author hzz on 2022/01/14
 */
public class RecruitmentResumeStatusInfo {

    /**
     * 投递时间
     */
    private Integer applyTime;

    /**
     * 应聘职位
     */
    private String applyJobId;

    private String job;

    /**
     * 渠道名
     */
    private String channelTypeDesc;

    public Integer getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Integer applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyJobId() {
        return applyJobId;
    }

    public void setApplyJobId(String applyJobId) {
        this.applyJobId = applyJobId;
    }

    public String getChannelTypeDesc() {
        return channelTypeDesc;
    }

    public void setChannelTypeDesc(String channelTypeDesc) {
        this.channelTypeDesc = channelTypeDesc;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
