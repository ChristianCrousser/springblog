package com.example.springblog.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/deimos")

    public String homePage() {
        return "deimos";
    }

}
