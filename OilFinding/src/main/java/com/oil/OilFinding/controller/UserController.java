package com.oil.OilFinding.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/oil")
public class UserController {
    @GetMapping("/user")
    public ModelAndView create(){
        ModelAndView mv = new ModelAndView("/pages/loginPage");
        return mv;
    }
}
