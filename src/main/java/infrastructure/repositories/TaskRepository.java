package infrastructure.repositories;

import application.entities.Task;
import domain.model.User;
import infrastructure.specifications.TaskSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    void add(Task task);
    void update(Task task);
    void delete(Task task);
    Task findById(long id);
    ArrayList<Task> findByCreator(User creator);
    ArrayList<Task> find(TaskSpecification specification);
}
