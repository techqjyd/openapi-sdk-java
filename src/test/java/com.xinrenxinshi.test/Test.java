package com.xinrenxinshi.test;

import com.xinrenxinshi.XrxsCommonService;
import com.xinrenxinshi.XrxsEmployeeService;
import com.xinrenxinshi.common.EmpStatusEnum;
import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.domain.EmployeeSimple;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.EmployeeBasicInfoListRequest;
import com.xinrenxinshi.response.OpenapiTokenResponse;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author zhaopc
 * @Date 2024/12/19
 * @Version 1.0.0
 * @Description
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        try {
            // 初始化 需要替换成自己的密钥
            XrxsOpenapiClient.init("appkey", "secret");
            XrxsOpenapiClient.getInstance();
            OpenapiTokenResponse token = XrxsCommonService.getAccessToken();
            String access_token = token.getAccess_token();
            EmployeeBasicInfoListRequest request = new EmployeeBasicInfoListRequest(access_token);
            request.setFetchChild(FetchChildEnum.CONTAINS_DEPARTMENT);
            request.setPageNo(0);
            request.setPageSize(10);
            request.setStatus(EmpStatusEnum.ON_JOB);
            OpenapiResponse<PageResult<EmployeeSimple>> simpleEmployeeList = XrxsEmployeeService.getSimpleEmployeeList(request);
            System.out.println(JsonUtils.toJson(simpleEmployeeList));
        } catch (Exception e) {
            log.error("执行失败", e);
            System.out.println("执行失败" + e.getMessage());
        }
    }
}
