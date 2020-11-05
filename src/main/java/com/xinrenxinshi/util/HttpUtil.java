package com.xinrenxinshi.util;

import com.xinrenxinshi.common.Constants;
import com.xinrenxinshi.exception.ApiException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import lombok.extern.slf4j.Slf4j;

/**
 * 网络工具类
 *
 * @author: liuchenhui
 * @create: 2019-10-24 18:06
 **/
@Slf4j(topic = "openapi-sdk-java")
public abstract class HttpUtil {

    private static final String DEFAULT_CHARSET = Constants.CHARSET_UTF8;
    private static boolean ignoreSSLCheck = true; // 忽略SSL检查
    private static boolean ignoreHostCheck = true; // 忽略HOST检查

    public static class TrustAllTrustManager implements X509TrustManager {
        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }
    }

    private HttpUtil() {
    }

    public static void setIgnoreSSLCheck(boolean ignoreSSLCheck) {
        HttpUtil.ignoreSSLCheck = ignoreSSLCheck;
    }

    public static void setIgnoreHostCheck(boolean ignoreHostCheck) {
        HttpUtil.ignoreHostCheck = ignoreHostCheck;
    }

    /**
     * ======================================doPost请求=============================
     */
    /**
     * 执行HTTP POST请求。
     *
     * @param url    请求地址
     * @param params 请求参数
     * @return 响应字符串
     */
    public static String doPost(String url, Map<String, Object> params, int connectTimeout, int readTimeout) throws ApiException {
        return doPost(url, params, DEFAULT_CHARSET, connectTimeout, readTimeout, null, null);
    }

    public static String doPost(String url, Map<String, Object> params, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws ApiException {
        return doPost(url, params, DEFAULT_CHARSET, connectTimeout, readTimeout, headerMap, null);
    }


    public static String doPost(String url, Map<String, Object> params, String charset, int connectTimeout, int readTimeout, Map<String, String> headerMap, Proxy proxy) throws ApiException {
        log.warn("request url : " + url + " | request param: " + JsonUtils.toJson(params));
//        String ctype = "application/x-www-form-urlencoded;charset=" + charset;
        try {
            String query = buildQuery(params, charset);
            byte[] content = {};
            if (query != null) {
                content = query.getBytes(charset);
            }
            return _doPost(url, null, content, connectTimeout, readTimeout, headerMap, proxy);
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        }
    }

    /**
     * 执行请求 content_type: aplication/json
     */
    public static String doPostWithJson(String url, Map<String, Object> params, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws ApiException {
        String ctype = "application/json;charset=" + DEFAULT_CHARSET;
        //公共参数 处理在URL后
        Map<String, Object> commonsMap = new HashMap<>(2);
        commonsMap.put("sign", String.valueOf(params.get("sign")));
        commonsMap.put("timestamp", String.valueOf(params.get("timestamp")));
        String queryParam = buildQuery(commonsMap, DEFAULT_CHARSET);

        String postUrl = buildRequestUrl(url, queryParam);

        log.warn("request url : " + postUrl + " | request param: " + JsonUtils.toJson(params));
        try {
            byte[] content = {};

            if (params != null) {
                String body = JsonUtils.toJson(params);
                content = body.getBytes(DEFAULT_CHARSET);
            }
            return _doPostJson(postUrl, ctype, content, connectTimeout, readTimeout, headerMap);
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        }
    }

    private static String _doPost(String url, String ctype, byte[] content, int connectTimeout, int readTimeout, Map<String, String> headerMap, Proxy proxy) throws ApiException {
        HttpURLConnection conn = null;
        OutputStream out = null;
        String rsp;
        try {
            conn = getConnection(new URL(url), Constants.METHOD_POST, ctype, headerMap, proxy);// _doPost
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
            out = conn.getOutputStream();
            out.write(content);
            rsp = getResponseAsString(conn);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }

        return rsp;
    }

    /**
     * 执行Body 为Json 的 POST请求。
     *
     * @param url 请求地址
     * @return 响应字符串
     */
    public static String _doPostJson(String url, String ctype, byte[] content, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws ApiException {

        HttpURLConnection conn = null;
        OutputStream out = null;


        String rsp;
        try {
            conn = getConnection(new URL(url), Constants.METHOD_POST, ctype, headerMap, null);// _doPost
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
            out = conn.getOutputStream();
            out.write(content);
            rsp = getResponseAsString(conn);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }

        return rsp;
    }


    /**
     * ======================================doPostWithFile请求=============================
     */

    /**
     * 执行带文件上传的HTTP POST请求。
     *
     * @param url        请求地址
     * @param fileParams 文件请求参数
     * @return 响应字符串
     */
    public static String doPostWithFile(String url, Map<String, Object> params, Map<String, FileItem> fileParams, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws ApiException {
        log.warn("request url : " + url + " | request param: " + JsonUtils.toJson(params));
        if (fileParams == null || fileParams.isEmpty()) {
            return doPost(url, params, connectTimeout, readTimeout);
        } else {
            return _doPostWithFile(url, params, fileParams, connectTimeout, readTimeout, headerMap);
        }
    }

    private static String _doPostWithFile(String url, Map<String, Object> params, Map<String, FileItem> fileParams,
                                          int connectTimeout, int readTimeout, Map<String, String> headerMap) throws ApiException {
        String boundary = String.valueOf(System.nanoTime()); // 随机分隔线
        HttpURLConnection conn = null;
        OutputStream out = null;
        String rsp = null;
        try {
            String ctype = "multipart/form-data;charset=" + DEFAULT_CHARSET + ";boundary=" + boundary;
            conn = getConnection(new URL(url), Constants.METHOD_POST, ctype, headerMap, null);// _doPostWithFile
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
            out = conn.getOutputStream();
            byte[] entryBoundaryBytes = ("\r\n--" + boundary + "\r\n").getBytes(DEFAULT_CHARSET);

            // 组装文本请求参数
            Set<Map.Entry<String, Object>> textEntrySet = params.entrySet();
            for (Map.Entry<String, Object> textEntry : textEntrySet) {
                byte[] textBytes = getTextEntry(textEntry.getKey(), textEntry.getValue());
                out.write(entryBoundaryBytes);
                out.write(textBytes);
            }

            // 组装文件请求参数
            Set<Map.Entry<String, FileItem>> fileEntrySet = fileParams.entrySet();
            for (Map.Entry<String, FileItem> fileEntry : fileEntrySet) {
                FileItem fileItem = fileEntry.getValue();
                if (!fileItem.isValid()) {
                    throw new ApiException("FileItem is invalid");
                }
                byte[] fileBytes = getFileEntry(fileEntry.getKey(), fileItem.getFileName(), fileItem.getMimeType());
                out.write(entryBoundaryBytes);
                out.write(fileBytes);
                fileItem.write(out);
            }

            // 添加请求结束标志
            byte[] endBoundaryBytes = ("\r\n--" + boundary + "--\r\n").getBytes(DEFAULT_CHARSET);
            out.write(endBoundaryBytes);
            rsp = getResponseAsString(conn);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }

        return rsp;
    }

    /**
     * ======================================doGetDownloadFile请求=============================
     */

    public static InputStream doGetDownloadFile(String strUrl, Map<String, Object> params, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws ApiException {
        log.warn("request url : " + strUrl + " | request param: " + JsonUtils.toJson(params));
        HttpURLConnection conn = null;
        try {
            String query = buildQuery(params, DEFAULT_CHARSET);
            conn = getDownLoadConnection(buildGetUrl(strUrl, query), Constants.METHOD_GET, headerMap);// doGetDownloadFile
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
            final ByteArrayOutputStream output = new ByteArrayOutputStream();
            int n;
            InputStream input = conn.getInputStream();
            if (input == null) {
                String rsp = getResponseAsString(conn);
                throw new ApiException(rsp);
            }
            byte[] buffer = new byte[1024 * 4];
            while (-1 != (n = input.read(buffer))) {
                output.write(buffer, 0, n);
            }
            return new ByteArrayInputStream(output.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            log.error(e.getMessage(), e);
        } finally {
            try {
                if (conn != null) {
                    conn.disconnect();
                }
            } catch (Exception e) {
                log.error(e + "");
            }
        }
        return null;
    }

    /**
     *======================================doGet请求=============================
     */

    /**
     * 执行HTTP GET请求
     */
    public static String doGet(String url, Map<String, Object> params, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws ApiException {
        return doGet(url, params, DEFAULT_CHARSET, connectTimeout, readTimeout, headerMap);
    }

    /**
     * 执行HTTP GET请求。
     *
     * @param url     请求地址
     * @param params  请求参数
     * @param charset 字符集，如UTF-8, GBK, GB2312
     * @return 响应字符串
     */
    public static String doGet(String url, Map<String, Object> params, String charset, int connectTimeout, int readTimeout, Map<String, String> headerMap) throws ApiException {
        log.warn("request url : " + url + " | request param: " + JsonUtils.toJson(params));
        HttpURLConnection conn = null;
        String rsp;
        try {
//            String ctype = "application/x-www-form-urlencoded;charset=" + charset;
            String query = buildQuery(params, charset);
            conn = getConnection(buildGetUrl(url, query), Constants.METHOD_GET, null, headerMap, null); // doGet
            conn.setConnectTimeout(connectTimeout);
            conn.setReadTimeout(readTimeout);
            rsp = getResponseAsString(conn);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }

        return rsp;
    }


    /**
     * ======================================公共方法=============================
     */
    /**
     * 获取下载Connection
     */
    private static HttpURLConnection getDownLoadConnection(URL buildGetUrl, String methodGet, Map<String, String> headerMap) throws ApiException {
        try {
            HttpURLConnection conn = (HttpURLConnection) buildGetUrl.openConnection();
            conn.setRequestMethod(methodGet);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            if (headerMap != null) {
                for (Map.Entry<String, String> entry : headerMap.entrySet()) {
                    conn.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            return conn;
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        }
    }

    /**
     * 获取连接
     */
    private static HttpURLConnection getConnection(URL url, String method, String ctype, Map<String, String> headerMap, Proxy proxy) throws ApiException {
        try {
            HttpURLConnection conn = null;
            if (proxy == null) {
                conn = (HttpURLConnection) url.openConnection();
            } else {
                conn = (HttpURLConnection) url.openConnection(proxy);
            }
            if (conn instanceof HttpsURLConnection) {
                HttpsURLConnection connHttps = (HttpsURLConnection) conn;
                if (ignoreSSLCheck) {
                    try {
                        SSLContext ctx = SSLContext.getInstance("TLS");
                        ctx.init(null, new TrustManager[]{new TrustAllTrustManager()}, new SecureRandom());
                        connHttps.setSSLSocketFactory(ctx.getSocketFactory());
                        connHttps.setHostnameVerifier((hostname, session) -> true);
                    } catch (Exception e) {
                        throw new ApiException(e.toString());
                    }
                } else {
                    if (ignoreHostCheck) {
                        connHttps.setHostnameVerifier((hostname, session) -> true);
                    }
                }
                conn = connHttps;
            }

            conn.setRequestMethod(method);
            conn.setDoInput(true);
            conn.setDoOutput(true);
//        conn.setRequestProperty("Host", url.getHost());
//        conn.setRequestProperty("Accept", "text/xml,text/javascript");
//        conn.setRequestProperty("User-Agent", "openapi-sdk-java");
            if (ctype != null) {
                conn.setRequestProperty("Content-Type", ctype);
            }
            if (headerMap != null) {
                for (Map.Entry<String, String> entry : headerMap.entrySet()) {
                    conn.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            return conn;
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        }
    }

    private static URL buildGetUrl(String url, String query) throws ApiException {
        try {
            if (XRXSStrUtils.isEmpty(query)) {
                return new URL(url);
            }

            return new URL(buildRequestUrl(url, query));
        } catch (MalformedURLException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        }
    }

    public static String buildRequestUrl(String url, String... queries) {
        if (queries == null || queries.length == 0) {
            return url;
        }

        StringBuilder newUrl = new StringBuilder(url);
        boolean hasQuery = url.contains("?");
        boolean hasPrepend = url.endsWith("?") || url.endsWith("&");

        for (String query : queries) {
            if (!XRXSStrUtils.isEmpty(query)) {
                if (!hasPrepend) {
                    if (hasQuery) {
                        newUrl.append("&");
                    } else {
                        newUrl.append("?");
                        hasQuery = true;
                    }
                }
                newUrl.append(query);
                hasPrepend = false;
            }
        }
        return newUrl.toString();
    }

    public static String buildQuery(Map<String, Object> params, String charset) {
        if (params == null || params.isEmpty()) {
            return null;
        }

        StringBuilder query = new StringBuilder();
        Set<Map.Entry<String, Object>> entries = params.entrySet();
        boolean hasParam = false;

        try {
            for (Map.Entry<String, Object> entry : entries) {
                String name = entry.getKey();
                Object value = entry.getValue();
                String valueStr = value == null ? null : value.toString();
                // 忽略参数名或参数值为空的参数
                if (XRXSStrUtils.areNotEmpty(name) && valueStr != null) {
                    if (hasParam) {
                        query.append("&");
                    } else {
                        hasParam = true;
                    }

                    query.append(name).append("=").append(URLEncoder.encode(valueStr, charset));
                }
            }
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
        }

        return query.toString();
    }

    protected static String getResponseAsString(HttpURLConnection conn) throws ApiException {
        try {
            String charset = getResponseCharset(conn.getContentType());
            if (conn.getResponseCode() < HttpURLConnection.HTTP_BAD_REQUEST) {
                String contentEncoding = conn.getContentEncoding();
                if (Constants.CONTENT_ENCODING_GZIP.equalsIgnoreCase(contentEncoding)) {
                    String streamAsString = getStreamAsString(new GZIPInputStream(conn.getInputStream()), charset);
                    log.warn("request url : " + conn.getURL() + " | response: " + streamAsString);
                    return streamAsString;
                } else {
                    String streamAsString = getStreamAsString(conn.getInputStream(), charset);
                    log.warn("request url : " + conn.getURL() + " | response: " + streamAsString);
                    return streamAsString;
                }
            } else {
                // OAuth bad request always return 400 status
                if (conn.getResponseCode() == HttpURLConnection.HTTP_BAD_REQUEST) {
                    InputStream error = conn.getErrorStream();
                    if (error != null) {
                        return getStreamAsString(error, charset);
                    }
                }
                // Client Error 4xx and Server Error 5xx
                log.error("excute url: " + conn.getURL() + "  ;method:" + conn.getRequestMethod() + " ; errorCode:" + conn.getResponseCode() + " ;errorMessge:" + conn.getResponseMessage());
                throw new ApiException(conn.getResponseCode(), conn.getResponseMessage());
            }
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        }
    }

    public static String getStreamAsString(InputStream stream, String charset) throws ApiException {
        try {
            Reader reader = new InputStreamReader(stream, charset);
            StringBuilder response = new StringBuilder();

            final char[] buff = new char[1024];
            int read = 0;
            while ((read = reader.read(buff)) > 0) {
                response.append(buff, 0, read);
            }

            return response.toString();
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
    }

    public static String getResponseCharset(String ctype) {
        String charset = DEFAULT_CHARSET;

        if (!XRXSStrUtils.isEmpty(ctype)) {
            String[] params = ctype.split(";");
            for (String param : params) {
                param = param.trim();
                if (param.startsWith("charset")) {
                    String[] pair = param.split("=", 2);
                    if (pair.length == 2) {
                        if (!XRXSStrUtils.isEmpty(pair[1])) {
                            charset = pair[1].trim();
                        }
                    }
                    break;
                }
            }
        }

        return charset;
    }

    private static byte[] getTextEntry(String fieldName, Object fieldValue) throws ApiException {
        try {
            StringBuilder entry = new StringBuilder();
            entry.append("Content-Disposition:form-data;name=\"");
            entry.append(fieldName);
            entry.append("\"\r\nContent-Type:text/plain\r\n\r\n");
            entry.append(fieldValue == null ? "" : fieldValue.toString());
            return entry.toString().getBytes(DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        }
    }

    private static byte[] getFileEntry(String fieldName, String fileName, String mimeType) throws ApiException {
        try {
            StringBuilder entry = new StringBuilder();
            entry.append("Content-Disposition:form-data;name=\"");
            entry.append(fieldName);
            entry.append("\";filename=\"");
            entry.append(fileName);
            entry.append("\"\r\nContent-Type:");
            entry.append(mimeType);
            entry.append("\r\n\r\n");
            return entry.toString().getBytes(DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
            throw new ApiException(e.getMessage());
        }
    }
}
