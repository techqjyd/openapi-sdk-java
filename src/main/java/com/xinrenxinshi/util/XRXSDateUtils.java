package com.xinrenxinshi.util;

import com.xinrenxinshi.exception.ApiException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 时间函数util
 *
 * @author: liuchenhui
 * @create: 2019-11-12 10:36
 **/
public abstract class XRXSDateUtils {

    public static final String DATE_FORMAT_NORMAL = "yyyy-MM-dd";
    public static final String DATE_FORMAT_YEARMO = "yyyyMM";


    public static final String[] FORMATS = new String[]{
            "yyyy-MM-dd", "yyyyMM", "yyyyMMdd", "yyyy.M.d", "yyyy.MM.dd", "yyyy-M-d",
            "yyyy/MM/dd", "yyyy/M/d", "*yyyy/M/d", "*yyyy/MM/dd", "yyyy年M月d日", "yyyy年MM月dd日"
    };

    /**
     * 获取当前时间的字符串
     */
    public static String getNowDateStr(String format) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    /**
     * 当前月
     */
    public static Integer getMonth() {
        Calendar cal = Calendar.getInstance();
        Integer month = cal.get(Calendar.MONTH) + 1;
        return month;
    }

    public static Integer getMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH) + 1;
    }

    public static Integer getDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 判断是不是时间字符串
     */
    public static boolean isDateStr(String str, String format) {
        try {
            getDateValueFromString(str, format);
        } catch (ApiException e) {
            return false;
        }
        return true;
    }

    /**
     * 使用多个format匹配，其中一个成功即返回
     */
    public static Date getDateValueFromString(String str, String format) throws ApiException {
        if (XRXSStrUtils.isEmpty(str) || XRXSStrUtils.isEmpty(format)) {
            return null;
        } else {
            SimpleDateFormat sf = new SimpleDateFormat(format);
            sf.setLenient(false);
            try {
                return sf.parse(str);
            } catch (ParseException e) {
            }
            throw new ApiException("日期格式（" + str + "）无法解析");
        }
    }

    /**
     * 使用多个format匹配，其中一个成功即返回
     */
    public static Date getDateValueFromString(String str) throws ApiException {
        if (XRXSStrUtils.isEmpty(str)) {
            return null;
        } else {
            String[] formats = getFormats();
            for (int i = 0; i < formats.length; i++) {
                String f = formats[i];
                SimpleDateFormat sf = new SimpleDateFormat(f);
                sf.setLenient(false);
                try {
                    return sf.parse(str);
                } catch (ParseException e) {
                }
            }
            throw new ApiException("日期格式（" + str + "）无法解析");
        }

    }

    public static String[] getFormats() {
        Set<String> list = new HashSet<>();
        for (String date : FORMATS) {
            list.add(date);
        }
        return list.toArray(new String[]{});
    }
}
