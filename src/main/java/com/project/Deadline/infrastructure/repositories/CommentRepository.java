package com.project.Deadline.infrastructure.repositories;

import com.project.Deadline.infrastructure.entities.Comment;
import com.project.Deadline.infrastructure.specifications.CommentSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAll();
    List<Comment> findByUser(long user);
    List<Comment> find(CommentSpecification specification);
}