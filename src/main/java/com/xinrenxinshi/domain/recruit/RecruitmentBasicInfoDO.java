package com.xinrenxinshi.domain.recruit;

import lombok.Data;

import java.util.List;

/**
 * @Author zhaopc
 * @Date 2025/8/7
 * @Version 1.0.0
 * @Description
 */
@Data
public class RecruitmentBasicInfoDO {

    /**
     * 简历id
     */
    private String resumeId;

    /**
     * 姓名
     */
    private String name;

    /**
     *  手机
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像 key
     */
    private String headImageKey;

    /**
     * 原始简历的 key
     */
    private String originResumeKey;

    /**
     * 简历附件
     */
    private List<RecruitmentFileModelDO> attachments;
    /**
     * 简历标签
     */
    private List<String> labels;

    /***
     * 亮点
     */
    private List<String> advantage;

    /***
     * 风险点
     */
    private List<String> risk;
}
