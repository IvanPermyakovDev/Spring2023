package application.entityClasses;

import domain.model.IProject;

import java.util.List;

public class Project implements IProject {

    public Project(String name,
                   long teamLead,
                   List<Long>  teamMembers,
                   long id){
        this.name = name;
        this.teamLead = teamLead;
        this.teamMembers = teamMembers;
        teamMembers.add(teamLead);
        this.id = id;
    }

    private final long id;
    private String name;
    private String description = "";
    private long teamLead;
    private List<Long> teamMembers;
    private List<String> taskCategories;

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
    public long getTeamLead() {
        return teamLead;
    }

    @Override
    public List<Long> getTeamMembers() { return teamMembers; }

    @Override
    public List<String> getTaskCategories() { return taskCategories; }

    public void changeName(String newName) { name = newName; }
    public void updateDescription(String newDescription) { description = newDescription; }
    public void addTeamMember(long memberId) { teamMembers.add(memberId); }
    public void deleteTeamMember(long memberId){ teamMembers.remove(teamMembers.indexOf(memberId)); }
    public void addTaskCategory(String category) { taskCategories.add(category); }
    public void deleteTaskCategory(String category) { taskCategories.remove(taskCategories.indexOf(category)); }
}
