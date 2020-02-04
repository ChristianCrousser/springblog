package com.example.springblog.controllers;


import com.example.springblog.models.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

//        @GetMapping("/login")
//        @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.GET)

    public String GetLoginForm() {
        return "login";
    }

//    @GetMapping("/login")
//    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)

    public String login(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model) {

        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        if ("admin".equals(username) && "admin".equals(password)) {
            return "home";
        }

        model.addAttribute("invalidCredintials", true);

        return "login";


    }
}
