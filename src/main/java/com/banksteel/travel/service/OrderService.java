package com.banksteel.travel.service;

import com.banksteel.travel.entity.Order;

import java.util.List;

public interface OrderService {

    int insertOrder(Order order);

    int deleteOrderById(Integer id);

    int updateOrderById(Order order);

    Order selectOrderById(Integer id);

    List<Order> selectOrdersByCondition(String condition);

    List<Order> selectOrdersByUserId(Integer id);

}
