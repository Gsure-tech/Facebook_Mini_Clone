package com.example.facebook_clone_demo.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDto {
    String firstName;
    String surname;
    String email;
    String password;
    String dob;
    String gender;
}
