package com.example.facebook_clone_demo.services;

import com.example.facebook_clone_demo.dto.UserDto;
import com.example.facebook_clone_demo.models.UsersModel;

public interface UserService {
    public UsersModel signUp(UserDto userDto);
      public UsersModel authenticate(String email, String password);
}
