package com.corey.springbootcrudjpah2.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// @ExtendWith(SpringExtension.class)
@SpringBootTest
public class StringTransUtilTest {
    
    @Autowired
    StringTransUtil stringTransUtil;

    @Test
    void testAddTwoString() {
        System.out.println(stringTransUtil.addTwoString("Hello ", "world"));
    }


}
