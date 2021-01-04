package com.oil.OilFinding.controller;

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
    @GetMapping("/temp")
    public ModelAndView tempp(){
        ModelAndView mvv = new ModelAndView("/pages/timeline");
        return mvv;
    }
    @GetMapping("/tempp")
    public ModelAndView temppq(){
        ModelAndView mvvv = new ModelAndView("/pages/UI/timeline");
        return mvvv;
    }
}
