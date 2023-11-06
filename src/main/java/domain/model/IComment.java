package domain.model;

public interface IComment {
    long getUser(); // пользователь, оставивший комментарий
    String getText(); // текст комментария
}
