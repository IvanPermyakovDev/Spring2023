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
public class ProjectImpl implements domain.model.Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description = "";
    private User teamLead;
    private ArrayList<User> teamMembers;
    private ArrayList<String> taskCategories;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public User getTeamLead() {
        return teamLead;
    }

    @Override
    public ArrayList<User> getTeamMembers() { return teamMembers; }

    @Override
    public ArrayList<String> getTaskCategories() { return taskCategories; }

    public void changeName(String newName) { name = newName; }
    public void updateDescription(String newDescription) { description = newDescription; }
    public void addTeamMember(User member) { teamMembers.add(member); }
    public void deleteTeamMember(long memberId){ teamMembers.remove(teamMembers.indexOf(memberId)); }
    public void addTaskCategory(String category) { taskCategories.add(category); }
    public void deleteTaskCategory(String category) { taskCategories.remove(taskCategories.indexOf(category)); }
}
