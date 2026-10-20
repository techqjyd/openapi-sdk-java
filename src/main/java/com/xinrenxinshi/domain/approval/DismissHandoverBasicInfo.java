package com.xinrenxinshi.domain.approval;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author panhuiwen
 * @Date 2022/1/13 11:16
 */
@Setter
@Getter
public class DismissHandoverBasicInfo {
    private Integer isOpenDimissionHandover;
    private String explain;
    private Integer dimissionRemindBeforeNum;
    private Integer dimissionRemindBeforeUnit;
    private Integer isAutomaticTrigger;

}
