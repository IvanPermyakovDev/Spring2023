package infrastructure.DTOs;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class CommentDTO {
    private long id;
    private long user;
    private String text;
}
