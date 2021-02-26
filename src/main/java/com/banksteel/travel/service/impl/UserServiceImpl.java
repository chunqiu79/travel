package com.banksteel.travel.service.impl;

import com.banksteel.travel.dao.UserDao;
import com.banksteel.travel.entity.User;
import com.banksteel.travel.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int deleteUserById(Integer id) {
        return 0;
    }

    @Override
    public int updateUserById(User user) {
        return 0;
    }

    @Override
    public User selectUserById(Integer id) {
        return null;
    }

    @Override
    public User selectUserByMap(Map<String, Object> map) {
        QueryWrapper<User> user = new QueryWrapper<>();
        user.eq("user_name", map.get("userName")).eq("password", map.get("password"));
        return userDao.selectOne(user);
    }

    @Override
    public List<User> selectUsersByCondition(String condition) {
        return null;
    }
}
