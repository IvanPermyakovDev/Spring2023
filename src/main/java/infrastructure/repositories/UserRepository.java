package infrastructure.repositories;

import infrastructure.entities.TaskImpl;
import infrastructure.entities.UserImpl;
import infrastructure.specifications.UserSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends JpaRepository<UserImpl, Long> {
    void add(UserImpl userImpl);
    void update(UserImpl userImpl);
    void delete(UserImpl userImpl);
    TaskImpl findById(long id);
    ArrayList<UserImpl> findAll();
    ArrayList<UserImpl> find(UserSpecification specification);
}
