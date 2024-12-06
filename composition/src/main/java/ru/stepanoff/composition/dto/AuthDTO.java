package ru.stepanoff.composition.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AuthDTO {

    @NotEmpty(message = "Login can't be null")
    private String login;

    @NotEmpty(message = "Password can't be null")
    private String password;
}
