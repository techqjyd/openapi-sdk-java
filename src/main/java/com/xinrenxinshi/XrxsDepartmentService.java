package com.xinrenxinshi;

import com.xinrenxinshi.common.DepartTypeEnum;
import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.domain.*;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.response.DepartmentCreateResponse;
import com.xinrenxinshi.util.RequestTemplate;

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
    public static OpenapiResponse<DepartmentCreateResponse> createDepartment(String access_token,
                                                                             String name,
                                                                             String code,
                                                                             String parentId,
                                                                             DepartTypeEnum departTypeEnum,
                                                                             String adminId,
                                                                             String city,
                                                                             String hrbpId,
                                                                             String remark) throws ApiException {
        DepartmentCreateRequest request = new DepartmentCreateRequest(access_token);
        request.setName(name);
        request.setCode(code);
        request.setParentId(parentId);
        request.setType(departTypeEnum.getType());
        request.setAdminId(adminId);
        request.setCity(city);
        request.setHrbpId(hrbpId);
        request.setRemark(remark);
        return createDepartment(request);
    }

    /**
     * 部门创建
     */
    public static OpenapiResponse<DepartmentCreateResponse> createDepartment(DepartmentCreateRequest request) throws ApiException {
        OpenapiResponse<DepartmentCreateResponse> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 部门列表获取
     *
     * @param access_token   授权token
     * @param departmentId   部门ID
     * @param fetchChildEnum 是否获取子部门
     */
    public static OpenapiResponse<List<DepartmentModel>> getDepartmentList(String access_token,
                                                                           String departmentId,
                                                                           FetchChildEnum fetchChildEnum) throws ApiException {
        DepartmentListRequest request = new DepartmentListRequest(access_token);
        request.setDepartmentId(departmentId);
        request.setFetchChild(fetchChildEnum);
        return getDepartmentList(request);
    }

    /**
     * 部门列表获取
     */
    public static OpenapiResponse<List<DepartmentModel>> getDepartmentList(DepartmentListRequest request) throws ApiException {
        OpenapiResponse<List<DepartmentModel>> execute = RequestTemplate.execute(request);
        return execute;
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
    public static OpenapiResponse<Void> updateDepartment(String access_token,
                                                         String departmentId,
                                                         String name,
                                                         String parentId,
                                                         String code,
                                                         DepartTypeEnum type,
                                                         String adminId,
                                                         String city,
                                                         String hrbpId,
                                                         String remark) throws ApiException {
        DepartmentUpdateRequest request = new DepartmentUpdateRequest(access_token);
        request.setDepartmentId(departmentId);
        request.setName(name);
        request.setParentId(parentId);
        request.setCode(code);
        request.setType(type.getType());
        request.setAdminId(adminId);
        request.setCity(city);
        request.setRemark(remark);
        request.setHrbpId(hrbpId);
        return updateDepartment(request);
    }

    /**
     * 部门更新
     */
    public static OpenapiResponse<Void> updateDepartment(DepartmentUpdateRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 部门删除
     *
     * @param access_token 授权token
     * @param departmentId 部门ID
     */
    public static OpenapiResponse<Void> deleteDepartment(String access_token,
                                                         String departmentId) throws ApiException {
        DepartmentDeleteRequest request = new DepartmentDeleteRequest(access_token);
        request.setDepartmentId(departmentId);
        return deleteDepartment(request);
    }

    /**
     * 部门删除
     */
    public static OpenapiResponse<Void> deleteDepartment(DepartmentDeleteRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取岗位信息
     *
     * @param access_token 授权token
     */
    public static OpenapiResponse<List<JobHeaderModel>> getJobList(String access_token) throws ApiException {
        DepartmentJobGetRequest request = new DepartmentJobGetRequest(access_token);
        return getJobList(request);
    }

    /**
     * 获取岗位信息
     */
    public static OpenapiResponse<List<JobHeaderModel>> getJobList(DepartmentJobGetRequest request) throws ApiException {
        OpenapiResponse<List<JobHeaderModel>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取成本中心信息
     *
     * @param costId 成本中心id，不传时，默认返回公司所有成本中心信息
     */
    public static OpenapiResponse<List<CostCenterModel>> costCenterList(String access_token,
                                                                        String costId) throws ApiException {
        CostCenterModelRequest request = new CostCenterModelRequest(access_token);
        request.setCostId(costId);
        return costCenterList(request);
    }

    /**
     * 获取成本中心信息
     */
    public static OpenapiResponse<List<CostCenterModel>> costCenterList(CostCenterModelRequest request) throws ApiException {
        OpenapiResponse<List<CostCenterModel>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取公司的职级列表
     *
     * @param access_token
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<RankModel>> rankList(String access_token) throws ApiException {
        RankListRequest request = new RankListRequest(access_token);
        return rankList(request);
    }

    /**
     * 获取公司的职级列表
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<RankModel>> rankList(RankListRequest request) throws ApiException {
        OpenapiResponse<List<RankModel>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取公司岗位词典的详细信息
     *
     * @param access_token token
     * @param jobId        岗位id，不传或者传空时，默认返回公司所有的岗位信息
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<JobDictionaryModel>> getJobDictionary(String access_token, String jobId) throws ApiException {
        JobDictionaryDetailRquest request = new JobDictionaryDetailRquest(access_token);
        request.setJobId(jobId);
        return getJobDictionary(request);
    }

    /**
     * 获取公司岗位词典的详细信息
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<JobDictionaryModel>> getJobDictionary(JobDictionaryDetailRquest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 获取公司部门类型列表
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<DepartmentTypeModel>> getDepartmentTypeList(DepartmentTypeRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 获取公司虚拟部门列表
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<DepartmentModel>> getAllVirtualDeptList(DepartmentVirtualListRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 新增岗位
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<String> addJob(DepartmentJobAddRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 更新岗位
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Void> updateJob(DepartmentJobUpdateRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 删除岗位
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Void> deleteJob(DepartmentJobDeleteRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 新增成本中心
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<String> addCostCenter(CostCenterAddRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 更新成本中心
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Void> updateCostCenter(CostCenterUpdateRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 删除成本中心
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Void> deleteCostCenter(CostCenterDeleteRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 删除成本中心
     *
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Void> deleteCostCenterBudget(CostCenterBudgetDeleteRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }

    /**
     * 获取成本中心信息(带预算信息)
     */
    public static OpenapiResponse<List<CostCenterDetailModel>> costCenterList(CostCenterDetailListRequest request) throws ApiException {
        return RequestTemplate.execute(request);
    }
}
