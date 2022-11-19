package com.example.facebook_clone_demo.controllers;

import com.example.facebook_clone_demo.dto.CommentDto;
import com.example.facebook_clone_demo.services.CommentService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.model.IModel;

@Data
@Controller
public class CommentController {
    private final CommentService commentService;
     @PostMapping("/sendComment")
    public String saveComment(@ModelAttribute CommentDto commentDto){
         commentService.saveComment(commentDto);
         return "redirect:/index";
     }
}
