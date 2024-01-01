package com.abbasi.springThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","","/home"})
    public String index(Model model){
        model.addAttribute("userName","John Doe");
        return "index";
    }
}
