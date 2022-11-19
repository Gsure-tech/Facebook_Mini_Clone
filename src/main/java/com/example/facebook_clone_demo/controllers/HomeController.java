package com.example.facebook_clone_demo.controllers;

import com.example.facebook_clone_demo.models.CommentModel;
import com.example.facebook_clone_demo.models.PostModel;
import com.example.facebook_clone_demo.services.CommentService;
import com.example.facebook_clone_demo.services.PostService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Data
@Controller
public class HomeController {
    private final PostService postService;
    private final CommentService commentService;


    @GetMapping("/index")
    public String homePage(HttpSession session, Model model){
        if(session.getAttribute("user")==null){
            return  "redirect:/login";
        }

        List<PostModel> postModelLists=postService.getAllPost();
        model.addAttribute("postModelLists",postModelLists);

        List<CommentModel>commentModelList = commentService.getAllComment();
        model.addAttribute("commentModeList",commentModelList);

        return "index";
    }


}
