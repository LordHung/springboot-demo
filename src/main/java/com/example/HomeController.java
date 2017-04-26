package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class HomeController{
    
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("message", "class SE109.H21");
    }
}
