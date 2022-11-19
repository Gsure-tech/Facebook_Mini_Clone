package com.example.facebook_clone_demo.services.serviceImpl;

import com.example.facebook_clone_demo.dto.UserDto;
import com.example.facebook_clone_demo.models.UsersModel;
import com.example.facebook_clone_demo.repositories.UserRepository;
import com.example.facebook_clone_demo.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UsersModel signUp(UserDto userDto) {
        UsersModel usersModel = new UsersModel();
        usersModel.setFirstName(userDto.getFirstName());
        usersModel.setSurname(userDto.getSurname());
        usersModel.setEmail(userDto.getEmail());
        usersModel.setDob(userDto.getDob());
        usersModel.setPassword(userDto.getPassword());
        usersModel.setGender(userDto.getGender());

        return userRepository.save(usersModel);
    }

    @Override
    public UsersModel authenticate(String email, String password) {

        return userRepository.findByEmailAndPassword(email,password).orElse(null);
    }
}
