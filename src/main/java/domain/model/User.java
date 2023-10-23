package domain.model;

public interface User {
    long getId(); // идентификатор пользователя
    String getNickname(); // никнейм пользователя
    String getFirstName(); // имя пользователя
    String getLastname(); //фамилия пользователя
    String getLogin(); // логин пользователя
    String getPassword(); //пароль пользователя
    String getMail(); // почта пользователя

}
