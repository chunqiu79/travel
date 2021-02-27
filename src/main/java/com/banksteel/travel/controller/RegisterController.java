package com.banksteel.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @RequestMapping("/userRegister")
    public String register() {
        return "register";
    }

}
