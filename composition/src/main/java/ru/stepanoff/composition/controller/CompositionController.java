package ru.stepanoff.composition.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.stepanoff.composition.dto.AuthDTO;
import ru.stepanoff.composition.service.CompositionService;

@RestController
@RequestMapping("/composition")
@RequiredArgsConstructor
public class CompositionController {

    private final CompositionService compositionService;
    @PostMapping("/auth")
    @Operation(summary = "Вход в систему")
    public boolean checkAuth(@RequestBody @Validated AuthDTO authDTO) {

        return compositionService.checkAuth(authDTO);
    }
}
