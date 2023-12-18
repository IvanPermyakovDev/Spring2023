package com.project.Deadline.infrastructure.specifications;

import com.project.Deadline.infrastructure.entities.User;

public interface UserSpecification {
    boolean fits(User userImpl);
}
