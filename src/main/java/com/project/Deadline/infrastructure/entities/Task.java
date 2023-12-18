package com.project.Deadline.infrastructure.entities;

import com.project.Deadline.domain.helpers.TaskComplexity;
import com.project.Deadline.domain.helpers.TaskState;
import com.project.Deadline.domain.model.Comment;
import com.project.Deadline.domain.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tasks")
public class Task implements com.project.Deadline.domain.model.Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private long id;

    @Column(name = "description")
    private String description;

    @OneToMany
    @Column(name = "subtasks")
    private List<String> subtasks;

    @OneToMany
    @Column(name = "comments")
    private List<Comment> comments;

    @DateTimeFormat
    @Column(name = "deadline")
    private LocalDateTime deadline;

    private TaskState state = TaskState.NOTSTARTED;

    @Column(name = "creator")
    private User creator;

    @OneToMany
    @Column(name = "performers")
    private List<Long> performers;

    @Column(name = "complexity")
    private TaskComplexity complexity;

    @Column(name = "category")
    private String category;

    public void changeState(TaskState state){
        if(this.state != TaskState.COMPLETED)
            this.state = state;
    }

    @Override
    public boolean isOverdue() {
        return LocalDateTime.now().isAfter(deadline);
    }
}
