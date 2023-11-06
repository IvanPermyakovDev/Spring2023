package domain.model;

import java.util.ArrayList;

/**
 * интерфейс сущности категории задач
 */
public interface TaskCategory {
    /**
     *
     * @return id родительского проекта
     */
    long getProjectId();

    /**
     *
     * @return имя категории задач
     */
    String getName();

    /**
     *
     * @return список задач
     */
    ArrayList<Task> getTasks();

    /**
     * добавляет задачу в категорию
     * @param task
     */
    void addTask(Task task);

    /**
     * удаление задачи из списка
     * @param id
     */
    void deleteTask(long id);
}
