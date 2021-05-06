package com.xinrenxinshi.common;

/**
 * 常量类
 *
 * @author: liuchenhui
 * @create: 2019-10-24 18:08
 **/
public class Constants {

    /**
     * 默认时间格式
     **/
    public static final String DATE_STRING_FORMAT = "yyyy-MM-dd";

    /**
     * Date默认时区
     **/
    public static final String DATE_TIMEZONE = "GMT+8";

    /**
     * UTF-8字符集
     **/
    public static final String CHARSET_UTF8 = "UTF-8";

    /**
     * 分页的范围
     */
    public static final Integer ONE_HUNDRED = 100;
    public static final Integer ZERO = 0;

    /**
     * HTTP请求相关
     **/
    public static final String METHOD_POST = "POST";
    public static final String METHOD_GET = "GET";
    public static final String CTYPE_FORM_DATA = "application/x-www-form-urlencoded";
    public static final String CTYPE_FILE_UPLOAD = "multipart/form-data";
    public static final String CTYPE_TEXT_XML = "text/xml";
    public static final String CTYPE_APPLICATION_XML = "application/xml";
    public static final String CTYPE_TEXT_PLAIN = "text/plain";
    public static final String CTYPE_APP_JSON = "application/json";

    /**
     * 响应编码
     */
    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_ENCODING_GZIP = "gzip";

    /**
     * 默认媒体类型
     **/
    public static final String MIME_TYPE_DEFAULT = "application/octet-stream";

    /**
     * 默认流式读取缓冲区大小
     **/
    public static final int READ_BUFFER_SIZE = 1024 * 4;

    /**
     * 授权方式常量
     */
    public static final String GRANT_TYPE_CREDENTIALS = "client_credentials";

    /**
     * 是否包含子部门
     */
    public static final Integer CONTAINS_DEPARTMENT = 1;
    public static final Integer DOES_NOT_CONTAIN_SUB_DEPARTMENTS = 0;

    /**
     * 查询员工数量，单次数量限制
     */
    public static final Integer LIMIT_NUMBER_PAGES = 100;

    /**
     * 员工手机端免登url
     */
    public static final String MOBILE_FREE_LOGIN_BIZ_URL = "/v4/login/h5";
    /**
     * 员工PC端免登
     */
    public static final String PC_FREE_LOGIN_BIZ_URL = "/v4/login/pc";
}
