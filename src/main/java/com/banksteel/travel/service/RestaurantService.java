package com.banksteel.travel.service;

import com.banksteel.travel.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    int insertRestaurant(Restaurant restaurant);

    int deleteRestaurantById(Integer id);

    int updateRestaurantById(Restaurant restaurant);

    Restaurant selectRestaurantById(Integer id);

    List<Restaurant> selectRestaurantsByCondition(String condition);

}
