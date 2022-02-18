package com.xinrenxinshi;

import com.xinrenxinshi.common.*;
import com.xinrenxinshi.domain.EmployeeDetail;
import com.xinrenxinshi.domain.EmployeeGroupField;
import com.xinrenxinshi.domain.EmployeeGroupFieldData;
import com.xinrenxinshi.domain.PreDismissEmployee;
import com.xinrenxinshi.domain.EmployeeSimple;
import com.xinrenxinshi.exception.ApiException;
import com.xinrenxinshi.openapi.OpenapiResponse;
import com.xinrenxinshi.openapi.XrxsOpenapiClient;
import com.xinrenxinshi.request.*;
import com.xinrenxinshi.response.*;
import com.xinrenxinshi.util.RequestTemplate;

import java.io.InputStream;
import java.util.ArrayList;
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
    public static OpenapiResponse<EmployeeCreateResponse> createEmployee(String access_token,
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
        return createEmployee(request);
    }

    /**
     * 创建员工
     */
    public static OpenapiResponse<EmployeeCreateResponse> createEmployee(EmployeeCreateRequest request) throws ApiException {
        OpenapiResponse<EmployeeCreateResponse> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 待入职员工创建
     *
     * @param access_token  授权token
     * @param name          员工姓名
     * @param mobile        手机号
     * @param entryDate     入职时间 yyyy-MM-dd
     * @param type          雇佣类型 0：正式，1：非正式
     * @param jobId         岗位id
     * @param departmentId  部门id
     * @param laborTypeEnum 当type=1时必填，聘用类型
     */
    public static OpenapiResponse<EmpToBeHiredCreateResponse> createEntryPendingEmployee(String access_token,
                                                                        String name,
                                                                        String mobile,
                                                                        String email,
                                                                        String entryDate,
                                                                        String jobId,
                                                                        String departmentId,
                                                                        SimpleHireTypeEnum type,
                                                                        LaborTypeEnum laborTypeEnum) throws ApiException {
        EmpToBeHiredCreateRequest createRequest = new EmpToBeHiredCreateRequest(access_token);
        createRequest.setName(name);
        createRequest.setMobile(mobile);
        createRequest.setEmail(email);
        createRequest.setEntryDate(entryDate);
        createRequest.setHireType(type);
        createRequest.setLaborType(laborTypeEnum);
        createRequest.setDepartmentId(departmentId);
        createRequest.setJobId(jobId);
        return createEntryPendingEmployee(createRequest);
    }

    /**
     * 待入职员工创建
     */
    public static OpenapiResponse<EmpToBeHiredCreateResponse> createEntryPendingEmployee(EmpToBeHiredCreateRequest request) throws ApiException {
        OpenapiResponse<EmpToBeHiredCreateResponse> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 待入职员工入职操作
     *
     * @param access_token  授权token
     * @param employeeId    员工ID
     * @param name          员工姓名
     * @param mobile        员工手机号
     * @param entryDate     入职日期，格式：yyyy-MM-dd
     * @param type          雇佣类型 0：正式，1：非正式
     * @param laborTypeEnum 当hireType=1的时候必填。10-实习,11-劳务,12-顾问,13-返聘,14-外包
     * @param regularDate   转正日期
     * @param jobNumber     工号
     * @param departmentId  部门ID
     * @param gender        性别，1:男，2:女
     * @param jobId         岗位ID，对应的是岗位信息接口中的jobId
     * @param subjection    管理形式，0:总部，1:分城市
     * @param highestDegree 最高学历，1:初中，2:高中，3:中专，4:大专，5:本科，6:硕士，7:博士，8:其他，9:小学，10:中职，11:中技
     */
    public static OpenapiResponse<Void> employed(String access_token,
                                   String employeeId,
                                   String name,
                                   String mobile,
                                   String entryDate,
                                   SimpleHireTypeEnum type,
                                   LaborTypeEnum laborTypeEnum,
                                   String regularDate,
                                   String jobNumber,
                                   String departmentId,
                                   Integer gender,
                                   String jobId,
                                   Integer subjection,
                                   Integer highestDegree) throws ApiException {
        EmployeeEmployedRequest request = new EmployeeEmployedRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setName(name);
        request.setMobile(mobile);
        request.setEntryDate(entryDate);
        request.setHireType(type);
        request.setLaborType(laborTypeEnum);
        request.setRegularDate(regularDate);
        request.setJobNumber(jobNumber);
        request.setDepartmentId(departmentId);
        request.setGender(gender);
        request.setJobId(jobId);
        request.setSubjection(subjection);
        request.setHighestDegree(highestDegree);
        return employed(request);
    }

    /**
     * 待入职员工入职操作
     */
    public static OpenapiResponse<Void> employed(EmployeeEmployedRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 转正式操作
     *
     * @param employeeId          员工ID
     * @param regularHireTypeDate 非正式转正式日期，格式：yyyy-MM-dd
     * @param regularDate         试用期转正日期，格式：yyyy-MM-dd
     * @param jobNumber           工号
     */
    public static OpenapiResponse<Void> regular(String access_token,
                                  String employeeId,
                                  String regularHireTypeDate,
                                  String regularDate,
                                  String jobNumber) throws ApiException {
        EmployeeRegularRequest request = new EmployeeRegularRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setRegularHireTypeDate(regularHireTypeDate);
        request.setRegularDate(regularDate);
        request.setJobNumber(jobNumber);
        return regular(request);
    }

    /**
     * 转正操作
     */
    public static OpenapiResponse<Void> regular(EmployeeRegularRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 获取所有员工的员工基础列表
     *
     * @param access_token  授权token
     * @param empStatusEnum 员工状态
     */
    public static List<EmployeeSimple> getAllSimpleEmployeeList(String access_token,
                                                                EmpStatusEnum empStatusEnum) throws ApiException {
        EmployeeBasicInfoListRequest request = new EmployeeBasicInfoListRequest(access_token);
        request.setDepartmentId(null);
        request.setFetchChild(FetchChildEnum.CONTAINS_DEPARTMENT);
        request.setPageNo(0);
        request.setPageSize(100);
        request.setStatus(empStatusEnum);

        List<EmployeeSimple> list = new ArrayList<>();
        PageResult<EmployeeSimple> pageResult = null;
        do {
            OpenapiResponse<PageResult<EmployeeSimple>> simpleEmployeeList = getSimpleEmployeeList(request);
            if (simpleEmployeeList == null || simpleEmployeeList.getErrcode() != 0){
                assert simpleEmployeeList != null;
                throw new ApiException(simpleEmployeeList.getErrcode(),simpleEmployeeList.getErrmsg());
            }
            pageResult = simpleEmployeeList.getData();
            list.addAll(pageResult.getResult());
            // 防止超频, 频率每分钟200次
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
            request.setPageNo(request.getPageNo()+ 1);
        } while (pageResult.isHasMore());

        return list;
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
    public static OpenapiResponse<PageResult<EmployeeSimple>> getSimpleEmployeeList(String access_token,
                                                                   Integer offset,
                                                                   Integer size,
                                                                   FetchChildEnum fetchChildEnum,
                                                                   String departmentId,
                                                                   EmpStatusEnum empStatusEnum) throws ApiException {
        EmployeeBasicInfoListRequest request = new EmployeeBasicInfoListRequest(access_token);
        request.setDepartmentId(departmentId);
        request.setFetchChild(fetchChildEnum);
        request.setPageNo(offset);
        request.setPageSize(size);
        request.setStatus(empStatusEnum);
        return getSimpleEmployeeList(request);
    }

    /**
     * 获取员工基础列表
     */
    public static OpenapiResponse<PageResult<EmployeeSimple>> getSimpleEmployeeList(EmployeeBasicInfoListRequest request) throws ApiException {
        OpenapiResponse<PageResult<EmployeeSimple>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 获取所有员工的员工详细列表
     *
     * @param access_token  授权token
     * @param empStatusEnum 员工状态
     */
    public static List<EmployeeDetail> getAllDetailEmployeeList(String access_token,
                                                                EmpStatusEnum empStatusEnum) throws ApiException {
        EmployeeDetailInfoListRequest request = new EmployeeDetailInfoListRequest(access_token);
        request.setDepartmentId(null);
        request.setFetchChild(FetchChildEnum.CONTAINS_DEPARTMENT);
        request.setPageNo(0);
        request.setPageSize(100);
        request.setStatus(empStatusEnum);

        List<EmployeeDetail> list = new ArrayList<>();
        PageResult<EmployeeDetail> pageResult = null;
        do {
            OpenapiResponse<PageResult<EmployeeDetail>> detailEmployeeList = getDetailEmployeeList(request);
            if (detailEmployeeList == null || detailEmployeeList.getErrcode() != 0){
                assert detailEmployeeList != null;
                throw new ApiException(detailEmployeeList.getErrcode(),detailEmployeeList.getErrmsg());
            }
            pageResult = detailEmployeeList.getData();
            list.addAll(pageResult.getResult());
            // 防止超频, 频率每分钟200次
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
            request.setPageNo(request.getPageNo() + 1);
        } while (pageResult.isHasMore());

        return list;
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
    public static OpenapiResponse<PageResult<EmployeeDetail>> getDetailEmployeeList(String access_token,
                                                                   Integer offset,
                                                                   Integer size,
                                                                   FetchChildEnum fetchChildEnum,
                                                                   String departmentId,
                                                                   EmpStatusEnum empStatusEnum) throws ApiException {
        EmployeeDetailInfoListRequest request = new EmployeeDetailInfoListRequest(access_token);
        request.setDepartmentId(departmentId);
        request.setFetchChild(fetchChildEnum);
        request.setPageNo(offset);
        request.setPageSize(size);
        request.setStatus(empStatusEnum);
        return getDetailEmployeeList(request);
    }

    /**
     * 获取员工详细列表
     */
    public static OpenapiResponse<PageResult<EmployeeDetail>> getDetailEmployeeList(EmployeeDetailInfoListRequest request) throws ApiException {
        OpenapiResponse<PageResult<EmployeeDetail>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 员工详情信息查询
     *
     * @param access_token  授权token
     * @param employeeId    员工id
     * @param empStatusEnum 员工状态
     */
    public static OpenapiResponse<EmployeeDetail> getDetailEmployee(String access_token,
                                                   String employeeId,
                                                   EmpStatusEnum empStatusEnum) throws ApiException {
        EmployeeInfoRequest request = new EmployeeInfoRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setStatus(empStatusEnum);
        return getDetailEmployee(request);
    }

    /**
     * 员工详情信息查询
     */
    public static OpenapiResponse<EmployeeDetail> getDetailEmployee(EmployeeInfoRequest request) throws ApiException {
        OpenapiResponse<EmployeeDetail> execute = RequestTemplate.execute(request);
        return execute;
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
    public static OpenapiResponse<Void> updateEmployee(String access_token,
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
        return updateEmployee(request);
    }

    /**
     * 更新员工信息
     */
    public static OpenapiResponse<Void> updateEmployee(EmployeeUpdateRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
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
    public static OpenapiResponse<Void> dismissEmployee(String access_token,
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
        return dismissEmployee(request);
    }

    /**
     * 员工离职
     */
    public static OpenapiResponse<Void> dismissEmployee(EmployeeDismissRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 上传员工文件
     *
     * @param access_token 授权token
     * @param inputStream  文件输入流
     * @param employeeId   员工Id
     * @param fileName     文件名称
     */
    public static OpenapiResponse<EmployeeFileUploadResponse> uploadEmpFile(String access_token,
                                                           InputStream inputStream,
                                                           String employeeId,
                                                           String fileName) throws ApiException {
        EmployeeFileUploadRequest request = new EmployeeFileUploadRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setFileName(fileName);
        request.setInputStream(inputStream);
        return uploadEmpFile(request);
    }

    /**
     * 上传员工文件
     */
    public static OpenapiResponse<EmployeeFileUploadResponse> uploadEmpFile(EmployeeFileUploadRequest request) throws ApiException {
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        OpenapiResponse<EmployeeFileUploadResponse> response = openapiClient.upload(request);
        return response;
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
        return downloadEmpFile(request);
    }

    /**
     * 下载员工文件
     */
    public static InputStream downloadEmpFile(EmployeeFileDownloadRequest request) throws ApiException {
        XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
        return openapiClient.downloadEmpFile(request);
    }

    /**
     * 员工分组字段信息
     *
     * @param groupType 分组类型，1-合同记录,7-教育经历,8-工作经历,9-培训经历,10-证书记录,11-联系人记录
     */
    public static OpenapiResponse<List<EmployeeGroupField>> employeeGroupFieldList(String access_token,
                                                                  EmpGroupEnum groupType) throws ApiException {

        EmployeeGroupFieldRequest request = new EmployeeGroupFieldRequest(access_token);
        request.setGroupType(groupType);
        return employeeGroupFieldList(request);
    }

    /**
     * 员工分组字段信息
     */
    public static OpenapiResponse<List<EmployeeGroupField>> employeeGroupFieldList(EmployeeGroupFieldRequest request) throws ApiException {
        OpenapiResponse<List<EmployeeGroupField>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 员工分组信息添加
     *
     * @param employeeId     员工ID
     * @param groupType      分组类型，1-合同记录,7-教育经历,8-工作经历,9-培训经历,10-证书记录,11-联系人记录
     * @param employeeFields 添加分组信息记录 Map<String, String>, Json格式数据，注意字段是必填项，Map的key字段为页面展示文案（分组字段中的labelName），Map的Value字段设置的值(选项类型值为dataSource的Key)
     */
    public static OpenapiResponse<EmployeeGroupAddResponse> employeeGroupAdd(String access_token,
                                                            String employeeId,
                                                            EmpGroupEnum groupType,
                                                            Map<String, String> employeeFields) throws ApiException {
        EmployeeGroupAddRequest request = new EmployeeGroupAddRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setGroupType(groupType);
        request.setEmployeeFields(employeeFields);
        return employeeGroupAdd(request);
    }

    /**
     * 员工分组信息添加
     */
    public static OpenapiResponse<EmployeeGroupAddResponse> employeeGroupAdd(EmployeeGroupAddRequest request) throws ApiException {
        OpenapiResponse<EmployeeGroupAddResponse> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 员工分组信息批量查询
     *
     * @param employeeIds 员工id,多个逗号分隔，员工id个数限制在1～100之间
     * @param groupType   分组类型，1-合同记录,7-教育经历,8-工作经历,9-培训经历,10-证书记录,11-联系人记录
     */
    public static OpenapiResponse<List<EmployeeGroupFieldData>> employeeGroupList(String access_token,
                                                                                  List<String> employeeIds,
                                                                                  EmpGroupEnum groupType,
                                                                                  EmployeeStatusEnum employeeStatus) throws ApiException {
        EmployeeGroupListRequest request = new EmployeeGroupListRequest(access_token);
        request.setEmployeeIds(employeeIds);
        request.setGroupType(groupType);
        request.setEmployeeStatus(employeeStatus);
        return employeeGroupList(request);
    }

    /**
     * 员工分组信息批量查询
     */
    public static OpenapiResponse<List<EmployeeGroupFieldData>> employeeGroupList(EmployeeGroupListRequest request) throws ApiException {
        OpenapiResponse<List<EmployeeGroupFieldData>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 员工分组信息更新
     *
     * @param employeeId     员工ID
     * @param recordId       更新分组信息记录ID
     * @param groupType      分组类型，1-合同记录,7-教育经历,8-工作经历,9-培训经历,10-证书记录,11-联系人记录
     * @param employeeFields 更新分组信息记录 Map<String, String>, Json格式数据，Map的key需要更新字段页面展示文案（分组字段中的labelName），Map的Value更新字段设置的新值(选项类型值为dataSource的Key)
     */
    public static OpenapiResponse<Void> employeeGroupUpdate(String access_token,
                                              String employeeId,
                                              String recordId,
                                              EmpGroupEnum groupType,
                                              Map<String, String> employeeFields) throws ApiException {
        EmployeeGroupUpdateRequest request = new EmployeeGroupUpdateRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setRecordId(recordId);
        request.setGroupType(groupType);
        request.setEmployeeFields(employeeFields);
        return employeeGroupUpdate(request);
    }

    /**
     * 员工分组信息更新
     */
    public static OpenapiResponse<Void> employeeGroupUpdate(EmployeeGroupUpdateRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 员工分组信息删除
     *
     * @param employeeId 员工ID
     * @param recordId   更新分组信息记录ID
     * @param groupType  分组类型，1-合同记录,7-教育经历,8-工作经历,9-培训经历,10-证书记录,11-联系人记录
     */
    public static OpenapiResponse<Void> employeeGroupRemove(String access_token,
                                              String employeeId,
                                              String recordId,
                                              EmpGroupEnum groupType) throws ApiException {
        EmployeeGroupRemoveRequest request = new EmployeeGroupRemoveRequest(access_token);
        request.setEmployeeId(employeeId);
        request.setRecordId(recordId);
        request.setGroupType(groupType);
        return employeeGroupRemove(request);
    }

    /**
     * 员工分组信息删除
     */
    public static OpenapiResponse<Void> employeeGroupRemove(EmployeeGroupRemoveRequest request) throws ApiException {
        OpenapiResponse<Void> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 查询公司内所有预离职员工
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<List<PreDismissEmployee>> listPreDismissEmployee(EmployeePreDismissRequest request) throws ApiException {
        final OpenapiResponse<List<PreDismissEmployee>> execute = RequestTemplate.execute(request);
        return execute;
    }

    /**
     * 查询员工成长记录
     * @param request
     * @return
     * @throws ApiException
     */
    public static OpenapiResponse<Map<String,List<EmployeeCareersResponse>>> getEmployeeCareers(EmployeeCareersRequest request) throws ApiException {
        OpenapiResponse<Map<String, List<EmployeeCareersResponse>>> execute = RequestTemplate.execute(request);
        return execute;
    }


    /**
     * 获取员工文件下载地址
     */
    public static OpenapiResponse<String> getDownloadUrl(GetEmployeeFileDownloadUrlRequest request) throws ApiException {
        final OpenapiResponse<String> execute = RequestTemplate.execute(request);
        return execute;

    }

}
