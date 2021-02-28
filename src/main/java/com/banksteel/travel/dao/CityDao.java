package com.banksteel.travel.dao;

import com.banksteel.travel.entity.City;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository("cityDao")
public interface CityDao extends BaseMapper<City> {

}