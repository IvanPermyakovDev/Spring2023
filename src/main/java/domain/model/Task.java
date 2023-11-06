package domain.model;

import domain.helpers.TaskComplexity;
import domain.helpers.TaskState;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface Task {
    long getId(); // идентификатор задачи
    String getDescription(); // описание задачи
    ArrayList<String> getSubtasks(); // детали задачи
    ArrayList<Comment> getComments(); // комментарии задачи
    @DateTimeFormat
    LocalDateTime getDeadline(); // дедлайн задачи
    TaskState getCurrentState(); // текущая степень выполнения задачи
    void changeState(TaskState state);
    User getCreator(); // id автор задачи(тимлид или предложивший участник)
    List<Long> getPerformers(); // выполняющие задачу участники проекта
    TaskComplexity getComplexity(); // уровень сложности задачи
    String getCategory(); // категория задачи
    boolean isOverdue(); // флаг просрочки задачи (false - не просрочено, true - просрочено)
}
