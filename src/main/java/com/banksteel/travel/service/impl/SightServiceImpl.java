package com.banksteel.travel.service.impl;

import com.banksteel.travel.dao.SightDao;
import com.banksteel.travel.entity.Sight;
import com.banksteel.travel.service.SightService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sightService")
public class SightServiceImpl implements SightService {

    @Autowired
    private SightDao sightDao;

    @Override
    public int insertSight(Sight sight) {
        int count = 0;
        if (sight != null) {
            count = sightDao.insert(sight);
        }
        return count;
    }

    @Override
    public int deleteSightById(Integer id) {
        int count = 0;
        if (id != null) {
            count = sightDao.deleteById(id);
        }
        return count;
    }

    @Override
    public int updateSightById(Sight sight) {
        int count = 0;
        if (sight != null && sight.getId() != null) {
            Integer id = sight.getId();
            count = sightDao.updateById(sight);
        }
        return count;
    }

    @Override
    public Sight selectSightById(Integer id) {
        if (id == null) {
            return null;
        }
        return sightDao.selectById(id);
    }

    @Override
    public List<Sight> selectSightsByCondition(String condition) {
        QueryWrapper<Sight> sightWrapper = new QueryWrapper<>();
        return sightDao.selectList(sightWrapper);
    }

}
