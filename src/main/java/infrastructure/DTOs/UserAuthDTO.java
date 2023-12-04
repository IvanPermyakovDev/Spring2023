package infrastructure.DTOs;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserAuthDTO{
    private String login;
    private String password;
}
