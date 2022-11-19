package com.example.facebook_clone_demo.services;

import com.example.facebook_clone_demo.dto.PostDto;
import com.example.facebook_clone_demo.models.PostModel;

import java.util.List;

public interface PostService {
    PostModel savePost(PostDto postDto) ;
    List <PostModel> getAllPost();
}
