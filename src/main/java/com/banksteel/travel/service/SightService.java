package com.banksteel.travel.service;

import com.banksteel.travel.entity.Sight;

import java.util.List;

public interface SightService {

    int insertSight(Sight sight);

    int deleteSightById(Integer id);

    int updateSightById(Sight sight);

    Sight selectSightById(Integer id);

    List<Sight> selectSightsByCondition(String condition);

}
