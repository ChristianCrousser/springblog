package com.example.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/hi")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hi/{cohort}")
    @ResponseBody

    public String hello(@PathVariable String cohort) {
        return "Hello " + cohort;
    }
}
