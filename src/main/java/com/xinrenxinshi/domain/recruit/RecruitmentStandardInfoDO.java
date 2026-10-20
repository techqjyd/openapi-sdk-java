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
public class RecruitmentStandardInfoDO {

    /**
     * 基本信息
     */
    private RecruitmentBasicInfoDO basicInfo;

    /**
     * 表单信息
     */
    private List<RecruitmentFormGroupInfoDO> groupInfos;
}
