package com.banksteel.travel.service;

import com.banksteel.travel.entity.Sight;
import com.banksteel.travel.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    int insertUser(User user);

    int deleteUserById(Integer id);

    int updateUserById(User user);

    User selectUserById(Integer id);

    User selectUserByMap(Map<String, Object> map);

    List<User> selectUsersByCondition(String condition);

}
