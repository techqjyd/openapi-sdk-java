package com.xinrenxinshi.domain.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author zhaopc
 * @Date 2024/12/10
 * @Version 1.0.0
 * @Description 报表导入结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatReportUploadResultDO {

    /**
     * 上传数量
     */
    private Integer uploadCount;

    /**
     * 导入失败的信息
     */
    private String errorMessage;

    /**
     * 1 - 全部导入成功
     * 2 - 部分导入成功
     * 3 - 全部导入失败
     */
    private Integer successType = 3;
}
