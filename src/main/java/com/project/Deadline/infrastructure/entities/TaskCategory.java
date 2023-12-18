package com.project.Deadline.infrastructure.entities;

import com.project.Deadline.domain.model.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "task_categories")
public class TaskCategory implements com.project.Deadline.domain.model.TaskCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private long projectId;

    @Column(name = "name")
    private String name;

    @OneToMany
    @Column(name = "tasks")
    private List<Task> tasks;


}
