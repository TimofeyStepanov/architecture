package ru.stepanoff.score.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.stepanoff.score.service.ScoreService;

@RestController
@RequestMapping("/score")
@AllArgsConstructor
public class ScoreController {

    private final ScoreService scoreService;

    @GetMapping("")
    public double getScope() {
        return scoreService.findScope();
    }
}
