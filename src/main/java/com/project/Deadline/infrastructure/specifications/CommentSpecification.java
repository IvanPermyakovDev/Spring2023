package com.project.Deadline.infrastructure.specifications;

import com.project.Deadline.infrastructure.entities.Comment;

public interface CommentSpecification {
    boolean fits(Comment commentImpl);
}
