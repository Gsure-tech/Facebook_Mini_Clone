package com.example.facebook_clone_demo.services.serviceImpl;

import com.example.facebook_clone_demo.dto.PostDto;
import com.example.facebook_clone_demo.models.PostModel;
import com.example.facebook_clone_demo.models.UsersModel;
import com.example.facebook_clone_demo.repositories.PostRepository;
import com.example.facebook_clone_demo.services.PostService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostModel savePost(PostDto postDto) {
       PostModel postModel = new PostModel();
        //UsersModel usersModel = new UsersModel();
        //if(postDto.getPostName()==null)

        UsersModel usersModel= postDto.getUsersModel();

        //usersModel.setId(postDto.getUsersModel().getId());
        postModel.setPostName(postDto.getPostName());
        postModel.setUsersModel(usersModel);

        return postRepository.save(postModel);
    }

    @Override
    public List<PostModel> getAllPost() {
        return postRepository.findAll();
    }
}
