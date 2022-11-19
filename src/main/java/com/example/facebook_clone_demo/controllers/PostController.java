package com.example.facebook_clone_demo.controllers;

import com.example.facebook_clone_demo.dto.PostDto;
import com.example.facebook_clone_demo.models.UsersModel;
import com.example.facebook_clone_demo.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/sendPost")
    public String sendPost(@ModelAttribute PostDto postDto){
        postService.savePost(postDto);

        return "redirect:/index";
        //return  new ResponseEntity<>("Post saved successfully", HttpStatus.CREATED);

    }


}
