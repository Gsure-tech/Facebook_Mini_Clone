package com.example.facebook_clone_demo.repositories;

import com.example.facebook_clone_demo.models.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UsersModel, Long> {
    Optional<UsersModel> findByEmailAndPassword(String email, String password);
    Optional<UsersModel> findFirstByEmail(String email);
}
