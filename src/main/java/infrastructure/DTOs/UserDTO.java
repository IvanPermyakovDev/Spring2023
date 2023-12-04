package infrastructure.DTOs;

import domain.helpers.UserRole;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@AllArgsConstructor
public class UserDTO {
    private long id;
    private String nickName;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String mail;
    private List<Long> ownProjectImpls;
    private List<Long> projectImpls;
    private UserRole role;
}
