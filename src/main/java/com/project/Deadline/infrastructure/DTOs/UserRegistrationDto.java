package com.project.Deadline.infrastructure.DTOs;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserRegistrationDto {
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;

}
