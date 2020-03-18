## 开放平台 SDK for Java

#### 薪人薪事平台
 - 功能覆盖人力全模块，开启高效规范新管理
 - 以数字驱动为核心，打破人力资源边界
 - 全周期极致好用的人力资源管理系统
 - 开放对接，面向未来，连接无限可能
 
#### 开放平台核心功能说明
开放平台是薪人薪事平台与客户OA系统业务协作与数据共享的桥梁。

- 提供了组织架构、员工信息、考勤记录、工资数据、招聘数据、审批数据等模块相关的接口功能。
- 支持部门、员工、审批等消息订阅。
- 支持OA系统免登到薪人薪事员工端系统。
- 支持基于API接口级别的权限控制。

#### 打包配置
- 将源码clone到本地  
	```text
	git clone git@github.com:techqjyd/openapi-sdk-java.git
	```
- 在项目根目录下执行打包命令   
	```text
	mvn package
	```
- 可以直接下载lib文件夹下的jar 

- 将打包生成的jar发布到私服   
	```text
	mvn deploy:deploy-file -DgroupId=com.XXX.XXX -DartifactId=XXX -Dversion=1.0.0 -Dpackaging=jar -Dfile=openapi-sdk-java-1.0.0.jar -Durl=http://ip:host/nexus/content/repositories/releases  -DrepositoryId=releases
	```
- 项目中添加依赖
	```xml
	<dependency>
    <groupId>com.XXX.XXX</groupId>
    <artifactId>XXX</artifactId>
    <version>1.0.0</version>
	</dependency>
	```
- 项目中必须依赖的三方jar
	```xml
	<dependency>
	    <groupId>commons-codec</groupId>
	    <artifactId>commons-codec</artifactId>
	    <version>xx.xx.xx</version>
	</dependency>
	<dependency>
	    <groupId>com.alibaba</groupId>
	    <artifactId>fastjson</artifactId>
	    <version>xx.xx.xx</version>
	</dependency>
	```
#### 开始使用
```java
import com.xinrenxinshi.openapi.XrxsOpenapiClient;  

class XXX {
    public static void main(String[] args){
      XrxsOpenapiClient.init(appKey, appSecret);// 初始化
      XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance(); // 获取XrxsOpenapiClient实例
      OpenapiTokenResponse token = XrxsCommonService.getAccessToken();// 获取token，建议这里对token做缓存处理
      String access_token = token.getAccess_token();
      XrxsEmployeeService.createEmployeecreateEmployee(access_token, "薪人薪事", "130xxxxxxxx", HireTypeEnum.OFFICIAL, map, "2019-11-11");// 创建员工，其他接口调用类似
    }
}
```
#### 功能说明
> 通用接口 XrxsCommonService
- 获取token -- getAccessToken
- 城市列表 -- getCityList
> 免登接口 XrxsFreeLoginService
- 获取免登token -- getFreeLoginToken
- 员工手机端免登URL -- getMobileFreeLoginUrl
- 员工PC端免登URL -- getPCFreeLoginUrl
> 员工管理 XrxsEmployeeService
- 创建员工 -- createEmployee
- 待入职员工创建 -- createEntryPendingEmployee
- 获取员工基础列表 -- getSimpleEmployeeList
- 获取员工详细列表 -- getDetailEmployeeList
- 员工详情信息查询 -- getDetailEmployee
- 更新员工信息 -- updateEmployee
- 员工离职 -- dismissEmployee
- 上传员工文件 -- uploadEmpFile
- 下载员工文件 -- downloadEmpFile
> 部门管理 XrxsDepartmentService
- 部门创建 -- createDepartment
- 部门列表 -- getDepartmentList
- 部门更新 -- updateDepartment
- 部门删除 -- deleteDepartment
- 获取岗位信息 -- getJobList
> 工资 XrxsPayrollService
- 工资报表 -- getReportArchives
- 工资报表详情 -- getReportArchiveDetail
- 公司工资项配置 -- getSetting
- 更新员工工资项 -- updateEmpPayrollSetting
- 调薪记录 -- getChangeHistory
> 审批相关 XrxsApprovalService  
- 审批列表 -- getFlowList
- 审批表单详情 -- getFlowDetail
- 审批类型 -- getFLowTypes
- 审批节点信息 -- getNodeInfo
> 招聘 XrxsRecruitmentService
- 招聘全数据报表 -- getFullReport
> 考勤 XrxsAttendanceService
- 员工打卡 -- saveClock
- 批量打卡 -- batchClock
> 失败消息 XrxsPushMsgService
- 订阅消息失败消息获取 -- getFailMsg
