package application.entities;

import domain.helpers.TaskComplexity;
import domain.helpers.TaskState;
import domain.model.Comment;
import domain.model.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task implements domain.model.Task {
    public Task(String description,
                ArrayList<String> subtasks,
                LocalDateTime deadline,
                User creator,
                ArrayList<Long> performers,
                TaskComplexity complexity,
                String category,
                long id){
        this.description = description;
        this.subtasks = subtasks;
        this.deadline = deadline;
        this.performers = performers;
        this.complexity = complexity;
        this.category = category;
        this.id = id;
    }

    public Task(){}

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
    public long getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public ArrayList<String> getSubtasks() {
        return subtasks;
    }

    @Override
    public ArrayList<Comment> getComments() {
        return comments;
    }

    @Override
    @DateTimeFormat
    public LocalDateTime getDeadline() {
        return deadline;
    }

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
    public User getCreator() {
        return creator;
    }

    @Override
    public ArrayList<Long> getPerformers() {
        return performers;
    }

    @Override
    public TaskComplexity getComplexity() {
        return complexity;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public boolean isOverdue() {
        return LocalDateTime.now().isAfter(deadline);
    }
}
