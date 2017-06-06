package lk.avarish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "index";
    }

    //controller for url '/bmi'
    @RequestMapping(value = "/bmi")
    public String bmi() {
        return "bmi";
    }

    //controller for url '/protein'
    @RequestMapping(value = "/protein")
    public String protein() {
        return "protein";
    }

}
