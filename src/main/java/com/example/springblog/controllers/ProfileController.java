package com.example.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
    public class ProfileController {

        @GetMapping("/deimos/{days}")

        public String homePage(@PathVariable String user, String password, Model model) {
            model.addAttribute("user", user);
            model.addAttribute("password", password);
            return "home";
        }
    }

