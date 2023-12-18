package com.project.Deadline.services.business;

import com.project.Deadline.infrastructure.DTOs.CommentDTO;

import java.util.List;

public interface CommentService {
    void create(CommentDTO dto);
    List<CommentDTO> findByUser(long user);
    void change(long id, String newText);
    void delete(long id);
}
