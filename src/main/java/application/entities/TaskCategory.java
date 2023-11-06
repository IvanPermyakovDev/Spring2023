package application.entities;

import domain.model.Task;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

public class TaskCategory implements domain.model.TaskCategory {
    public TaskCategory(long projectId, String name){
        this.projectId = projectId;
        this.name = name;
    }
    public TaskCategory(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long projectId;
    private String name;
    private ArrayList<Task> tasks;

    @Override
    public long getProjectId(){
        return projectId;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public ArrayList<Task> getTasks(){
        return tasks;
    }
    @Override
    public void addTask(Task task){ tasks.add(task); }
    @Override
    public void deleteTask(long id){tasks.remove(tasks.indexOf(id));}
}
