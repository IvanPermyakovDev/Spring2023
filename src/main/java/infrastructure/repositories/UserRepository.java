package infrastructure.repositories;

import infrastructure.entities.Task;
import infrastructure.entities.User;
import infrastructure.specifications.UserSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void add(User userImpl);
    void update(User userImpl);
    void delete(User userImpl);
    Task findById(long id);
    List<User> findAll();
    List<User> find(UserSpecification specification);
}
