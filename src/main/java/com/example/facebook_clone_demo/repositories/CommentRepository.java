package com.example.facebook_clone_demo.repositories;

import com.example.facebook_clone_demo.models.CommentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository <CommentModel,Long> {
}
