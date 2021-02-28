package com.banksteel.travel.dao;

import com.banksteel.travel.entity.Hotel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository("hotelDao")
public interface HotelDao extends BaseMapper<Hotel> {

}