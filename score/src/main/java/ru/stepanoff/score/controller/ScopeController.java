package ru.stepanoff.score.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.stepanoff.score.service.ScopeService;

@RestController
@RequestMapping("/scope")
@AllArgsConstructor
public class ScopeController {

    private final ScopeService scopeService;

    @GetMapping("/{login}")
    public double getScope(@PathVariable("login") String login) {
        return scopeService.findScope(login);
    }
}
