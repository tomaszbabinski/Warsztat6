package pl.coderslab.warsztat6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String renderMainPage(){
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String MainPage(){
        return "/home/home";
        }



}



