package application.entityClasses;

import domain.model.ITask;
import domain.model.ITaskCategory;

import java.util.List;

public class TaskCategory implements ITaskCategory {
    public TaskCategory(long projectId, String name){
        this.projectId = projectId;
        this.name = name;
    }
    private final long projectId;
    private String name;
    private List<ITask> tasks;

    @Override
    public long getProjectId(){
        return projectId;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public List<ITask> getTasks(){
        return tasks;
    }
    @Override
    public void addTask(ITask task){ tasks.add(task); }
    @Override
    public void deleteTask(long id){tasks.remove(tasks.indexOf(id));}
}
