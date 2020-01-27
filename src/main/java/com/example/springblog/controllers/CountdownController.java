package com.example.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    public class CountdownController {

        @GetMapping("/countdown")
        @ResponseBody

        public String hello() {
            return "31 days left until we are done";
        }

        @GetMapping("/countdown/{deimos}")
        @ResponseBody

        public String hello(@PathVariable String deimos) {
            return "Exactly one month. " + deimos;
        }
    }

