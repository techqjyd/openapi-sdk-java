package com.xinrenxinshi.domain.recruit;

/**
 * @author : zhaopc
 * @version : 1.0
 * @Description : RecruitmentUnderstanding
 * @date : 2023/5/9 16:09
 */
public class RecruitmentUnderstanding {

    private String name = "";

    private Integer rank = 0;

    private String id = "";

    private String message = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
