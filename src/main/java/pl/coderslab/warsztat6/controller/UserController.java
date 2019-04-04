package pl.coderslab.warsztat6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.warsztat6.dto.UserDto;
import pl.coderslab.warsztat6.entity.User;
import pl.coderslab.warsztat6.repository.UserRepository;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("user", new UserDto());
        return "user/login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "/user/register";
    }

    @PostMapping("/login")
    public String register(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/user/register";
        }
        if (userDto.getPassword() != null && !userDto.getPassword().trim().equals("") && !userDto.getPassword().equals(userDto.getPasswordRepeat()))

            result.rejectValue("passwordRepeat", "PasswordsDoNotMatch", "Passwords must match");

        User u = new User(userDto);

        this.userRepository.save(u);

        return "redirect:login";
    }
}
