package infrastructure.repositories;

import infrastructure.entities.TaskImpl;
import domain.model.User;
import infrastructure.specifications.TaskSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TaskRepository extends JpaRepository<TaskImpl, Long> {
    void add(TaskImpl taskImpl);
    void update(TaskImpl taskImpl);
    void delete(TaskImpl taskImpl);
    TaskImpl findById(long id);
    ArrayList<TaskImpl> findAll();
    ArrayList<TaskImpl> findByCreator(User creator);
    ArrayList<TaskImpl> find(TaskSpecification specification);
}
