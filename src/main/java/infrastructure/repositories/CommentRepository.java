package infrastructure.repositories;

import infrastructure.entities.CommentImpl;
import domain.model.User;
import infrastructure.specifications.CommentSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentRepository extends JpaRepository<CommentImpl, Long> {
    void add(CommentImpl commentImpl);
    void update(CommentImpl commentImpl);
    void delete(CommentImpl commentImpl);
    CommentImpl findById(long id);
    ArrayList<CommentImpl> findAll();
    ArrayList<CommentImpl> findByUser(User user);
    ArrayList<CommentImpl> find(CommentSpecification specification);
}