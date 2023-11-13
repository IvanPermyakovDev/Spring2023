package infrastructure.repositories;

import domain.model.User;
import infrastructure.entities.Comment;
import infrastructure.specifications.CommentSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    void add(Comment commentImpl);
    void update(Comment commentImpl);
    void delete(Comment commentImpl);
    Comment findById(long id);
    List<Comment> findAll();
    List<Comment> findByUser(User user);
    List<Comment> find(CommentSpecification specification);
}