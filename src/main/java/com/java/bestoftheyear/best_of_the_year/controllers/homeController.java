package com.java.bestoftheyear.best_of_the_year.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class homeController {

    @GetMapping("/")
    public String getMethodName(Model model, @RequestParam String name) {
        model.addAttribute("name",name);
        return "home";
    }
}