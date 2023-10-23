package infrastructure.repositories;

import application.entities.Comment;
import domain.model.User;
import infrastructure.specifications.CommentSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    void add(Comment comment);
    void update(Comment comment);
    void delete(Comment comment);
    Comment findById(long id);
    ArrayList<Comment> findByUser(User user);
    ArrayList<Comment> find(CommentSpecification specification);
}
