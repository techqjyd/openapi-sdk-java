package com.xinrenxinshi.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FieldConfig {
    /**
     * 字段 Id
     */
    private String fieldId;
    /**
     * 字段名称
     */
    private String fieldName;
    /**
     * 字段类型
     * 0:单行文本 1:多行文本 2:日期 3:选项 4:图片 5:文件 6:行政区 7:城市 8:下拉框多选 10:选部门 11:选汇报对象 12:数值类型 13:组织 14:通讯录 15:国家 20:图片组 21:附件组 24:多级单选
     */
    private String fieldType;
    /**
     * 字段所属类别
     */
    private String fieldCategory;
    /**
     * 当字段类型为单选，多选时有哪些选项
     */
    private List<FieldOption> options;
    /**
     * 是否支持多选，0：不支持，1：支持
     */
    private Integer multiple;
    /**
     * 是否是必填字段，0：非必填，1：必填
     */
    private Integer required;
}
