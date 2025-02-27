package com.xinrenxinshi.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FieldOption {
    /**
     * 选项key
     */
    private String optionKey;
    /**
     * 选项的值
     */
    private String optionValue;
    /**
     * 多级选项，可不填
     */
    private List<FieldOption> children;

}
