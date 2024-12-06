package ru.stepanoff.auth.service;

import ru.stepanoff.auth.dto.AuthDTO;

public interface AuthService {
    boolean canUserBeAuth(AuthDTO authDTO);
}
