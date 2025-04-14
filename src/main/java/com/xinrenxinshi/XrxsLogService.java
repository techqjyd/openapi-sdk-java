package com.xinrenxinshi;

import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.domain.log.AdminOperationLogResult;
import com.xinrenxinshi.domain.log.ApiOperationLogResult;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.AdminOperationLogRequest;
import com.xinrenxinshi.request.ApiOperationLogRequest;
import com.xinrenxinshi.request.EmployeeDetailInfoListRequest;
import com.xinrenxinshi.response.PageResult;
import com.xinrenxinshi.util.RequestTemplate;

public abstract class XrxsLogService {


    public static OpenapiResponse<PageResult<AdminOperationLogResult>> getAdminOperationLogList(AdminOperationLogRequest request) throws ApiException {
        OpenapiResponse<PageResult<AdminOperationLogResult>> execute = RequestTemplate.execute(request);
        return execute;
    }

    public static OpenapiResponse<PageResult<ApiOperationLogResult>> getApiOperationLogList(ApiOperationLogRequest request) throws ApiException {
        OpenapiResponse<PageResult<ApiOperationLogResult>> execute = RequestTemplate.execute(request);
        return execute;
    }
}
