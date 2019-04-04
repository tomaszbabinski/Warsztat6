package pl.coderslab.warsztat6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.warsztat6.dto.UserDto;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {



    @GetMapping("/login")
    public String register(Model model){
        model.addAttribute("userDto",new UserDto());
        return "/user/login";
    }

    @PostMapping("/login")
    public String register(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/user/login";
        }


        return "";
    }
}
