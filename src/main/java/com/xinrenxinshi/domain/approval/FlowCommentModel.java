package com.xinrenxinshi.domain.approval;

import java.util.List;
import java.util.Map;


/**
 * 审批评论信息返回结果
 *
 * @author hzz
 * @date 2022/5/6
 * @since
 */
public class FlowCommentModel {
    /**
     * 员工名字
     */
    private String employeeName;

    /**
     * 评论内容
     */
    private String comment;


    /**
     * 时间
     */
    private String time;

    /**
     *离职确认时间（审批人）
     */
    private String confirmDate;

    /**
     * 文件
     */
    private List<Map<String,String>> files;

    /**
     * 图片
     */
    private List<String> images;

    /**
     * 排序用的 也是前端的唯一id
     */
    private Integer position;

    /**
     * 审批签名路径
     */
    private String sign;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
    }

    public List<Map<String, String>> getFiles() {
        return files;
    }

    public void setFiles(List<Map<String, String>> files) {
        this.files = files;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
