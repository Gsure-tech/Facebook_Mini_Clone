package com.example.facebook_clone_demo.models;

import lombok.*;

import javax.persistence.*;
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class CommentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UsersModel usersModel;
}
