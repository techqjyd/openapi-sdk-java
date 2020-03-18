package com.xinrenxinshi.domain.recruit;


import java.util.LinkedList;
import java.util.List;

/**
 * <一句话描述>.
 *
 * @author peng cheng
 * @date 2019/10/17
 * @since
 */
public class RecruitRecordInfo {

    /**
     * 简历候选人字段
     */
    private RecruitCandidateInfo recruitCandidateInfo;
    /**
     * 招聘 入职信息 字段
     */
    private RecruitEntryInfo recruitEntryInfo;
    /**
     * 招聘 offer信息字段
     */
    private RecruitOfferInfo recruitOfferInfo;
    /**
     * 招聘 转正信息字段
     */
    private RecruitRegularInfo recruitRegularInfo;
    /**
     * 招聘 推荐信息字段
     */
    private List<RecruitRecommendInfo> recruitRecommendInfos = new LinkedList<>();
    /**
     * 招聘 面试信息字段
     */
    private List<RecruitInterviewInfo> recruitInterviewInfos = new LinkedList<>();

    public RecruitCandidateInfo getRecruitCandidateInfo() {
        return recruitCandidateInfo;
    }

    public void setRecruitCandidateInfo(RecruitCandidateInfo recruitCandidateInfo) {
        this.recruitCandidateInfo = recruitCandidateInfo;
    }

    public RecruitEntryInfo getRecruitEntryInfo() {
        return recruitEntryInfo;
    }

    public void setRecruitEntryInfo(RecruitEntryInfo recruitEntryInfo) {
        this.recruitEntryInfo = recruitEntryInfo;
    }

    public RecruitOfferInfo getRecruitOfferInfo() {
        return recruitOfferInfo;
    }

    public void setRecruitOfferInfo(RecruitOfferInfo recruitOfferInfo) {
        this.recruitOfferInfo = recruitOfferInfo;
    }

    public RecruitRegularInfo getRecruitRegularInfo() {
        return recruitRegularInfo;
    }

    public void setRecruitRegularInfo(RecruitRegularInfo recruitRegularInfo) {
        this.recruitRegularInfo = recruitRegularInfo;
    }

    public List<RecruitRecommendInfo> getRecruitRecommendInfos() {
        return recruitRecommendInfos;
    }

    public void setRecruitRecommendInfos(List<RecruitRecommendInfo> recruitRecommendInfos) {
        this.recruitRecommendInfos = recruitRecommendInfos;
    }

    public List<RecruitInterviewInfo> getRecruitInterviewInfos() {
        return recruitInterviewInfos;
    }

    public void setRecruitInterviewInfos(List<RecruitInterviewInfo> recruitInterviewInfos) {
        this.recruitInterviewInfos = recruitInterviewInfos;
    }

    public RecruitRecordInfo() {
    }

    public RecruitRecordInfo(Builder builder) {
        this.recruitCandidateInfo = builder.recruitCandidateInfo;
        this.recruitEntryInfo = builder.recruitEntryInfo;
        this.recruitOfferInfo = builder.recruitOfferInfo;
        this.recruitRegularInfo = builder.recruitRegularInfo;
        this.recruitRecommendInfos = builder.recruitRecommendInfos;
        this.recruitInterviewInfos = builder.recruitInterviewInfos;
    }

    public static class Builder {
        /**
         * 简历候选人字段
         */
        private RecruitCandidateInfo recruitCandidateInfo;
        /**
         * 招聘 入职信息 字段
         */
        private RecruitEntryInfo recruitEntryInfo;
        /**
         * 招聘 offer信息字段
         */
        private RecruitOfferInfo recruitOfferInfo;
        /**
         * 招聘 转正信息字段
         */
        private RecruitRegularInfo recruitRegularInfo;
        /**
         * 招聘 推荐信息字段
         */
        private List<RecruitRecommendInfo> recruitRecommendInfos = new LinkedList<>();
        /**
         * 招聘 面试信息字段
         */
        private List<RecruitInterviewInfo> recruitInterviewInfos = new LinkedList<>();

        public Builder() {
        }

        public Builder candidate(RecruitCandidateInfo recruitCandidateInfo) {
            this.recruitCandidateInfo = recruitCandidateInfo;
            return this;
        }

        public Builder offer(RecruitOfferInfo recruitOfferInfo) {
            this.recruitOfferInfo = recruitOfferInfo;
            return this;
        }

        public Builder entry(RecruitEntryInfo recruitEntryInfo) {
            this.recruitEntryInfo = recruitEntryInfo;
            return this;
        }

        public Builder regular(RecruitRegularInfo recruitRegularInfo) {
            this.recruitRegularInfo = recruitRegularInfo;
            return this;
        }

        public Builder recommend(List<RecruitRecommendInfo> recruitRecommendInfos) {
            this.recruitRecommendInfos = recruitRecommendInfos;
            return this;
        }

        public Builder interview(List<RecruitInterviewInfo> recruitInterviewInfos) {
            this.recruitInterviewInfos = recruitInterviewInfos;
            return this;
        }

        public RecruitRecordInfo build() {
            return new RecruitRecordInfo(this);
        }
    }
}
