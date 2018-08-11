package com.admin.login;

import com.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 登录验证数据dao层
 */
/**
 *
 * @author 严志亮
 *
 *
 *
 */
public interface UserDao {
    /**
     * 新增用户
     * @param user
     */
    void createUser(User user);
    /**
     * 查询用户列表
     * @return
     */
    List<User> findAllUser();

    /**
     * 根据用户信息查询用户是否存在，并确保用户的唯一性
     * @param user
     * @return
     */
    User findOneUser(User user);
}