package com.corey.springbootcrudjpah2.entity;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void testGet() {
        User user = new User();
        User user2 = new User();
        if(user.getAddress() == null) {
            user.setAddress("address");
        }
        user.setAddress(user2.getAddress());
        System.out.println(user.getAddress());
    }

    @Test
    void testUserEntity() {
        User user = new User();
        user.setAddress("Taipei");
        user.setId(1);
        user.setName("Corey");
        user.setTestString("abc");
        user.setCreateDate(new Date());
        System.out.println(user);
    }
}
