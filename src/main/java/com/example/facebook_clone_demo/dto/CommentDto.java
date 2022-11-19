package com.example.facebook_clone_demo.dto;

import com.example.facebook_clone_demo.models.UsersModel;
import lombok.Data;

@Data
public class CommentDto {
    private String comment;
    private UsersModel usersModel;
}
