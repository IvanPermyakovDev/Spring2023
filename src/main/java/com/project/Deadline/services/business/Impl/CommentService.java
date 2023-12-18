package com.project.Deadline.services.business.Impl;

import com.project.Deadline.infrastructure.DTOs.CommentDTO;
import com.project.Deadline.infrastructure.entities.Comment;
import com.project.Deadline.infrastructure.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService implements com.project.Deadline.services.business.CommentService {
    @Autowired
    private CommentRepository repo;

    public void create(CommentDTO dto){
        repo.save(new Comment(dto.getId(), dto.getUser(), dto.getText()));
    }

    public List<CommentDTO> findByUser(long user){
        List<Comment> comments = repo.findByUser(user);
        List<CommentDTO> res = new ArrayList<CommentDTO>();
        for(Comment c : comments){ res.add(new CommentDTO(c.getId(), c.getUser(), c.getText()));}
        return res;
    }

    public void change(long id, String newText){
        Comment comment = repo.findById(id).get();
        comment.setText(newText);
        repo.save(comment);
    }

    public void delete(long id){
        repo.deleteById(id);
    }
}
