package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * 员工详情列表response
 *
 * @author: liuchenhui
 * @create: 2019-11-12 11:45
 **/
public class EmployeeDetailInfoListResponse {

    /**
     * true表示还有分页列表可以查询，false表示分页已到最后一页
     */
    private boolean hasMore;
    /**
     * 员工详情信息列表
     */
    private List<EmployeeDetail> userlist;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<EmployeeDetail> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<EmployeeDetail> userlist) {
        this.userlist = userlist;
    }
}
