package com.xinrenxinshi.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FieldOption {
    /**
     * 选项值
     */
    private String optionValue;
    /**
     * 选项内容
     */
    private String optionContent;
    /**
     * 多级选项，可不填
     */
    private List<FieldOption> children;
    /**
     * 是否支持多选，0：不支持，1：支持
     */
    private Integer multiple;

}
