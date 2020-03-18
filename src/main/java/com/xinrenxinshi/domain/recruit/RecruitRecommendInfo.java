package com.xinrenxinshi.domain.recruit;


/**
 * <招聘推荐信息>.
 *
 * @author peng cheng
 * @date 2019/10/17
 * @since
 */
public class RecruitRecommendInfo {

    /**
     * 推荐时间
     */
    private String recommendTime;
    /**
     * 推荐负责人
     */
    private String recommendAccount;
    /**
     * 推荐面试官
     */
    private String recommendEmployee;
    /**
     * 推荐结果
     */
    private String recommendPass;
    /**
     * 推荐反馈时间
     */
    private String recommendFeedBackTime;


    public String getRecommendTime() {
        return recommendTime;
    }

    public void setRecommendTime(String recommendTime) {
        this.recommendTime = recommendTime;
    }

    public String getRecommendAccount() {
        return recommendAccount;
    }

    public void setRecommendAccount(String recommendAccount) {
        this.recommendAccount = recommendAccount;
    }

    public String getRecommendEmployee() {
        return recommendEmployee;
    }

    public void setRecommendEmployee(String recommendEmployee) {
        this.recommendEmployee = recommendEmployee;
    }

    public String getRecommendPass() {
        return recommendPass;
    }

    public void setRecommendPass(String recommendPass) {
        this.recommendPass = recommendPass;
    }

    public String getRecommendFeedBackTime() {
        return recommendFeedBackTime;
    }

    public void setRecommendFeedBackTime(String recommendFeedBackTime) {
        this.recommendFeedBackTime = recommendFeedBackTime;
    }
}
