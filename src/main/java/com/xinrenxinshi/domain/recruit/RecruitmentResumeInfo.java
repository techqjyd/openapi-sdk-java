package com.xinrenxinshi.domain.recruit;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author zhaopc
 * @Date 2025/6/14
 * @Version 1.0.0
 * @Description
 */
@Getter
@Setter
public class RecruitmentResumeInfo {
    /**
     * 简历ID
     */
    private String resumeId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 真实手机号
     */
    private String originalMobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 真实邮箱
     */
    private String originalEmail;
    /**
     * 微信
     */
    private String wechat;
    /**
     * 头像
     */
    private String headImage;
    /**
     * 离在职情况
     */
    private String currentStatus;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Integer sex;
    /**
     *
     */
    private String sexDesc;
    /**
     * 毕业院校
     */
    private String school;
    /**
     * 学历类型
     */
    private Integer degree;
    /**
     * 学历描述
     */
    private String degreeDesc;
    /**
     * 所学专业
     */
    private String major;
    /**
     * 工作经验
     */
    private Integer workAge;
    /**
     * 工作城市
     */
    private String workCityId;
    /**
     * 工作城市描述
     */
    private String workCity;
    /**
     * 参加工作时间
     */
    private String workStartDate;
    /**
     * 最近受聘公司
     */
    private String lastCompany;
    /**
     * 最近受聘职位
     */
    private String lastJob;

    /**
     * 最近工作薪水
     */
    private String lastSalary;
    /**
     * 最近工作行业
     */
    private String industry;
    /**
     * 应聘职位
     */
    private String applyJobName;
    private String applyJobId;
    /**
     * 应聘职位名称, 兼容用, 后面会删除
     */
    private String applyJob;
    /**
     * 流程ID
     */
    private Long customProcessId;
    /**
     * 流程描述
     */
    private String customProcessDesc;
    /**
     * 阶段ID
     */
    private Long customStageId;
    /**
     * 阶段描述
     */
    private String customStageDesc;
    /**
     * 阶段类型
     */
    private Integer stageType;
    private String stageTypeDesc;
    /**
     * 简历状态
     */
    private Integer resumeLibraryStatus;
    private String resumeLibraryStatusDesc;
    /**
     * 归档阶段ID
     */
    private Long archiveStageId;
    private String archiveStageDesc;
    /**
     * 人才库分类
     *
     * @see com.xrxs.client.recruitment.enums.custom.TalentCategoryEnum
     */
    private Integer talentCategory;
    private String talentCategoryDesc;
    /**
     * 加入人才库时间
     */
    private String talentTime;

    /**
     * 放弃简历原因
     */
    private String giveUpReasonDesc;
    /**
     * 所属职位岗位
     */
    private String jobPositionName;
    /**
     * 所属职位部门
     */
    private String jobDepartmentName;
    /**
     * 所属职位需求
     */
    private String demandName;
    /**
     * 门户
     */
    private String gatePlanId;
    /**
     * 来源渠道
     */
    private Integer channelType;
    private String channelDesc;
    /**
     * 投递类型
     */
    private String deliveryTypeDesc;
    /**
     * 投递时间
     */
    private String applyTime;
    /**
     * 内推是否有效
     */
    private Integer recommendInvalid;
    /**
     * 内推人 (员工)
     */
    private String recommenderName;
    /**
     * 推荐HR名字
     */
    private String operatorName;
    /**
     * 工作性质 EJobHireType
     */
    private String jobNatureDesc;
    /**
     * 期望职位
     */
    private String expectedJob;
    /**
     * 期望工作地点
     */
    private String workPosition;
    /**
     * 期望工作行业
     */
    private String expectIndustry;
    /**
     * 期望工作薪资
     */
    private String expectSalary;
    /**
     * 到岗期限
     */
    private String entryTime;
    /**
     * 所有公司 工作经历
     */
    private String companies;
    /**
     * 所有公司 工作经历
     */
    private String workJobs;
    /**
     * 所有学校 教育经历
     */
    private String schools;
    /**
     * 所有培训机构
     */
    private String trainOrgProps;
    /**
     * 自我评价
     */
    private String selfEvaluation;
    /**
     * 最近留言
     */
    private String recentMessage;

    /**
     * 推荐面试官
     */
    private String recommendEmployees;
    /**
     * 推荐时间 (排序)
     */
    private String recommendEmployeeTime;
    /**
     * 最后评估人
     */
    private String recommendFeedbackPersonId;
    private String recommendFeedbackPerson;
    /**
     * 推荐反馈评语
     */
    private String recommendFeedBackJudgement;
    /**
     * 推荐反馈时间 (排序)
     */
    private String recommendFeedbackTime;

    /**
     * 入职时间
     */
    private String registerDate;
    /**
     * 转正时间
     */
    private String regularDate;
    /**
     * 聘用形式
     */
    private Integer hireType;
    /**
     * 聘用形式
     */
    private String hireTypeDesc;
    /**
     * 审批雪花id
     */
    private String sid;
    /**
     * offerId
     */
    private String offerId;

    /**
     * 入职部门id
     */
    private String entryDepartment;
    /**
     * 入职部门描述
     */
    private String entryDepartmentName;
    /**
     * 入职岗位id
     */
    private String entryPosition;
    /**
     * 入职岗位描述
     */
    private String entryPositionName;
    /**
     * 审批发起时间 排序
     */
    private String flowTime;
    /**
     * 审批结束时间 排序
     */
    private String flowEndTime;
    /**
     * 当前审批人id
     */
    private String currentApprover;
    /**
     * 当前审批人
     */
    private String currentApproverName;
    /**
     * 审批发起人
     */
    private String approveSponsorName;
    /***
     * 进入当前节点时间
     */
    private String currentApproveTime;

    /***
     * offer发起人
     */
    private String offerSponsorName;

    /***
     * 进入offer阶段时间间隔
     */
    private String enterOfferPhaseInterval;
    /**
     * offer发起时间 排序
     */
    private String offerTime;
    /**
     * offer拒绝时间 排序
     */
    private String offerRejectTime;
    /**
     * offer过期时间 排序
     */
    private String offerExpiredTime;

    /**
     * 面试结论
     */
    private List<Integer> interviewSummary;
    /**
     * 最后面试时间 (排序)
     */
    private String lastInterviewTime;
    /**
     * 最后面试轮次 (名称)
     */
    private String lastInterviewRounds;

    // 最后面试轮次id
    private String lastInterviewRoundsId;

    /**
     * 最后轮次面试官 (多个名字逗号分割)
     */
    private String lastInterviewer;

    /**
     * 最后面试轮次状态数字
     */
    private Integer lastInterviewRoundsStatus;
    /**
     * 面试形式
     */
    private String interviewForm;
    /**
     * 安排面试的HR
     */
    private String interviewOperatorName;
    /**
     * 面试地址
     */
    private String smsSite;
    /**
     * 面试职位
     */
    private String interviewJob;
    private String interviewJobName;
    /**
     * 面试联系人
     */
    private String smsName;

    /**
     * 考试结论
     */
    private Integer examResult;
    private String examResultDesc;
    /**
     * 考试试卷
     */
    private String examPaperName;
    /**
     * 考试分数
     */
    private Double examScore;
    /**
     * 校招站点
     */
    private String siteId;
    private String siteName;
    /**
     * 宣讲会名称
     */
    private String meetingId;
    private String meetingName;

    /**
     * 抓取邮箱
     */
    private String crawlerEmail;
    /**
     * 来源职位
     */
    private String fetchJob;


    /**
     * 简历活跃时间
     */
    private Integer activeTime;

    /**
     * 候选人活跃状态
     */
    private Integer candidateActiveStatus;



    /**
     * 最高达到阶段
     */
    private String highestStageDesc;

    /**
     * 是否是AI推荐详情 1-推荐详情 0-非推荐详情
     */
    private Integer isAiRecommend;

    /**
     * 候选人活跃时间(秒时间戳)
     */
    private Integer candidateActiveTime;


    /**
     * 投递职位活跃时间
     */
    private Integer applyJobLatestTime;

    // 增加猎头公司 猎头顾问
    /**
     * 猎头供应链id
     */
    private String headhunterSupplierId;
    /**
     * 猎头供应链名字
     */
    private String headhunterSupplierName;
    /**
     * 猎头ID
     */
    private String headhunterId;
    /**
     * 猎头名字
     */
    private String headhunterName;

    /**
     * 测评类型 1-上传测评结果  2-使用专业测评 3 - ai面试
     */
    private Integer evaluationType;
    /**
     * 测评类型描述
     */
    private String evaluationTypeDesc;

    /**
     * 测评方案
     */
    private String evaluationPlan;

    /**
     * 测评状态  0-测评中 1-测评已完成 2-测评已终止 3-测评未开始
     */
    private Integer evaluationStatus;
    /**
     * 测评状态描述
     */
    private String evaluationStatusDesc;

    /**
     * 测评得分
     */
    private Double evaluationScore;

    /**
     * 测评结果   10-不推荐 20-一般 30-推荐  40-非常推荐
     */
    private Integer evaluationResult;
    /**
     * 测评结果 描述
     */
    private String evaluationResultDesc;
}
