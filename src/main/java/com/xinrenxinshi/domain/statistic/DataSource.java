package com.xinrenxinshi.domain.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zhaopc
 * @Date 2024/12/17
 * @Version 1.0.0
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataSource {
    /**
     * 选项 key
     */
    private String key;
    /**
     * 选项名称
     */
    private String label;
}
