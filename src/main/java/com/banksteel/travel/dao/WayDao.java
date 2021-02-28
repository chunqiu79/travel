package com.banksteel.travel.dao;

import com.banksteel.travel.entity.Way;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository("wayDao")
public interface WayDao extends BaseMapper<Way> {

}