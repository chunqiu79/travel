package com.banksteel.travel.service;

import com.banksteel.travel.entity.User;
import com.banksteel.travel.entity.Way;

import java.util.List;

public interface WayService {

    int insertWay(Way wy);

    int deleteWayById(Integer id);

    int updateWayById(Way way);

    Way selectWayById(Integer id);

    List<Way> selectWaysByCondition(String condition);

}
