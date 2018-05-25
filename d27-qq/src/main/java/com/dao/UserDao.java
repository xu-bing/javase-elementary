package com.dao;

import com.qq.User;
import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UserDao {

    public User queryUser(User user){
        User user1 = null;

        Properties prop = new Properties();


        try {
//            InputStream is = new FileInputStream("E:\\xab\\classified\\java\\intellij\\boode\\boode_javabase\\d27-qq\\src\\main\\java\\com\\dao\\user.properties");
//            InputStream is = new FileInputStream("/user.properties");
            InputStream is = UserDao.class.getResourceAsStream("/user.properties");

            prop.load(is);

            String username = prop.getProperty(user.getUsername());
            String password = prop.getProperty(user.getPassword());

            user1 = new User(username, password);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return user1;
    } // queryUser
}
