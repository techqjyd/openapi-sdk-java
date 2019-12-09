package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.payroll.PayrollChangeHistoryInfoModel;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * 调薪记录查询结果
 *
 * @author: liuchenhui
 * @create: 2019-11-28 10:23
 **/
public class PayrollChangeHistoryResponse extends OpenapiResponse {
    /**
     * true or false
     */
    private boolean hasMore;

    /**
     * 调薪记录列表
     */
    private List<PayrollChangeHistoryInfoModel> changeHistoryInfoList;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<PayrollChangeHistoryInfoModel> getChangeHistoryInfoList() {
        return changeHistoryInfoList;
    }

    public void setChangeHistoryInfoList(List<PayrollChangeHistoryInfoModel> changeHistoryInfoList) {
        this.changeHistoryInfoList = changeHistoryInfoList;
    }
}
