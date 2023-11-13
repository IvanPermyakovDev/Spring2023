package infrastructure.entities;

import domain.model.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "task_categories")
public class TaskCategory implements domain.model.TaskCategory {
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
