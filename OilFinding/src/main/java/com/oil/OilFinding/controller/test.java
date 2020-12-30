package com.oil.OilFinding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oil")
public class test {
    @GetMapping("/test")
    public String test(){
        return "hello im sunghyun";
    }
}
