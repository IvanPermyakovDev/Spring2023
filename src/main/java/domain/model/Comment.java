package domain.model;

public interface Comment {
    long getUser(); // пользователь, оставивший комментарий
    String getText(); // текст комментария
}
