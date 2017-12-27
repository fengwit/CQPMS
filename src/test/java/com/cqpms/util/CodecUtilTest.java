package com.cqpms.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Fwei
 * Date: 2017/12/27 14:21
 * Description: todo用一句话描述该文件做什么
 */
public class CodecUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEncodeBASE64() {
        System.out.println(CodecUtil.encodeBASE64("haha,hjk test 64!"));
    }

    @Test
    public void testEncryptMD5() {
        System.out.println(CodecUtil.encryptMD5("haha, dshfjksaf; "));
    }

    @Test
    public void encryptSHA() {
        System.out.println(CodecUtil.encryptSHA("haha, dshfjksaf; "));
    }
}