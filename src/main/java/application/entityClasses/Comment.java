package application.entityClasses;

import domain.model.IComment;

public class Comment implements IComment {
    public Comment(long user, String text)
    {
        this.user = user;
        this.text = text;
    }
    private final long user;
    private String text;

    @Override
    public long getUser() {
        return user;
    }
    @Override
    public String getText(){ return text; }

}
