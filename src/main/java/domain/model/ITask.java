package domain.model;

import domain.helpers.TaskComplexity;
import domain.helpers.TaskState;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

public interface ITask{
    long getId(); // идентификатор задачи
    String getDescription(); // описание задачи
    List<String> getSubtasks(); // детали задачи
    List<IComment> getComments(); // комментарии задачи
    @DateTimeFormat
    LocalDateTime getDeadline(); // дедлайн задачи
    TaskState getCurrentState(); // текущая степень выполнения задачи
    void changeState(TaskState state);
    long getCreatorId(); // id автор задачи(тимлид или предложивший участник)
    List<Long> getPerformers(); // выполняющие задачу участники проекта
    TaskComplexity getComplexity(); // уровень сложности задачи
    String getCategory(); // категория задачи
    boolean isOverdue(); // флаг просрочки задачи (false - не просрочено, true - просрочено)
}
