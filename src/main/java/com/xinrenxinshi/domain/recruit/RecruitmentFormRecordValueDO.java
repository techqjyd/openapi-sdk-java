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
public class RecruitmentFormRecordValueDO {

    /**
     * 记录id
     */
    private String recordId;
    /**
     * 是否主记录 0 否 1 是
     */
    private Integer isMain;

    /**
     * 字段设置
     */
    private List<RecruitmentFormFieldValueDO> fieldValues;
}
