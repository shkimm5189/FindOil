package com.oil.OilFinding.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/oil")
public class UserController {
    @GetMapping("/login")
    public ModelAndView create(){
        ModelAndView mv = new ModelAndView("/pages/loginPage");
        return mv;
    }

}
