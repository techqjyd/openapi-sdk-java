package com.xinrenxinshi.response;

import com.xinrenxinshi.domain.EmployeeSimple;
import com.xinrenxinshi.openapi.OpenapiResponse;

import java.util.List;

/**
 * 员工基础列表返回参数
 *
 * @author: liuchenhui
 * @create: 2019-11-12 14:43
 **/
public class EmployeeBasicInfoListResponse extends OpenapiResponse {
    /**
     * true表示还有分页列表可以查询，false表示分页已到最后一页
     */
    private boolean hasMore;
    /**
     * 员工基础信息
     */
    private List<EmployeeSimple> userList;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<EmployeeSimple> getUserList() {
        return userList;
    }

    public void setUserList(List<EmployeeSimple> userList) {
        this.userList = userList;
    }
}
