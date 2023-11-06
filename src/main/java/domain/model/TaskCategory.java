package domain.model;

import java.util.ArrayList;

public interface TaskCategory {
    long getProjectId();
    String getName();
    ArrayList<Task> getTasks();
    void addTask(Task task);
    void deleteTask(long id);
}
