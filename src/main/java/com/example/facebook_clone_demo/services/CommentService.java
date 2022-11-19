package com.example.facebook_clone_demo.services;

import com.example.facebook_clone_demo.dto.CommentDto;
import com.example.facebook_clone_demo.dto.PostDto;
import com.example.facebook_clone_demo.models.CommentModel;
import com.example.facebook_clone_demo.models.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentService{
    CommentModel saveComment(CommentDto commentDto) ;
    List<CommentModel> getAllComment();
}
