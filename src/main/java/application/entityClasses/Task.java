package application.entityClasses;

import domain.model.IComment;
import domain.model.ITask;
import domain.helpers.TaskComplexity;
import domain.helpers.TaskState;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;


public class Task implements ITask {
    public Task(String description,
                List<String> subtasks,
                LocalDateTime deadline,
                long creatorId,
                List<Long> performers,
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
    private final long id;
    private String description;
    private List<String> subtasks;
    private List<IComment> comments;
    @DateTimeFormat
    private LocalDateTime deadline;
    private TaskState state = TaskState.NOTSTARTED;
    private long creatorId;
    private List<Long> performers;
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
    public List<String> getSubtasks() {
        return subtasks;
    }

    @Override
    public List<IComment> getComments() {
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
    public long getCreatorId() {
        return creatorId;
    }

    @Override
    public List<Long> getPerformers() {
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
