package com.project.Deadline.infrastructure.entities;

import com.project.Deadline.domain.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "projects")
public class Project implements com.project.Deadline.domain.model.Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proj_id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "teamlead")
    private User teamlead;

    @Column(name = "team_members")
    private List<User> teamMembers;

    @Column(name = "task_categories")
    private List<String> taskCategories;

    public void addTeamMember(User member) { teamMembers.add(member); }
    public void deleteTeamMember(long memberId){ teamMembers.remove(teamMembers.indexOf(memberId)); }
    public void addTaskCategory(String category) { taskCategories.add(category); }
    public void deleteTaskCategory(String category) { taskCategories.remove(taskCategories.indexOf(category)); }
}
