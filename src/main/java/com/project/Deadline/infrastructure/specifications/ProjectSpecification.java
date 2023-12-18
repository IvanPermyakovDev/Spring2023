package com.project.Deadline.infrastructure.specifications;

import com.project.Deadline.infrastructure.entities.Project;

public interface ProjectSpecification {
    boolean fits(Project projectImpl);
}
