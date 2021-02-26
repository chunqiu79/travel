package com.banksteel.travel.service;

import com.banksteel.travel.entity.Hotel;

import java.util.List;

public interface HotelService {

    int insertHotel(Hotel hotel);

    int deleteHotelById(Integer id);

    int updateHotelById(Hotel hotel);

    Hotel selectHotelById(Integer id);

    List<Hotel> selectHotelsByCondition(String condition);

}
