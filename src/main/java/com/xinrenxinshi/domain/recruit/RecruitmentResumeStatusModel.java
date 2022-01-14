package com.xinrenxinshi.domain.recruit;

/**简历状态对象
 * @author hzz on 2022/01/14
 */
public class RecruitmentResumeStatusModel {
    /**
     * 简历库
     */
    private Integer resumeLibrary;

    /**
     * 简历库下的分类
     */
    private Integer resumeLibraryType;

    /**
     * 简历状态
     */
    private Integer resumeLibraryStatus;

    /**
     * 简历来源
     */
    private Integer sourceType;

    /**
     * 投递时间
     */
    private Integer applyTime;

    /**
     * 应聘职位
     */
    private String applyJobId;

    /**
     * 渠道名
     */
    private String channelTypeDesc;



    public Integer getResumeLibrary() {
        return resumeLibrary;
    }

    public void setResumeLibrary(Integer resumeLibrary) {
        this.resumeLibrary = resumeLibrary;
    }


    public Integer getResumeLibraryType() {
        return resumeLibraryType;
    }

    public void setResumeLibraryType(Integer resumeLibraryType) {
        this.resumeLibraryType = resumeLibraryType;
    }

    public Integer getResumeLibraryStatus() {
        return resumeLibraryStatus;
    }

    public void setResumeLibraryStatus(Integer resumeLibraryStatus) {
        this.resumeLibraryStatus = resumeLibraryStatus;
    }



    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

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
}
