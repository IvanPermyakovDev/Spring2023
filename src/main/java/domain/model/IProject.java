package domain.model;

import java.util.List;

public interface IProject {
    long getId(); // идентификатор проекта
    String getName(); // имя проекта
    String getDescription(); // описание проекта
    long getTeamLead(); // id тимлида
    List<Long> getTeamMembers(); // id участников
    List<String> getTaskCategories(); // список категорий задач

}
