package com.example.facebook_clone_demo.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class PostModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String postName;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UsersModel usersModel;
}
