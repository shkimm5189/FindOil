package com.oil.OilFinding.controller;

import com.oil.OilFinding.config.JwtTokenProvider;
import com.oil.OilFinding.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequiredArgsConstructor
@RequestMapping("/oil")
public class UserController {
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserRepository userRepository;
    @GetMapping("/login")
    public ModelAndView create(){
        ModelAndView mv = new ModelAndView("/pages/loginPage");
        return mv;
    }

}
