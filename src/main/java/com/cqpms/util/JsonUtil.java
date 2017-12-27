package com.cqpms.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JSON 操作工具类
 *
 * @author huangyong
 * @since 1.0
 */
public class JsonUtil {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 将 Java 对象转为 JSON 字符串
     */
    public static <T> String toJSON(T obj) {
        String jsonStr;
        try {
            jsonStr = OBJECT_MAPPER.writeValueAsString(obj);
        } catch (Exception e) {
            logger.error("Java 转 JSON 出错！", e);
            throw new RuntimeException(e);
        }
        return jsonStr;
    }

    /**
     * 将 JSON 字符串转为 Java 对象
     * 注：String jsonStr = "{'username':'tom','password':'123456','age':20}";    // 转化错吴
           String jsonStr =  "{\"username\":\"tom\",\"password\":\"123456\",\"age\":20}";  // 转化正确
     */
    public static <T> T fromJSON(String json, Class<T> type) {
        T obj;
        try {
            obj = OBJECT_MAPPER.readValue(json, type);
        } catch (Exception e) {
            logger.error("JSON 转 Java 出错！", e);
            throw new RuntimeException(e);
        }
        return obj;
    }
}
