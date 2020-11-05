package com.xinrenxinshi.util;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <数据导出到csv工具类>.
 *
 * @author peng cheng
 * @date 2020/11/4
 * @since
 */
public class ExportUtil {

    /**
     * 导出csv文件
     *
     * @param exportData 导出的数据
     * @param path       路径
     * @param name       文件名称
     */
    public static void exportCSV(List<LinkedHashMap<String, Object>> exportData, String path, String name) {
        BufferedWriter buffCvsWriter = null;
        path = path.endsWith("/") ? path : path + "/";
        File file = new File(path + name);
        try {
            buffCvsWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "GB2312"));
            // 将body数据写入表格
            for (Iterator<LinkedHashMap<String, Object>> iterator = exportData.iterator(); iterator.hasNext(); ) {
                fillDataToCsv(buffCvsWriter, iterator.next());
                if (iterator.hasNext()) {
                    buffCvsWriter.newLine();
                }
            }
            // 刷新缓冲
            buffCvsWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (buffCvsWriter != null) {
                try {
                    buffCvsWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 填充数据
     *
     * @param buffCvsWriter
     * @param row
     * @throws IOException
     */
    private static void fillDataToCsv(BufferedWriter buffCvsWriter, LinkedHashMap row) throws IOException {
        Map.Entry propertyEntry;
        for (Iterator<Map.Entry> propertyIterator = row.entrySet().iterator(); propertyIterator.hasNext(); ) {
            propertyEntry = propertyIterator.next();
            String value = propertyEntry.getValue() == null ? "" : propertyEntry.getValue().toString();
            buffCvsWriter.write("\"" + value + "\"");
            if (propertyIterator.hasNext()) {
                buffCvsWriter.write(",");
            }
        }
    }


}
