package com.xinrenxinshi;

import com.xinrenxinshi.common.ERedirectTypeEnum;
import com.xinrenxinshi.common.EUserTypeEnum;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.request.FreeLoginRequest;
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
    public static String getFreeLoginUrl(FreeLoginRequest request) throws ApiException {
        return RequestTemplate.execute(request);
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
    public static String getFreeLoginUrl(String access_token,
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
        response.sendRedirect(RequestTemplate.execute(request));
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
        String freeLoginUrl = getFreeLoginUrl(access_token, employeeId, mobile, userType, redirectType, redirectUrlType, redirectParam);
        response.sendRedirect(freeLoginUrl);
    }


//    /**
//     * 获取免登token
//     *
//     * @param employeeId   员工id
//     * @param access_token 授权token
//     */
//    public static FreeLoginToken getFreeLoginTokenByEmployeeId(String access_token,
//                                                               String employeeId) throws ApiException {
//        EmployeeIdFreeLoginTokenRequest employeeIdFreeLoginTokenRequest = new EmployeeIdFreeLoginTokenRequest(access_token);
//        employeeIdFreeLoginTokenRequest.setEmployeeId(employeeId);
//        return getFreeLoginTokenByEmployeeId(employeeIdFreeLoginTokenRequest);
//    }
//
//    /**
//     * 获取免登token
//     */
//    public static FreeLoginToken getFreeLoginTokenByEmployeeId(EmployeeIdFreeLoginTokenRequest request) throws ApiException {
//        return RequestTemplate.execute(request);
//    }
//
//    /**
//     * 获取PC端免登url
//     *
//     * @param access_token    授权token
//     * @param employeeId      员工id
//     * @param freeLoginToken  免登token
//     * @param redirectUrlType 跳转页面类型
//     * @param redirectParam   免登跳转相关参数
//     */
//    public static String employeeIdLoginPc(String access_token,
//                                           String freeLoginToken,
//                                           String employeeId,
//                                           EPcUrlTypeEnum redirectUrlType,
//                                           Map<String, String> redirectParam) throws ApiException {
//        EmployeeFreeLoginRequest request = new EmployeeFreeLoginRequest(access_token);
//        request.setAccess_token(access_token);
//        request.setEmployeeId(employeeId);
//        request.setToken(freeLoginToken);
//        request.setRedirectParam(redirectParam);
//        request.setRedirectUrlType(redirectUrlType == null ? null : redirectUrlType.getRedirectUrlType());
//        request.setRedirectType(ERedirectTypeEnum.PC);
//        return freeLoginUrl(request);
//    }
//
//
//    /**
//     * 获取MOBILE端免登url
//     *
//     * @param access_token    授权token
//     * @param employeeId      员工id
//     * @param freeLoginToken  免登token
//     * @param redirectUrlType 跳转页面类型
//     * @param redirectParam   免登跳转相关参数
//     */
//    public static String employeeIdLoginH5(String access_token,
//                                           String freeLoginToken,
//                                           String employeeId,
//                                           RedirectUrlTypeEnum redirectUrlType,
//                                           Map<String, String> redirectParam) throws ApiException {
//        EmployeeFreeLoginRequest request = new EmployeeFreeLoginRequest(access_token);
//        request.setAccess_token(access_token);
//        request.setEmployeeId(employeeId);
//        request.setToken(freeLoginToken);
//        request.setRedirectParam(redirectParam);
//        request.setRedirectUrlType(redirectUrlType == null ? null : redirectUrlType.getRedirectUrlType());
//        request.setRedirectType(ERedirectTypeEnum.H5);
//        return freeLoginUrl(request);
//    }
//
//    /**
//     * 获取手机号免登token
//     *
//     * @param accessToken
//     * @param mobile
//     * @param userTypeEnum
//     * @return
//     * @throws ApiException
//     */
//    public static FreeLoginToken getFreeLoginTokenByMobile(String accessToken,
//                                                           String mobile,
//                                                           EUserTypeEnum userTypeEnum) throws ApiException {
//        MobileFreeLoginTokenRequest request = new MobileFreeLoginTokenRequest(accessToken);
//        request.setMobile(mobile);
//        request.setUserType(userTypeEnum == null ? null : userTypeEnum.getUserType());
//        return getFreeLoginTokenByMobile(request);
//    }
//
//    /**
//     * 获取手机号免登token
//     *
//     * @param request
//     * @return
//     * @throws ApiException
//     */
//    public static FreeLoginToken getFreeLoginTokenByMobile(MobileFreeLoginTokenRequest request) throws ApiException {
//        return RequestTemplate.execute(request);
//    }
//
//
//    /**
//     * 手机号免登到pc页面
//     * @param access_token
//     * @param freeLoginToken
//     * @param mobile
//     * @param redirectUrlType
//     * @param userType
//     * @param redirectParam
//     * @return
//     * @throws ApiException
//     */
//    public static String mobileLoginPc(String access_token,
//                                       String freeLoginToken,
//                                       String mobile,
//                                       RedirectUrlTypeEnum redirectUrlType,
//                                       EUserTypeEnum userType,
//                                       Map<String, String> redirectParam) throws ApiException {
//        EmployeeFreeLoginRequest request = new EmployeeFreeLoginRequest(access_token);
//        request.setAccess_token(access_token);
//        request.setMobile(mobile);
//        request.setToken(freeLoginToken);
//        request.setRedirectParam(redirectParam);
//        request.setRedirectUrlType(redirectUrlType == null ? null : redirectUrlType.getRedirectUrlType());
//        request.setRedirectType(ERedirectTypeEnum.PC);
//        request.setUserType(userType);
//        return RequestTemplate.execute(request);
//    }
//
//
//    /**
//     * 手机号免登到h5页面
//     *
//     * @param access_token
//     * @param freeLoginToken
//     * @param mobile
//     * @param redirectUrlType
//     * @param userType
//     * @param redirectParam
//     * @return
//     * @throws ApiException
//     */
//    public static String mobileLoginH5(String access_token,
//                                       String freeLoginToken,
//                                       String mobile,
//                                       RedirectUrlTypeEnum redirectUrlType,
//                                       EUserTypeEnum userType,
//                                       Map<String, String> redirectParam) throws ApiException {
//        EmployeeFreeLoginRequest request = new EmployeeFreeLoginRequest(access_token);
//        request.setAccess_token(access_token);
//        request.setMobile(mobile);
//        request.setToken(freeLoginToken);
//        request.setRedirectParam(redirectParam);
//        request.setRedirectUrlType(redirectUrlType == null ? null : redirectUrlType.getRedirectUrlType());
//        request.setRedirectType(ERedirectTypeEnum.H5);
//        request.setUserType(userType);
//        return RequestTemplate.execute(request);
//    }
//
//
//    /**
//     * 获取免登url
//     */
//    public static String freeLoginUrl(EmployeeFreeLoginRequest request) throws ApiException {
//        return RequestTemplate.execute(request);
//    }
}
