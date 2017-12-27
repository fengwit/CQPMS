package com.cqpms.util;

import org.junit.After;
import org.junit.Test;


/**
 * Author: Fwei
 * Date: 2017/12/27 13:47
 * Description: todo用一句话描述该文件做什么
 */
public class ClassUtilTest {

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetClassPath() {
        System.out.println(ClassUtil.getClassPath());
    }
}