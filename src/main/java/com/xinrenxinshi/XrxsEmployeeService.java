package com.xinrenxinshi;

import com.xinrenxinshi.common.DismissionTypeEnum;
import com.xinrenxinshi.common.EmpStatusEnum;
import com.xinrenxinshi.common.FetchChildEnum;
import com.xinrenxinshi.common.HireTypeEnum;
import com.xinrenxinshi.common.HouseFundSubEnum;
import com.xinrenxinshi.common.InsuranceSubEnum;
import com.xinrenxinshi.common.LaborTypeEnum;
import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.domain.EmployeeSimple;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.EmpToBeHiredCreateRequest;
import com.xinrenxinshi.request.EmployeeBasicInfoListRequest;
import com.xinrenxinshi.request.EmployeeCreateRequest;
import com.xinrenxinshi.request.EmployeeDetailInfoListRequest;
import com.xinrenxinshi.request.EmployeeDismissRequest;
import com.xinrenxinshi.request.EmployeeFileDownloadRequest;
import com.xinrenxinshi.request.EmployeeFileUploadRequest;
import com.xinrenxinshi.request.EmployeeInfoRequest;
import com.xinrenxinshi.request.EmployeeUpdateRequest;
import com.xinrenxinshi.response.EmpToBeHiredCreateResponse;
import com.xinrenxinshi.response.EmployeeBasicInfoListResponse;
import com.xinrenxinshi.response.EmployeeCreateResponse;
import com.xinrenxinshi.response.EmployeeDetailInfoListResponse;
import com.xinrenxinshi.response.EmployeeFileUploadResponse;
import com.xinrenxinshi.response.EmployeeInfoResponse;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * 员工管理service
 *
 * @author: liuchenhui
 * @create: 2019-11-14 14:31
 **/
public abstract class XrxsEmployeeService {

    /**
     * 创建员工
     *
     * @param access_token 授权token
     * @param name         员工姓名
     * @param mobile       手机号
     * @param hireType     聘用类型
     * @param fields       员工字段信息
     * @param entryDate    入职时间
     */
    public static String createEmployee(String access_token,
                                        String name,
                                        String mobile,
                                        HireTypeEnum hireType,
                                        Map<String, String> fields,
                                        String entryDate) throws ApiException {
        EmployeeCreateRequest request = new EmployeeCreateRequest(access_token);
        request.setName(name);
        request.setMobile(mobile);
        request.setFields(fields);
        request.setEntryDate(entryDate);
        request.setHireType(hireType);
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        EmployeeCreateResponse response = instance.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getEmployeeId();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 待入职员工创建
     *
     * @param access_token  授权token
     * @param name          员工姓名
     * @param mobile        手机号
     * @param entryDate     入职时间 yyyy-MM-dd
     * @param type          雇佣类型 0：正式，1：非正式
     * @param laborTypeEnum 当type=1时必填，聘用类型
     */
    public static String createEntryPendingEmployee(String access_token,
                                                    String name,
                                                    String mobile,
                                                    String email,
                                                    String entryDate,
                                                    Integer type,
                                                    LaborTypeEnum laborTypeEnum) throws ApiException {
        EmpToBeHiredCreateRequest createRequest = new EmpToBeHiredCreateRequest(access_token);
        createRequest.setName(name);
        createRequest.setMobile(mobile);
        createRequest.setEmail(email);
        createRequest.setEntryDate(entryDate);
        createRequest.setHireType(type);
        createRequest.setLaborType(laborTypeEnum);
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        EmpToBeHiredCreateResponse response = instance.execute(createRequest);
        if (response != null && response.getErrcode() == 0) {
            return response.getEmployeeId();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 获取员工基础列表
     *
     * @param access_token   授权token
     * @param offset         起始页码
     * @param size           查询员工数量，单次数量限制100
     * @param fetchChildEnum 是否包含子部门
     * @param departmentId   部门id
     * @param empStatusEnum  员工状态
     */
    public static List<EmployeeSimple> getSimpleEmployeeList(String access_token,
                                                             Integer offset,
                                                             Integer size,
                                                             FetchChildEnum fetchChildEnum,
                                                             String departmentId,
                                                             EmpStatusEnum empStatusEnum) throws ApiException {
        EmployeeBasicInfoListRequest request = new EmployeeBasicInfoListRequest(access_token);
        request.setDepartmentId(departmentId);
        request.setFetchChild(fetchChildEnum);
        request.setOffset(offset);
        request.setSize(size);
        request.setStatus(empStatusEnum);
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        EmployeeBasicInfoListResponse response = instance.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getUserList();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 获取员工详细列表
     *
     * @param access_token   授权token
     * @param offset         起始页码
     * @param size           查询员工数量，单次数量限制100
     * @param fetchChildEnum 是否包含子部门
     * @param departmentId   部门id
     * @param empStatusEnum  员工状态
     */
    public static List<EmployeeDetail> getDetailEmployeeList(String access_token,
                                                             Integer offset,
                                                             Integer size,
                                                             FetchChildEnum fetchChildEnum,
                                                             String departmentId,
                                                             EmpStatusEnum empStatusEnum) throws ApiException {
        EmployeeDetailInfoListRequest request = new EmployeeDetailInfoListRequest(access_token);
        request.setDepartmentId(departmentId);
        request.setFetchChild(fetchChildEnum);
        request.setOffset(offset);
        request.setSize(size);
        request.setStatus(empStatusEnum);
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        EmployeeDetailInfoListResponse response = instance.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getUserlist();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 员工详情信息查询
     *
     * @param access_token  授权token
     * @param employeeId    员工id
     * @param empStatusEnum 员工状态
     */
    public static EmployeeDetail getDetailEmployee(String access_token,
                                                   String employeeId,
                                                   EmpStatusEnum empStatusEnum) throws ApiException {
        EmployeeInfoRequest request = new EmployeeInfoRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setStatus(empStatusEnum);
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        EmployeeInfoResponse response = instance.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getData();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 更新员工信息
     *
     * @param access_token 授权token
     * @param employeeId   员工id
     * @param name         员工姓名
     * @param mobile       员工手机号
     * @param hireType     聘用类型
     * @param fields       员工字段信息
     * @param entryDate    入职时间 yyyy-MM-dd
     */
    public static boolean updateEmployee(String access_token,
                                         String employeeId,
                                         String name,
                                         String mobile,
                                         HireTypeEnum hireType,
                                         Map<String, String> fields,
                                         String entryDate) throws ApiException {
        EmployeeUpdateRequest request = new EmployeeUpdateRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setName(name);
        request.setMobile(mobile);
        request.setEntryDate(entryDate);
        request.setHireType(hireType);
        request.setFields(fields);
        XrxsOpenapiClient instance = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = instance.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 员工离职
     *
     * @param access_token       授权token
     * @param employeeId         员工ID
     * @param dismissDate        离职时间 yyyy-MM-dd
     * @param dismissionTypeEnum 离职类型
     * @param insuranceSubEnum   社保减员月
     * @param houseFundSubEnum   公积金减员月
     * @param payrollSub         离职减员月
     */
    public static boolean dismissEmployee(String access_token,
                                          String employeeId,
                                          String dismissDate,
                                          DismissionTypeEnum dismissionTypeEnum,
                                          InsuranceSubEnum insuranceSubEnum,
                                          HouseFundSubEnum houseFundSubEnum,
                                          String payrollSub) throws ApiException {
        EmployeeDismissRequest request = new EmployeeDismissRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setDismissDate(dismissDate);
        request.setDismissionType(dismissionTypeEnum);
        request.setInsuranceSub(insuranceSubEnum);
        request.setHouseFundSub(houseFundSubEnum);
        request.setPayrollSub(payrollSub);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse response = openapiClient.execute(request);
        if (response != null && response.getErrcode() == 0) {
            return true;
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 上传员工文件
     *
     * @param access_token 授权token
     * @param inputStream  文件输入流
     * @param employeeId   员工Id
     * @param fileName     文件名称
     */
    public static String uploadEmpFile(String access_token,
                                       InputStream inputStream,
                                       String employeeId,
                                       String fileName) throws ApiException {
        EmployeeFileUploadRequest request = new EmployeeFileUploadRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setFileName(fileName);
        request.setInputStream(inputStream);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        EmployeeFileUploadResponse response = openapiClient.uploadFile(request);
        if (response != null && response.getErrcode() == 0) {
            return response.getKey();
        }
        throw new ApiException(response.getErrcode(), response.getErrmsg());
    }

    /**
     * 下载员工文件
     *
     * @param access_token 授权token
     * @param employeeId   员工ID
     * @param fileKey      文件key
     */
    public static InputStream downloadEmpFile(String access_token,
                                              String employeeId,
                                              String fileKey) throws ApiException {
        EmployeeFileDownloadRequest request = new EmployeeFileDownloadRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setFileKey(fileKey);
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        return openapiClient.downloadEmpFile(request);
    }
}
