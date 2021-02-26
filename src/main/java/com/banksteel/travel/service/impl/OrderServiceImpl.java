package com.banksteel.travel.service.impl;

import com.banksteel.travel.dao.OrderDao;
import com.banksteel.travel.entity.Order;
import com.banksteel.travel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public int insertOrder(Order order) {
        return 0;
    }

    @Override
    public int deleteOrderById(Integer id) {
        return 0;
    }

    @Override
    public int updateOrderById(Order order) {
        return 0;
    }

    @Override
    public Order selectOrderById(Integer id) {
        return null;
    }

    @Override
    public List<Order> selectOrdersByCondition(String condition) {
        return null;
    }

    @Override
    public List<Order> selectOrdersByUserId(Integer id) {
        return null;
    }

}
