package com.banksteel.travel.service;

import com.banksteel.travel.entity.City;

import java.util.List;

public interface CityService {

    int insertCity(City city);

    int deleteCityById(Integer id);

    int updateCityById(City city);

    City selectCityById(Integer id);

    List<City> selectCitysByCondition(String condition);

}
