package lk.avarish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
    //controller for url '/register'
    @RequestMapping(value = "/register")
    public String register(Model model) {
        return "register";
    }

    //controller for url '/login'
    @RequestMapping(value = "/login")
    public String login(Model model) {
        return "register";
    }
}
