package pl.coderslab.warsztat6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.warsztat6.dto.TweetDto;
import pl.coderslab.warsztat6.repository.TweetRepository;

@Controller
public class HomeController {

    TweetRepository tweetRepository;

    @Autowired
    public HomeController(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @GetMapping("/")
    public String renderMainPage(){
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String MainPage(Model model){
        model.addAttribute("tweetDto",new TweetDto());
        model.addAttribute("tweets",tweetRepository.findAll());
        return "/home/home";
    }


}



