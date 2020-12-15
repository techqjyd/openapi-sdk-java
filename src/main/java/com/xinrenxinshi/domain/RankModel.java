package com.xinrenxinshi.domain;

/**
 * 职级相关model
 */
public class RankModel {
    /**
     * 职级id
     */
    private String rankId;

    /**
     * 等级id
     */
    private String levelId;

    /**
     * 等级编码
     */
    private String levelCode;

    /**
     * 父等级id
     */
    private String parentLevelId;

    /**
     * 职类id
     */
    private String categoryId;

    /**
     * 职级名称
     */
    private String name;

    /**
     * 职务
     */
    private String title;

    /**
     * 通用能力
     */
    private String generalAbility;

    /**
     * 专业能力
     */
    private String professionalAbility;

    /**
     * 核心价值
     */
    private String coreValue;

    /**
     * 该职级的人数
     */
    private Integer num;

    /**
     * 该职级在该职类下，所占百分比
     */
    private String rate;

    public RankModel(){
    }



    public String getRankId() {
        return rankId;
    }

    public void setRankId(String rankId) {
        this.rankId = rankId;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getParentLevelId() {
        return parentLevelId;
    }

    public void setParentLevelId(String parentLevelId) {
        this.parentLevelId = parentLevelId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGeneralAbility() {
        return generalAbility;
    }

    public void setGeneralAbility(String generalAbility) {
        this.generalAbility = generalAbility;
    }

    public String getProfessionalAbility() {
        return professionalAbility;
    }

    public void setProfessionalAbility(String professionalAbility) {
        this.professionalAbility = professionalAbility;
    }

    public String getCoreValue() {
        return coreValue;
    }

    public void setCoreValue(String coreValue) {
        this.coreValue = coreValue;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }
}