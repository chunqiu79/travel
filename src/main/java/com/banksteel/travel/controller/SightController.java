package com.banksteel.travel.controller;

import com.banksteel.travel.entity.Sight;
import com.banksteel.travel.service.SightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class SightController {

    @Autowired
    SightService sightService;

    @RequestMapping(value = "/searchSights", method = RequestMethod.GET)
    public ModelAndView searchSights(@RequestParam("destination") String destination, Map<String, Object> result) {
        List<Sight> sights = sightService.selectSightsByCondition(destination);
        result.put("allSights", sights);
        return new ModelAndView("sight", "result", result);
    }

    @RequestMapping(value = "/selectAllSights", method = RequestMethod.GET)
    public ModelAndView selectAllSights(Map<String, Object> result) {
        List<Sight> allSights = sightService.selectSightsByCondition(null);
        result.put("allSights", allSights);
        return new ModelAndView("sight", "result", result);
    }

    @RequestMapping(value = "/carousel", method = RequestMethod.GET)
    public ModelAndView carousel(Map<String, Object> result) {
        List<Sight> allSights = sightService.selectSightsByCondition(null);
        result.put("allSights", allSights);
        return new ModelAndView("carousel", "result", result);
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public ModelAndView detail(@PathVariable("id") Integer id, Map<String, Object> result) {
        Sight sight = sightService.selectSightById(id);
        result.put("sight", sight);
        return new ModelAndView("detail", "result", result);
    }

}
