package com.xinrenxinshi;

import com.alibaba.fastjson.TypeReference;
import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.common.ERequestPath;
import com.xinrenxinshi.common.FreeLoginParam;
import com.xinrenxinshi.common.RedirectUrlTypeEnum;
import com.xinrenxinshi.domain.login.LoginTokenInfo;
import com.xinrenxinshi.domain.login.param.MobileLoginParam;
import com.xinrenxinshi.domain.login.param.MobileTokenParam;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.ExecuteTemplate;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.FreeLoginTokenGetRequest;
import com.xinrenxinshi.request.OpenApiRequestAdapter;
import com.xinrenxinshi.response.FreeLoginTokenGetResponse;
import com.xinrenxinshi.response.OpenApiResponseAdapter;

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
     * 获取免登token
     *
     * @param employeeId   员工id
     * @param access_token 授权token
     */
    public static String getFreeLoginToken(String access_token,
                                           String employeeId) throws ApiException {
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        FreeLoginTokenGetRequest freeLoginTokenGetRequest = new FreeLoginTokenGetRequest(access_token);
        freeLoginTokenGetRequest.setEmployeeId(employeeId);
        FreeLoginTokenGetResponse response = instance.getFreeLoginToken(freeLoginTokenGetRequest);
        if (response != null && response.getErrcode() == 0) {
            return response.getData().getToken();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 获取PC端免登url
     *
     * @param access_token    授权token
     * @param employeeId      员工id
     * @param freeLoginToken  免登token
     * @param redirectUrlType 跳转页面类型
     * @param redirectParam   免登跳转相关参数
     */
    public static String getPCFreeLoginUrl(String access_token,
                                           String freeLoginToken,
                                           String employeeId,
                                           RedirectUrlTypeEnum redirectUrlType,
                                           String redirectParam) throws ApiException {
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        FreeLoginParam freeLoginParam = new FreeLoginParam();
        freeLoginParam.setAccess_token(access_token);
        freeLoginParam.setFreeLoginToken(freeLoginToken);
        freeLoginParam.setEmployeeId(employeeId);
        freeLoginParam.setRedirectUrlType(redirectUrlType);
        freeLoginParam.setRedirectParam(redirectParam);
        return instance.getFreeLoginUrl(freeLoginParam, Constants.PC_FREE_LOGIN_BIZ_URL);
    }

    /**
     * 获取MOBILE端免登url
     *
     * @param access_token    授权token
     * @param employeeId      员工id
     * @param freeLoginToken  免登token
     * @param redirectUrlType 跳转页面类型
     * @param redirectParam   免登跳转相关参数
     */
    public static String getMobileFreeLoginUrl(String access_token,
                                               String freeLoginToken,
                                               String employeeId,
                                               RedirectUrlTypeEnum redirectUrlType,
                                               String redirectParam) throws ApiException {
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        FreeLoginParam freeLoginParam = new FreeLoginParam();
        freeLoginParam.setAccess_token(access_token);
        freeLoginParam.setFreeLoginToken(freeLoginToken);
        freeLoginParam.setEmployeeId(employeeId);
        freeLoginParam.setRedirectUrlType(redirectUrlType);
        freeLoginParam.setRedirectParam(redirectParam);
        return instance.getFreeLoginUrl(freeLoginParam, Constants.MOBILE_FREE_LOGIN_BIZ_URL);
    }

    /**
     * 获取手机号免登token
     *
     * @param accessToken      授权令牌
     * @param mobileTokenParam 请求参数
     * @return
     */
    public static LoginTokenInfo getMobileToken(String accessToken, MobileTokenParam mobileTokenParam) throws ApiException {
        return ExecuteTemplate.execute(() -> new OpenApiRequestAdapter<>(accessToken, mobileTokenParam, ERequestPath.MOBILE_TOKEN, new TypeReference<OpenApiResponseAdapter<LoginTokenInfo>>() {
        }));
    }

    /**
     * 手机号免登PC端
     *
     * @param mobileLoginParam 请求参数
     * @return 免登链接
     */
    public static String mobileLoginPc(MobileLoginParam mobileLoginParam) throws ApiException {
        OpenApiRequestAdapter<MobileLoginParam, OpenapiResponse> requestAdapter = new OpenApiRequestAdapter<>(mobileLoginParam.getAccess_token(), mobileLoginParam, ERequestPath.MOBILE_LOGIN_PC);
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        return instance.getFreeLoginUrl(requestAdapter, ERequestPath.MOBILE_LOGIN_PC.getPath());
    }

    /**
     * 手机号免登PC端
     *
     * @param mobileLoginParam 请求参数
     * @return 免登链接
     */
    public static String mobileLoginH5(MobileLoginParam mobileLoginParam) throws ApiException {
        OpenApiRequestAdapter<MobileLoginParam, OpenapiResponse> requestAdapter = new OpenApiRequestAdapter<>(mobileLoginParam.getAccess_token(), mobileLoginParam, ERequestPath.MOBILE_LOGIN_PC);
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        return instance.getFreeLoginUrl(requestAdapter, ERequestPath.MOBILE_LOGIN_H5.getPath());
    }
}
