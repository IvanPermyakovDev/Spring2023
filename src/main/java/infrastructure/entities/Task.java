package infrastructure.entities;

import domain.helpers.TaskComplexity;
import domain.helpers.TaskState;
import domain.model.Comment;
import domain.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@Table(name = "tasks")
public class Task implements domain.model.Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private ArrayList<String> subtasks;
    private ArrayList<Comment> comments;
    @DateTimeFormat
    private LocalDateTime deadline;
    private TaskState state = TaskState.NOTSTARTED;
    private User creator;
    private ArrayList<Long> performers;
    private TaskComplexity complexity;
    private String category;
    @Override
    public TaskState getCurrentState() {
        return state;
    }

    @Override
    public void changeState(TaskState state){
        if(this.state != TaskState.COMPLETED)
            this.state = state;
    }

    @Override
    public boolean isOverdue() {
        return LocalDateTime.now().isAfter(deadline);
    }
}
