# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## 项目概述

薪人薪事 (XinRenXinShi) 开放平台 Java SDK。封装了 HR SaaS 平台的 OpenAPI 调用，覆盖组织架构、员工、考勤、薪酬、审批、招聘等模块。

## 构建 & 测试

```bash
# 打包（编译 + 源码 jar）
mvn package

# 仅编译
mvn compile

# 运行测试（test 目录下通过 main 方法手动测试，无单元测试框架）
mvn test
```

Maven 坐标: `com.xinrenxinshi:openapi-sdk-java:1.0.53`，Java 8。每次新增接口需升级版本号（末位 +1）。

## 核心架构

### 初始化入口

```java
XrxsOpenapiClient.init(appKey, appSecret);  // 单例初始化
XrxsOpenapiClient openapiClient = XrxsOpenapiClient.getInstance();
OpenapiTokenResponse token = XrxsCommonService.getAccessToken();
String accessToken = token.getAccess_token();
```

### 请求-响应模型

所有 API 调用遵循同一模式：`Service 静态方法 → Request 对象 → RequestTemplate.execute() → OpenapiResponse<T>`。

**Request 继承体系**（`com.xinrenxinshi.openapi`）：

- `IOpenapiRequest<T>` — 核心接口：HTTP 方法、响应类型、参数校验 `check()`、`getParamMap()`、`getBizUrl()`
- `AbstractOpenapiRequest<T>` — 基类，自动在参数中追加 `timestamp` 和 `sign`（通过 `SecUtil.sign()` 签名），access_token 放入 HTTP header
- `AbstractOpenapiJsonRequest<T>` — JSON 请求体（不自动签名，timestamp 单独追加）
- `AbstractOpenapiUploadRequest<T>` — 文件上传，管理 `FileItem` 映射

**Response**：`OpenapiResponse<T>` — 泛型包装，字段为 `errcode`、`errmsg`、`data`。

### 请求调用流程

1. `Service` 的静态方法 new 一个 `Request` 对象，传入 `accessToken`
2. `RequestTemplate.execute(request)` → `XrxsOpenapiClient.execute(request)`
3. `AbstractOpenapiClient._execute()` 负责：
   - 调用 `request.check()` 做参数校验
   - `invokeApi()` 根据 HTTP 方法+请求体类型分发到 `HttpUtil.doGet/doPost/doPostWithJson/doPostWithFile`
   - 用 fastjson `TypeReference` 反序列化响应体为 `OpenapiResponse<T>`

### 鉴权

- Token 获取: `POST /authorize/oauth/token`，OAuth2 `client_credentials` 模式
- 业务 API 请求: `access_token` 放入 HTTP header，`timestamp` + `sign` 作为请求参数签名

### 代码分层

| 包 | 用途 |
|---|---|
| `com.xinrenxinshi` | 业务 Service 类（静态方法，按模块划分） |
| `com.xinrenxinshi.request` | 请求对象（171 个），每个 API 一个类 |
| `com.xinrenxinshi.response` | 响应对象 |
| `com.xinrenxinshi.domain` | 领域模型，含子包 `attendance`、`approval`、`payroll`、`recruit` 等 |
| `com.xinrenxinshi.openapi` | 框架核心：Client、Request/Response 抽象、签名 |
| `com.xinrenxinshi.common` | 枚举常量：`HireTypeEnum`、`EmpStatusEnum`、`MethodEnum` 等 |
| `com.xinrenxinshi.util` | 工具类：`HttpUtil`（HTTP 通信）、`SecUtil`（签名）、`JsonUtils`、`RequestTemplate` |
| `com.xinrenxinshi.exception` | `ApiException`、`ParamNotValidException` |

### Service 模块一览

- `XrxsCommonService` — Token、城市列表、国籍
- `XrxsFreeLoginService` — 免登 URL 生成
- `XrxsEmployeeService` — 员工 CRUD、入职/转正/离职、文件上传下载、员工分组字段
- `XrxsDepartmentService` — 部门 CRUD、岗位、成本中心、职级
- `XrxsPayrollService` — 工资报表、工资项配置、调薪记录
- `XrxsApprovalService` — 审批流列表/详情/类型/节点操作
- `XrxsAttendanceService` — 打卡、排班、出差、销出差
- `XrxsRecruitmentService` — 招聘全数据报表
- `XrxsPushMsgService` — 订阅失败消息获取
- `XrxsLogService`、`XrxsCalculationService`、`XrxsStatisticService`、`XrxsApprisalService`、`XrxsContractService`

## 添加新 API 的模式

1. 升级 `pom.xml` 中的版本号（末位 +1）
2. 在 `com.xinrenxinshi.domain.{module}` 创建领域模型（如需要新的数据结构）
3. 在 `com.xinrenxinshi.response` 创建响应类（如需要新的响应结构）
4. 在 `com.xinrenxinshi.request` 创建 `XxxRequest` 继承 `AbstractOpenapiRequest<T>`（或 `AbstractOpenapiJsonRequest<T>`），实现 `getBizUrl()` 返回 API 路径、`getParamMap0()` 返回业务参数、`getMethod()` 返回 HTTP 方法、`getResponseTypeRef()` 返回 `TypeReference<OpenapiResponse<T>>`
5. 在对应的 Service 类中添加静态方法，构建 Request 并通过 `RequestTemplate.execute(request)` 执行
6. 在 README.md 的功能说明中注册新接口
