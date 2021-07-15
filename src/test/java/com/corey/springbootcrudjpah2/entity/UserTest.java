package com.corey.springbootcrudjpah2.entity;

import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void testGetAddress() {
        User user = new User();
        user.setAddress("Taipei");
        System.out.println(user.getAddress());
    }
}
