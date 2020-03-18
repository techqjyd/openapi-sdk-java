package com.xinrenxinshi;

import com.xinrenxinshi.common.DepartTypeEnum;
import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.domain.DepartmentModel;
import com.xinrenxinshi.domain.JobHeaderModel;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.DepartmentCreateRequest;
import com.xinrenxinshi.request.DepartmentDeleteRequest;
import com.xinrenxinshi.request.DepartmentJobGetRequest;
import com.xinrenxinshi.request.DepartmentListRequest;
import com.xinrenxinshi.request.DepartmentUpdateRequest;
import com.xinrenxinshi.response.DepartmentCreateResponse;
import com.xinrenxinshi.response.DepartmentJobGetResponse;
import com.xinrenxinshi.response.DepartmentListResponse;

import java.util.List;

/**
 * 部门管理service
 *
 * @author: liuchenhui
 * @create: 2019-11-14 14:39
 **/
public abstract class XrxsDepartmentService {

    /**
     * 部门创建request
     *
     * @param access_token   授权token
     * @param name           部门名称
     * @param code           部门编码
     * @param parentId       上级部门ID
     * @param departTypeEnum 部门类型
     * @param adminId        管理员ID
     * @param city           所属城市
     * @param remark         备注
     */
    public static String createDepartment(String access_token,
                                          String name,
                                          String code,
                                          String parentId,
                                          DepartTypeEnum departTypeEnum,
                                          String adminId,
                                          String city,
                                          String remark) throws ApiException {
        DepartmentCreateRequest request = new DepartmentCreateRequest(access_token);
        request.setName(name);
        request.setCode(code);
        request.setParentId(parentId);
        request.setType(departTypeEnum);
        request.setAdminId(adminId);
        request.setCity(city);
        request.setReamrk(remark);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        DepartmentCreateResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getId();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 部门列表获取
     *
     * @param access_token   授权token
     * @param departmentId   部门ID
     * @param fetchChildEnum 是否获取子部门
     */
    public static List<DepartmentModel> getDepartmentList(String access_token,
                                                          String departmentId,
                                                          FetchChildEnum fetchChildEnum) throws ApiException {
        DepartmentListRequest request = new DepartmentListRequest(access_token);
        request.setDepartmentId(departmentId);
        request.setFetchChild(fetchChildEnum);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        DepartmentListResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getDepartment();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 部门更新
     *
     * @param access_token 授权token
     * @param departmentId 部门id
     * @param name         部门名字
     * @param parentId     上级部门Id
     * @param code         部门编码
     * @param type         部门类型
     * @param adminId      管理员id
     * @param city         所属城市
     * @param remark       备注
     */
    public static boolean updateDepartment(String access_token,
                                           String departmentId,
                                           String name,
                                           String parentId,
                                           String code,
                                           DepartTypeEnum type,
                                           String adminId,
                                           String city,
                                           String remark) throws ApiException {
        DepartmentUpdateRequest request = new DepartmentUpdateRequest(access_token);
        request.setDepartmentId(departmentId);
        request.setName(name);
        request.setParentId(parentId);
        request.setCode(code);
        request.setType(type);
        request.setAdminId(adminId);
        request.setCity(city);
        request.setReamrk(remark);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 部门删除
     *
     * @param access_token 授权token
     * @param departmentId 部门ID
     */
    public static boolean deleteDepartment(String access_token,
                                           String departmentId) throws ApiException {
        DepartmentDeleteRequest request = new DepartmentDeleteRequest(access_token);
        request.setDepartmentId(departmentId);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 获取岗位信息
     *
     * @param access_token 授权token
     */
    public static List<JobHeaderModel> getJobList(String access_token) throws ApiException {
        DepartmentJobGetRequest request = new DepartmentJobGetRequest(access_token);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        DepartmentJobGetResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getJobHeaders();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }
}
