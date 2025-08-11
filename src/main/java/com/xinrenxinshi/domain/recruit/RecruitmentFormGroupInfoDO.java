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
public class RecruitmentFormGroupInfoDO {


    /**
     * 组唯一id
     */
    private String groupId;

    /**
     * 组描述
     */
    private String groupDesc;

    /**
     * 组类型;0 单分组 1 多段分组
     */
    private Integer groupMultiple;

    /**
     * 字段设置
     */
    private List<RecruitmentFormRecordValueDO> recordValues;
}
