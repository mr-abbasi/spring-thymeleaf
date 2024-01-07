package com.abbasi.springThymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpMethod;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Method;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(@RequestParam(required = false) String error,
                        @RequestParam(required = false) String logout, Model model) {
        String message = null;
        if (error != null) {
            message = "Username or Password is incorrect";
        } else if (logout != null) {
            message = "You have been successfully logged out!!";
        }
        model.addAttribute("message", message);
        return "login";
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logOut(HttpServletRequest request, HttpServletResponse response){
       Authentication auth = SecurityContextHolder.getContext().getAuthentication();
       if(auth != null){
           new SecurityContextLogoutHandler().logout(request,response,auth);
       }

       return "redirect:/login?logout=true";
    }
}
