package com.xinrenxinshi.util;


import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import lombok.extern.slf4j.Slf4j;

/**
 * 加密类
 *
 * @author: liuchenhui
 * @create: 2019-10-25 18:14
 **/
@Slf4j
public class SecUtil {

    /**
     * 生成签名
     */
    public static String sign(Map<String, Object> map, String appSecret) {
        // 移除值为空的键值对
        Set<String> set = map.keySet();
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            String key = (String) iterator.next();
            Object value = map.get(key);
            if (value == null) {
                iterator.remove();
            }
        }
        // 将请求参数排序并用"&"拼接
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        StringBuilder prestr = new StringBuilder();
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = map.get(key).toString();
            if (i == keys.size() - 1) {
                prestr.append(key).append("=").append(value);
            } else {
                prestr.append(key).append("=").append(value).append("&");
            }
        }
        String keystr = prestr.toString();
        String encrypt = SecUtil.encrypt(keystr, appSecret);
        return encrypt;
    }

    /**
     * 生成签名
     */
    public static String sign(String content, String appSecret) {
        return SecUtil.encrypt(content, appSecret);
    }

    /**
     * 加密
     */
    private static String encrypt(String content, String appSecret) {
        try {
            SecretKeySpec localSecretKeySpec = new SecretKeySpec(appSecret.getBytes("UTF-8"), "HmacSHA1");
            Mac localMac = Mac.getInstance("HmacSHA1");
            localMac.init(localSecretKeySpec);
            localMac.update(content.getBytes("UTF-8"));
            return Base64.encodeBase64String(localMac.doFinal());
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 对字段进行单独加密
     */
    public static String encryptField(String strToEncrypt, String appSecret) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

            cipher.init(Cipher.ENCRYPT_MODE, getKey(appSecret));


            return Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));

        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    private static SecretKeySpec getKey(String appSecret) {
        MessageDigest sha = null;
        try {
            byte[] key = appSecret.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            String s = parseByte2HexStr(key);
            String substring = s.substring(0, 16);
            String s1 = substring.toLowerCase();
            SecretKeySpec secretKey = new SecretKeySpec(s1.getBytes(), "AES");
            return secretKey;

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * 将二进制转换成16进制
     */
    private static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }


    /**
     * URL 解码
     */
    public static String getURLDecoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        if (str.contains("+")) {
            str = str.replaceAll("\\+", "%2B");
        }
        try {
            result = java.net.URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
        }
        return result;
    }

    /**
     * URL 转码
     */
    public static String getURLEncoderString(String str) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = java.net.URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
        }
        return result;
    }
}