package com.admin.login;

import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录服务层
 */
@Service
public class LoginServices {

     private UserDao userDao;

     public User findOneUser (User user) {
        //查询数据库，用户信息是否存在
       User resUser=userDao.findOneUser(user);
       return resUser;
    }
}
