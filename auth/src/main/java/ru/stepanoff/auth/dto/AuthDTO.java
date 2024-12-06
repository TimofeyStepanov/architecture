package ru.stepanoff.auth.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthDTO {

    @NotEmpty(message = "Login can't be null")
    private String login;

    @NotEmpty(message = "Password can't be null")
    private String password;
}
