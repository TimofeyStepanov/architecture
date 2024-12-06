package ru.stepanoff.composition.service;

import ru.stepanoff.composition.dto.AuthDTO;

public interface CompositionService {
    boolean checkAuth(AuthDTO authDTO);
}
