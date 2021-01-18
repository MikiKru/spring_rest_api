package com.example.spring_rest_api.controller;

import com.example.spring_rest_api.model.User;
import com.example.spring_rest_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller     // class that mapping http request methods
                // for java methods and return name of html view
public class FrontEndController {
    private UserService userService;
    @Autowired
    public FrontEndController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        // model -> can pass values, objects to html file
        // model.addAttribute(name of param in html, name of java object)
        model.addAttribute("users", userService.getAllUsers());
        return "userView";      // without .html
    }
}
