package com.example.facebook_clone_demo.repositories;

import com.example.facebook_clone_demo.models.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostModel, Long> {
}
