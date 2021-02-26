package com.banksteel.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TempController {

    @RequestMapping("/search")
    public String getSights(String city) {

        return null;
    }

}
