package com.example.spring_rest_api.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// CheetSheet
// ALT + Enter -> auto-hints
// CTRL + SHIFT + F10 -> run application server
// CTRL + D -> duplicate line
// ALT + Ins -> auto-generate
@RestController   // controller class -> mapping http request for method java methods
public class MainController {
    @GetMapping("/")        // http://www.localhost:8080/
    public String homepage(){
        return "Hello in hompage";
    }

}
