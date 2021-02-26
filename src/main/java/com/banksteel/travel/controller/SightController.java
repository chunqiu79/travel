package com.banksteel.travel.controller;

import com.banksteel.travel.entity.Sight;
import com.banksteel.travel.service.SightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class SightController {

    @Autowired
    SightService sightService;

    /*@RequestMapping(value = "/selectAllSights", method = RequestMethod.GET)
    public String selectAll(Model model) {
        Map<String, Object> result = new HashMap<>();
        List<Sight> allSights = sightService.selectSightsByCondition(null);
        model.addAttribute("allSights", allSights);
        return "sight";
    }*/
    @RequestMapping(value = "/selectAllSights", method = RequestMethod.GET)
    public ModelAndView selectAll(Map<String, Object> result) {
        List<Sight> allSights = sightService.selectSightsByCondition(null);
        result.put("ni", "ma");
        result.put("allSights", allSights);
        return new ModelAndView("sight", "result", result);
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public String detail(@PathVariable("id") Integer id, Model model) {
        Sight sight = sightService.selectSightById(id);
        model.addAttribute("sight", sight);
        return "detail";
    }

}
