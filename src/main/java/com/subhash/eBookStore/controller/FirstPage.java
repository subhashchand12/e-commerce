package com.subhash.eBookStore.controller;

import com.subhash.eBookStore.entity.User;
import com.subhash.eBookStore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FirstPage {

    @Autowired
    UserService userService;

    @GetMapping("/view")
    public String viewPage(){
        return "view";
    }

    @GetMapping("/register")
    public String register(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return "register";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/getInfo")
    public String gtInfo(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/view";

    }



}
