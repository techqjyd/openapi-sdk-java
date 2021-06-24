package com.xinrenxinshi;

import com.xinrenxinshi.common.ERedirectTypeEnum;
import com.xinrenxinshi.common.EUserTypeEnum;
import com.xinrenxinshi.domain.LoginInfoResult;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.FreeLoginRequest;
import com.xinrenxinshi.request.GetUserInfoRequest;
import com.xinrenxinshi.util.RequestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 免登service
 * <p>
 * 1、免登token获取
 * <p>
 * 2、免登请求url组装
 *
 * @author: liuchenhui
 * @create: 2019-11-14 14:29
 **/
public abstract class XrxsFreeLoginService {


    /**
     * 获取免登url
     *
     * @param request 免登请求git
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<String> getFreeLoginUrl(FreeLoginRequest request) throws ApiException {
        OpenapiResponse<String> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 获取免登url
     *
     * @param access_token
     * @param employeeId      免登的员工id
     * @param mobile          免登的手机号
     * @param userType        用户类型
     * @param redirectType    免登类型
     * @param redirectUrlType 跳转类型
     * @param redirectParam   跳转参数
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<String> getFreeLoginUrl(String access_token,
                                         String employeeId,
                                         String mobile,
                                         EUserTypeEnum userType,
                                         ERedirectTypeEnum redirectType,
                                         Integer redirectUrlType,
                                         Map<String, String> redirectParam) throws ApiException {
        FreeLoginRequest request = new FreeLoginRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setMobile(mobile);
        request.setUserType(userType.getUserType());
        request.setRedirectType(redirectType.getLoginType());
        request.setRedirectUrlType(redirectUrlType);
        request.setRedirectParam(redirectParam);
        return getFreeLoginUrl(request);
    }

    /**
     * 获取免登url
     *
     * @param request 免登请求git
     * @return
     * @throws ApiException
     */
    public static void getFreeLoginUrl(FreeLoginRequest request, HttpServletResponse response) throws ApiException, IOException {
        OpenapiResponse<String> execute = RequestTemplate.execute(request);
        if (execute == null || execute.getErrcode() != 0){
            assert execute != null;
            throw new ApiException(execute.getErrcode(),execute.getErrmsg());
        }
        response.sendRedirect(execute.getData());
    }


    /**
     * 获取免登url
     *
     * @param access_token
     * @param employeeId      免登的员工id
     * @param mobile          免登的手机号
     * @param userType        用户类型
     * @param redirectType    免登类型
     * @param redirectUrlType 跳转类型
     * @param redirectParam   跳转参数
     * @return
     * @throws ApiException
     */
    public static void getFreeLoginUrl(String access_token,
                                         String employeeId,
                                         String mobile,
                                         EUserTypeEnum userType,
                                         ERedirectTypeEnum redirectType,
                                         Integer redirectUrlType,
                                         Map<String, String> redirectParam,
                                         HttpServletResponse response) throws ApiException, IOException {
        OpenapiResponse<String> execute = getFreeLoginUrl(access_token, employeeId, mobile, userType, redirectType, redirectUrlType, redirectParam);
        if (execute == null || execute.getErrcode() != 0){
            assert execute != null;
            throw new ApiException(execute.getErrcode(),execute.getErrmsg());
        }
        response.sendRedirect(execute.getData());
    }

    /**
     * 根据授权认证code 获取登录用户信息
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<LoginInfoResult> getUserInfo(GetUserInfoRequest request) throws ApiException {
        final OpenapiResponse<LoginInfoResult> execute = RequestTemplate.execute(request);
        return execute;
    }
}
