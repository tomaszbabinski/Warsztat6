package pl.coderslab.warsztat6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.warsztat6.dto.CommentDto;
import pl.coderslab.warsztat6.dto.TweetDto;
import pl.coderslab.warsztat6.entity.Comment;
import pl.coderslab.warsztat6.repository.CommentRepository;

import javax.validation.Valid;

@Controller
@RequestMapping("/comment")
public class CommentController {

    CommentRepository commentRepository;

    @Autowired
    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @PostMapping("/add")
    public String add(@Valid CommentDto commentDto){

        commentRepository.save(new Comment(commentDto));
        return "redirect:/home";
    }
}
