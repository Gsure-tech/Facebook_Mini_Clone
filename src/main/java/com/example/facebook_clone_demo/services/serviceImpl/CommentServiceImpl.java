package com.example.facebook_clone_demo.services.serviceImpl;

import com.example.facebook_clone_demo.dto.CommentDto;
import com.example.facebook_clone_demo.models.CommentModel;
import com.example.facebook_clone_demo.models.UsersModel;
import com.example.facebook_clone_demo.repositories.CommentRepository;
import com.example.facebook_clone_demo.services.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentModel saveComment(CommentDto commentDto) {
        CommentModel commentModel = new CommentModel();
        UsersModel usersModel = commentDto.getUsersModel();

        commentModel.setComment(commentDto.getComment());
        commentModel.setUsersModel(usersModel);

        return commentRepository.save(commentModel);
    }

    @Override
    public List<CommentModel> getAllComment() {
        return commentRepository.findAll();
    }
}
