package com.project.Deadline.infrastructure.repositories;

import com.project.Deadline.domain.model.User;
import com.project.Deadline.infrastructure.entities.Task;
import com.project.Deadline.infrastructure.specifications.TaskSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAll();
    List<Task> findByCreator(User creator);
    List<Task> find(TaskSpecification specification);
}
