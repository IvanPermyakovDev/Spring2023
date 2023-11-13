package domain.model;

import java.util.ArrayList;

/**
 * интерфейс сущности проекта
 */
public interface Project {
    /**
     *
     * @return идентификатор проекта
     */
    long getId();

    /**
     *
     * @return имя проекта
     */
    String getName();

    /**
     *
     * @return описание проекта
     */
    String getDescription();

    /**
     *
     * @return тимлид проекта
     */
    User getTeamLead();

    /**
     *
     * @return список участников проекта, включает в себя тимлида
     */
    ArrayList<User> getTeamMembers();

    /**
     *
     * @return список категорий задач проекта
     */
    ArrayList<String> getTaskCategories();

}
