package com.xinrenxinshi.domain.recruit;

import lombok.Data;

/**
 * @Author zhaopc
 * @Date 2025/8/7
 * @Version 1.0.0
 * @Description
 */
@Data
public class RecruitmentFormFieldValueDO {

    /**
     * field_id
     */
    private String fieldId;

    /**
     * 字段类型
     */
    private Integer fieldType;

    /**
     * 字段英文名称
     */
    private String fieldName;

    /**
     * 字段描述
     */
    private String fieldDesc;

    /**
     * 选项
     */
    private String dataSource;

    /**
     * 值
     */
    private String fieldValue;

}
