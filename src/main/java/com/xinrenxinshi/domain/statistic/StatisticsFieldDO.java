package com.xinrenxinshi.domain.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author zhaopc
 * @Date 2024/12/10
 * @Version 1.0.0
 * @Description 统计的导入报表字段
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatisticsFieldDO {


    private Integer fieldId;
    /**
     * 导入字段分组
     *
     */
    private Integer importFieldGroupType;
    /**
     * 导入字段分组描述
     */
    private String importFieldGroupDesc;

    /**
     * 字段类型 1.字符串 2 数字 3 日期 4 选项
     *
     */
    private Integer filedType;

    /**
     * 字段名
     */
    private String fieldName;

    /**
     * 中文名
     */
    private String labelName;

    /**
     * 别名
     */
    private String alisaName;
    /**
     * 字段描述
     */
    private String fieldDesc;
    /**
     * 选项字段类型的 数据源
     */
    private List<DataSource>dataSourceList;

}
