package com.banksteel.travel.dao;

import com.banksteel.travel.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository("orderDao")
public interface OrderDao extends BaseMapper<Order> {

}