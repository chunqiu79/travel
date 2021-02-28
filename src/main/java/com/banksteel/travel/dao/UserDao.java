package com.banksteel.travel.dao;

import com.banksteel.travel.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserDao extends BaseMapper<User> {

}