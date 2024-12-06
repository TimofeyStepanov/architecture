package ru.stepanoff.auth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.stepanoff.auth.dto.AuthDTO;
import ru.stepanoff.auth.service.AuthService;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/check")
    public boolean canUserBeAuth(@RequestBody @Validated AuthDTO authDTO) {
        return authService.canUserBeAuth(authDTO);
    }
}
