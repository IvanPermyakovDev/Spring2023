package infrastructure.specifications;

import infrastructure.entities.CommentImpl;

public interface CommentSpecification {
    boolean fits(CommentImpl commentImpl);
}
