package com.banksteel.travel.controller;

import com.banksteel.travel.entity.User;
import com.banksteel.travel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public ModelAndView getUser(@RequestParam("userName") String userName, @RequestParam("password") String password, Map<String, Object> result) {
        Map<String, Object> map = new HashMap<>();
        map.put("userName", userName);
        map.put("password", password);
        User user = userService.selectUserByMap(map);
        result.put("user", user);
        if (user == null) {
            return new ModelAndView("register", "result", result);
        }
        return new ModelAndView("index", "result", result);
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.GET)
    public ModelAndView login(Map<String, Object> result) {
        return new ModelAndView("login", "result", result);
    }

}
