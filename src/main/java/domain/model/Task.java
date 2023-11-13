package domain.model;

import domain.helpers.TaskComplexity;
import domain.helpers.TaskState;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
    ArrayList<String> getSubtasks();

    /**
     *
     * @return список комментариев задачи
     */
    ArrayList<Comment> getComments();

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
    TaskState getCurrentState();

    /**
     *  меняет текущее состояние задачи
     * @param state
     */
    void changeState(TaskState state);

    /**
     *
     * @return id автора задачи(тимлид или предложивший участник)
     */
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
