package com.xinrenxinshi.domain.approval;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author panhuiwen
 * @Date 2022/1/13 11:14
 */
@Setter
@Getter
public class DismissHandoverClassifyInfo {
    private String classifyTitle;
    private List<DismissHandoverItemInfo> dimissionItemList;

}
