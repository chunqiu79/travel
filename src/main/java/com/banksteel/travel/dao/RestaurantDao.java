package com.banksteel.travel.dao;

import com.banksteel.travel.entity.Restaurant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository("restaurantDao")
public interface RestaurantDao extends BaseMapper<Restaurant> {

}