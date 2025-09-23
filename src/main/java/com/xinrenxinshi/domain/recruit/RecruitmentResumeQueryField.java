package com.xinrenxinshi.domain.recruit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class RecruitmentResumeQueryField {

    /**
     * 字段类型, RecruitmentQueryFieldTypeEnum
     */
    private Integer type;
    /**
     * 字段名
     */
    private String field;
    /**
     * 单选值
     */
    private Object value;
    /**
     * 多选值
     */
    private List<Object> values;
    /**
     * 范围最小值
     */
    private Integer minValue;
    /**
     * 范围最大值
     */
    private Integer maxValue;
    /**
     * 多个范围值
     */
    private List<Range> ranges;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Range {
        /**
         * 范围最小值
         */
        private Integer minValue;
        /**
         * 范围最大值
         */
        private Integer maxValue;
    }


}
