package com.banksteel.travel.controller;

import com.banksteel.travel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/hotel/{userId}")
    public ModelAndView getHotelOrder(@PathVariable("userId") Integer userId, Map<String, Object> result) {
        // orderService.selectOrdersByCondition()
        return new ModelAndView("order", "result", result);
    }

}
