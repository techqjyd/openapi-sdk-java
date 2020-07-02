package com.xinrenxinshi.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 王元
 * 2020-01-06 10:33
 * 简单描述一下
 */
@Slf4j
public class ParamUtil {

    private static List<Class> SIMPLE_TYPE = new ArrayList<Class>();

    static {
        SIMPLE_TYPE.add(String.class);
        SIMPLE_TYPE.add(Integer.class);
        SIMPLE_TYPE.add(Long.class);
        SIMPLE_TYPE.add(Character.class);
        SIMPLE_TYPE.add(Short.class);
        SIMPLE_TYPE.add(Float.class);
        SIMPLE_TYPE.add(Boolean.class);
        SIMPLE_TYPE.add(Double.class);
        SIMPLE_TYPE.add(Byte.class);
    }

    /**
     * 对象转map
     *
     * @param obj 入参对象
     * @return map
     */
    public static Map<String, Object> buildParam(Object obj) {

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        return Arrays.stream(declaredFields).collect(Collectors.toMap(
                Field::getName,
                field -> getValue(field, obj)
        ));
    }

    private static Object getValue(Field field, Object object) {
        try {
            Class<?> type = field.getType();
            Object value = field.get(object);
            if (null == value) {
                return "";
            }
            if (type == List.class) {
                Type genericType = field.getGenericType();
                Class actualTypeArgument = null;
                if (genericType instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                    actualTypeArgument = (Class) actualTypeArguments[0];
                }

                if (SIMPLE_TYPE.contains(actualTypeArgument)) {
                    return collectionToCommaDelimitedString((Collection<?>) value);
                } else {
                    return JsonUtils.toJson(value);
                }

            } else if (!SIMPLE_TYPE.contains(value.getClass())) {
                return JsonUtils.toJson(value);
            } else {
                return value;
            }
        } catch (Throwable e) {
            log.warn("convert value error， field name:{}", field.getName(), e);
        }
        return "";
    }

    private static String collectionToCommaDelimitedString(Collection<?> collection) {
        if (null == collection || collection.isEmpty()) {
            return "";
        }

        return collection.stream()
                .filter(Objects::nonNull)
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }



}
