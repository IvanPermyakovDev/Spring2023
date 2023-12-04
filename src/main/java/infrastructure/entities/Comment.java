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

}
