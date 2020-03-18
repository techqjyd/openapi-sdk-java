package com.xinrenxinshi.domain.recruit;


/**
 * <招聘转正信息>.
 *
 * @author peng cheng
 * @date 2019/10/17
 * @since
 */
public class RecruitRegularInfo {

    /**
     * 是否转正
     */
    private String isRegular;
    /**
     * 转正日期
     */
    private String regularTime;
    /**
     * 转正评价
     */
    private String regularJudgement;

    public String getIsRegular() {
        return isRegular;
    }

    public void setIsRegular(String isRegular) {
        this.isRegular = isRegular;
    }

    public String getRegularTime() {
        return regularTime;
    }

    public void setRegularTime(String regularTime) {
        this.regularTime = regularTime;
    }

    public String getRegularJudgement() {
        return regularJudgement;
    }

    public void setRegularJudgement(String regularJudgement) {
        this.regularJudgement = regularJudgement;
    }
}
