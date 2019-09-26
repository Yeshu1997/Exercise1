package com.stackroute.controller;


import com.stackroute.model.User;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class UserController {

    @RequestMapping("")
    public String display(ModelMap model)
    {
        User user = new User("pappu");
        model.addAttribute("output", user.getName());
        return "index";
    }

}