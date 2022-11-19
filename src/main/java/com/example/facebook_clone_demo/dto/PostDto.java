package com.example.facebook_clone_demo.dto;

import com.example.facebook_clone_demo.models.UsersModel;
import lombok.Data;

@Data
public class PostDto {
    private String postName;
    private UsersModel usersModel;
}
