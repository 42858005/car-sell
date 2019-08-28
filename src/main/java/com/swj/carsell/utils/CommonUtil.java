package com.swj.carsell.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class CommonUtil {


    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 将指定日期按照指定的格式以字符串的形式进行返回
     * @param pattern
     * @param date
     * @return
     */
    public static String getDate(String pattern, Date date) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }
}
