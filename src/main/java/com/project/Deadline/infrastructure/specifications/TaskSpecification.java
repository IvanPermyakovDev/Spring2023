package com.project.Deadline.infrastructure.specifications;

import com.project.Deadline.infrastructure.entities.Task;

public interface TaskSpecification {
    boolean fits(Task taskImpl);
}