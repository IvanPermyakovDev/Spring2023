package com.project.Deadline.infrastructure.repositories;

import com.project.Deadline.infrastructure.entities.User;
import com.project.Deadline.infrastructure.specifications.UserSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void add(User userImpl);
    void update(User userImpl);
    void delete(User userImpl);
    List<User> findAll();
    List<User> find(UserSpecification specification);
}
