package pl.coderslab.warsztat6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.warsztat6.dto.TweetDto;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/tweet")
public class TweetController {

    @GetMapping("/add")
    public String add(Model model, HttpSession session){
        model.addAttribute("tweet", new TweetDto());
        model.addAttribute("user",session.getAttribute("loggedInUser"));
        return "/tweet/add";
    }

}
