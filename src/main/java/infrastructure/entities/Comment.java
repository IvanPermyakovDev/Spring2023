package infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comments")
public class Comment implements domain.model.Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @JoinColumn(name = "user")
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
