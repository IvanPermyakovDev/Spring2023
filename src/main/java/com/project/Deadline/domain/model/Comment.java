package com.project.Deadline.domain.model;

/**
 * интерфейс сущности комментария
 */
public interface Comment {
    /**
     *
     * @return пользователь, оставивший комментарий
     */
    long getUser();

    /**
     *
     * @return текст комментария
     */
    String getText();
}
