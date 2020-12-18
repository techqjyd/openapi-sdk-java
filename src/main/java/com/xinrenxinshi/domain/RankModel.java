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

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }
}