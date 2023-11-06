package application.entities;

import domain.model.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
public class Project implements domain.model.Project {

    public Project(String name,
                   User teamLead,
                   ArrayList<User>  teamMembers,
                   long id) {
        this.name = name;
        this.teamLead = teamLead;
        this.teamMembers = teamMembers;
        teamMembers.add(teamLead);
        this.id = id;
    }

    public Project(){}

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
