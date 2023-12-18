package com.project.Deadline.infrastructure.DTOs;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@AllArgsConstructor
public class TaskCategoryDTO {
    private long projectId;
    private String name;
    private List<Long> tasks;
}
