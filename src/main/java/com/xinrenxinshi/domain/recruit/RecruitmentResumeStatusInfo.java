package com.xinrenxinshi.domain.recruit;

/**简历状态对象
 * @author hzz on 2022/01/14
 */
public class RecruitmentResumeStatusInfo {

    /**
     * 职位
     */
    private String job;

    /**
     * 渠道名
     */
    private String channelTypeDesc;

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
