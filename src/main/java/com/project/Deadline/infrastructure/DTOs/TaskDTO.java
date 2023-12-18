package com.project.Deadline.infrastructure.DTOs;

import com.project.Deadline.domain.helpers.TaskComplexity;
import com.project.Deadline.domain.helpers.TaskState;
import com.project.Deadline.domain.model.User;
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
