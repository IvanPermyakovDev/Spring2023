package com.project.Deadline.domain.model;

import com.project.Deadline.domain.helpers.TaskComplexity;
import com.project.Deadline.domain.helpers.TaskState;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

/**
 * интерфейс сущности проекта
 */
public interface Task {
    /**
     *
     * @return id задачи
     */
    long getId();

    /**
     *
     * @return описание задачи
     */
    String getDescription();

    /**
     *
     * @return список деталей задачи
     */
    List<String> getSubtasks();

    /**
     *
     * @return список комментариев задачи
     */
    List<Comment> getComments();

    /**
     *
     * @return дедлайн задачи
     */
    @DateTimeFormat
    LocalDateTime getDeadline();

    /**
     *
     * @return текущая степень выполнения задачи
     */
    TaskState getState();

    User getCreator();

    /**
     *
     * @return список выполняющих задачу участников проекта
     */
    List<Long> getPerformers();

    /**
     *
     * @return уровень сложности задачи
     */
    TaskComplexity getComplexity();

    /**
     *
     * @return категория задачи
     */
    String getCategory();

    /**
     *
     * @return флаг просрочки задачи (false - не просрочено, true - просрочено)
     */
    boolean isOverdue();
}
