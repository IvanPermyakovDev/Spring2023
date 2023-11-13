package infrastructure.specifications;

import infrastructure.entities.Comment;

public interface CommentSpecification {
    boolean fits(Comment commentImpl);
}
