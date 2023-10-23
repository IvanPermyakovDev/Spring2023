package infrastructure.specifications;

import application.entities.Comment;

public interface CommentSpecification {
    boolean fits(Comment comment);
}
