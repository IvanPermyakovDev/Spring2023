package infrastructure.entities;

import domain.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "projects")
public class Project implements domain.model.Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description = "";
    private User teamLead;
    private ArrayList<User> teamMembers;
    private ArrayList<String> taskCategories;

    public void addTeamMember(User member) { teamMembers.add(member); }
    public void deleteTeamMember(long memberId){ teamMembers.remove(teamMembers.indexOf(memberId)); }
    public void addTaskCategory(String category) { taskCategories.add(category); }
    public void deleteTaskCategory(String category) { taskCategories.remove(taskCategories.indexOf(category)); }
}
