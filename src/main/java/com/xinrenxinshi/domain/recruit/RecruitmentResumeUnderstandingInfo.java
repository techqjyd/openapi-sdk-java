package com.xinrenxinshi.domain.recruit;

public class RecruitmentResumeUnderstandingInfo {
    /**
     * todo name 可以不传, 目前仅用了message
     * [{"name":"技术达标","message":"对教育培训有深入的理解, 熟练掌握课程研发、教务管理"},
     * {"name":"名企","message":"有华特迪士尼的1年2个月工作经历"}]
     */
    private String content;
    /**
     * todo 只需要对外暴露 亮点和风险点
     *
     * @link EUnderstandingType
     */
    private Integer type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
