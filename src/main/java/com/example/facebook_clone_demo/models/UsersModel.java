package com.example.facebook_clone_demo.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name= "users_table")
public class UsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String surname;
    String email;
    String password;
    String dob;
    String gender;
    @OneToMany(mappedBy = "usersModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<PostModel> postModels;

//    @OneToMany(mappedBy = "usersModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    List<CommentModel>commentModels;

}
