package com.xinrenxinshi.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 部门自定义字段
 *
 * @author: zhangdongliang
 * @create: 2026-10-20
 **/
@Setter
@Getter
public class DepartmentFieldModel {
    /**
     * 字段ID
     */
    private String fieldId;
    /**
     * 字段名称，创建/更新部门时 fields 的 key 使用该值
     */
    private String labelName;
    /**
     * 字段类型，0-单行文本，1-多行文本，2-日期，3-单选，4-图片，5-文件，6-行政区，7-地区(地级市)，
     * 8-多选，12-数值，13-组织，14-员工，15-国家，20-图片组，21-附件组，24-多级单选，25-多级多选
     */
    private Integer fieldType;
    /**
     * 是否必填，0-非必填，1-必填
     */
    private Integer required;
    /**
     * 最大长度（文本类字段有效）
     */
    private Integer maxLength;
    /**
     * 可选项，选项类字段（单选/多选）有效
     */
    private List<String> options;
}
