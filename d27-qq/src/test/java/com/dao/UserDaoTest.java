package com.dao;

import com.qq.User;

import static org.junit.Assert.*;

public class UserDaoTest {

    @org.junit.Test
    public void queryUser() {
        // given
        User user = new User("tom", "123");
        UserDao userDao = new UserDao();

        // when


        // then
        assertNotNull(userDao.queryUser(user));

    }
}