package com.cqpms.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日期操作工具类
 *
 * @author huangyong
 * @since 1.0
 */
public class DateUtil {

    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);

    private static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");

    /**
     * 格式化日期与时间
     */
    public static String formatDatetime(long timestamp) {
        return DATE_TIME_FORMAT.format(new Date(timestamp));
    }

    /**
     * 格式化日期与时间, 重载入参为Date类型
     */
    public static String formatDatetime(Date dateTime) {
        return DATE_TIME_FORMAT.format(dateTime);
    }

    /**
     * 格式化日期
     */
    public static String formatDate(long timestamp) {
        return DATE_FORMAT.format(new Date(timestamp));
    }

    /**
     * 格式化日期, 重载入参为Date类型
     */
    public static String formatDate(Date date) {
        return DATE_FORMAT.format(date);
    }


    /**
     * 格式化时间
     */
    public static String formatTime(long timestamp) {
        return TIME_FORMAT.format(new Date(timestamp));
    }

    /**
     * 格式化时间，, 重载入参为Date类型
     */
    public static String formatTime(Date time) {
        return TIME_FORMAT.format(time);
    }

    /**
     * 获取当前日期与时间
     */
    public static String getCurrentDatetime() {
        return DATE_TIME_FORMAT.format(new Date());
    }

    /**
     * 获取当前日期
     */
    public static String getCurrentDate() {
        return DATE_FORMAT.format(new Date());
    }

    /**
     * 获取当前时间
     */
    public static String getCurrentTime() {
        return TIME_FORMAT.format(new Date());
    }

    /**
     * 解析日期与时间
     */
    public static Date parseDatetime(String str) {
        Date date = null;
        try {
            date = DATE_TIME_FORMAT.parse(str);
        } catch (ParseException e) {
            logger.error("解析日期字符串出错！格式：yyyy-MM-dd HH:mm:ss", e);
        }
        return date;
    }

    /**
     * 解析日期
     */
    public static Date parseDate(String str) {
        Date date = null;
        try {
            date = DATE_FORMAT.parse(str);
        } catch (ParseException e) {
            logger.error("解析日期字符串出错！格式：yyyy-MM-dd", e);
        }
        return date;
    }

    /**
     * 解析时间
     */
    public static Date parseTime(String str) {
        Date date = null;
        try {
            date = TIME_FORMAT.parse(str);
        } catch (ParseException e) {
            logger.error("解析日期字符串出错！格式：HH:mm:ss", e);
        }
        return date;
    }
}
