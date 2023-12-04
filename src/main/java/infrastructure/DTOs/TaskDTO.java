package infrastructure.DTOs;

import domain.helpers.TaskComplexity;
import domain.helpers.TaskState;
import domain.model.User;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@AllArgsConstructor
public class TaskDTO {
    private long id;
    private String description;
    private List<String> subtasks;
    private List<Long> comments;
    private String deadline;
    private TaskState state = TaskState.NOTSTARTED;
    private User creator;
    private List<Long> performers;
    private TaskComplexity complexity;
    private String category;
}
