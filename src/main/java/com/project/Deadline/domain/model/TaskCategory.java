package com.project.Deadline.domain.model;

import java.util.List;

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
    List<Task> getTasks();


}
