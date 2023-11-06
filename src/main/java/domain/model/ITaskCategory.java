package domain.model;

import java.util.List;

public interface ITaskCategory {
    long getProjectId();
    String getName();
    List<ITask> getTasks();
    void addTask(ITask task);
    void deleteTask(long id);
}
