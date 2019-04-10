package pl.coderslab.warsztat6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.warsztat6.dto.CommentDto;
import pl.coderslab.warsztat6.dto.TweetDto;
import pl.coderslab.warsztat6.entity.Tweet;
import pl.coderslab.warsztat6.entity.User;
import pl.coderslab.warsztat6.repository.TweetRepository;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/tweet")
public class TweetController {

    TweetRepository tweetRepository;

    @Autowired
    public TweetController(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @GetMapping("/add")
    public String add(Model model, HttpSession session){
        model.addAttribute("tweetDto", new TweetDto());
        model.addAttribute("user",session.getAttribute("loggedInUser"));
        return "/tweet/add";
    }

    @PostMapping("/add")
    public String addTweet(@Valid TweetDto tweetDto, BindingResult result, HttpSession session){
        if(result.hasErrors()){
            return "/tweet/add";
        }
        LocalDateTime now = LocalDateTime.now();
        tweetDto.setCreated(now);
        Tweet tweet = new Tweet(tweetDto);
        tweet.setUser((User) session.getAttribute("loggedInUser"));
        tweetRepository.save(tweet);
        return "redirect:/home";
    }

    @GetMapping("/getTweet/{id}")
    public String getTweet(@PathVariable Long id,Model model){
        model.addAttribute("tweet",tweetRepository.findById(id));
        model.addAttribute("commentDto",new CommentDto());
        return "/tweet/tweetInfo";

    }

}
