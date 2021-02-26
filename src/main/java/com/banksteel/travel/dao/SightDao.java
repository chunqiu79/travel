package com.banksteel.travel.dao;

import com.banksteel.travel.entity.Sight;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository("sightDao")
public interface SightDao extends BaseMapper<Sight> {

}