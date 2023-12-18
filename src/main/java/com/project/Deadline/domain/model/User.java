package com.project.Deadline.domain.model;

/**
 * интерфейс сущности пользователя
 */
public interface User {
    /**
     *
     * @return id пользователя
     */
    long getId();

    /**
     *
     * @return никнейм пользователя
     */
    String getNickname();

    /**
     *
     * @return имя пользователя
     */
    String getFirstname();

    /**
     *
     * @return фамилия пользователя
     */
    String getLastname();

    /**
     *
     * @return логин пользователя
     */
    String getLogin();

    /**
     *
     * @return пароль пользователя
     */
    String getPassword();
    /**
     *
     * @return почта пользователя
     */
    String getMail();
}
