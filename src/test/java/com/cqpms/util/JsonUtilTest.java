package com.cqpms.util;

import com.cqpms.domain.User;
import org.junit.Test;


/**
 * Author: Fwei
 * Date: 2017/12/27 16:21
 * Description: todo用一句话描述该文件做什么
 */
public class JsonUtilTest {

    @Test
    public void test_toJSON() {
        User user = new User("tom汤姆","123456", "tom@163.com");
        String jsonStr = JsonUtil.toJSON(user);
        System.out.println(jsonStr);
    }

    @Test
    public void test_fromJSON() {
        // 出错
        // String jsonStr = "{'username':'tom','password':'123456','age':20}";
        // 正确
        String jsonStr =  "{\"username\":\"tom汤姆\",\"password\":\"123456\",\"email\":\"tom@163.com\"}";
        User user1 = JsonUtil.fromJSON(jsonStr,User.class);
        System.out.println(user1);
    }
}