package application.entities;

import domain.model.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Comment implements domain.model.Comment {
    public Comment(User user, String text)
    {
        this.user = user.getId();
        this.text = text;
    }
    public Comment(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    private long user;
    private String text;

    @Override
    public long getUser() {
        return user;
    }
    @Override
    public String getText(){ return text; }

    public void changeText(String text){this.text = text;}
}
