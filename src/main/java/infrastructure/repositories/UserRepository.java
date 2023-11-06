package infrastructure.repositories;

import application.entities.Task;
import application.entities.User;
import infrastructure.specifications.UserSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void add(User user);
    void update(User user);
    void delete(User user);
    Task findById(long id);
    ArrayList<User> find(UserSpecification specification);
}
