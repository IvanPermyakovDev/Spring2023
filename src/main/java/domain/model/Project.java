package domain.model;

import java.util.ArrayList;

public interface Project {
    long getId(); // идентификатор проекта
    String getName(); // имя проекта
    String getDescription(); // описание проекта
    User getTeamLead(); // id тимлида
    ArrayList<User> getTeamMembers(); // id участников
    ArrayList<String> getTaskCategories(); // список категорий задач

}
