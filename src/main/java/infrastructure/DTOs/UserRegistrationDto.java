package infrastructure.DTOs;

import lombok.Data;

@Data
public class UserRegistrationDto {
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

}
