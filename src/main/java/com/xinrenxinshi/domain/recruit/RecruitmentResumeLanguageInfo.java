package com.xinrenxinshi.domain.recruit;

public class RecruitmentResumeLanguageInfo {
    // 语种
    private String languageType;
    // 掌握程度
    private Integer depth;
    // 份数
    private String certScore;
    // 听说能力
    private String listenAndSpeak;
    // 读写能力
    private String readAndWrite;
    // 证书名称(如大学英语6级)
    private String certLevel;

    public String getLanguageType() {
        return languageType;
    }

    public void setLanguageType(String languageType) {
        this.languageType = languageType;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getCertScore() {
        return certScore;
    }

    public void setCertScore(String certScore) {
        this.certScore = certScore;
    }

    public String getListenAndSpeak() {
        return listenAndSpeak;
    }

    public void setListenAndSpeak(String listenAndSpeak) {
        this.listenAndSpeak = listenAndSpeak;
    }

    public String getReadAndWrite() {
        return readAndWrite;
    }

    public void setReadAndWrite(String readAndWrite) {
        this.readAndWrite = readAndWrite;
    }

    public String getCertLevel() {
        return certLevel;
    }

    public void setCertLevel(String certLevel) {
        this.certLevel = certLevel;
    }
}
