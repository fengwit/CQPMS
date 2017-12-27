package com.cqpms.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Author: Fwei
 * Date: 2017/12/27 13:53
 * Description: todo用一句话描述该文件做什么
 */
public class StringUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsNumber() {
        System.out.println(StringUtil.isNumber("123.1416"));
    }
}