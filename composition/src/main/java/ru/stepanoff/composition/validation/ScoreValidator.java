package ru.stepanoff.composition.validation;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ScoreValidator {

    @Value("${composition.minScoreValueForAuth}")
    private final Double minScoreValueForAuth;

    public boolean isScoreValid(double score) {
        return score >= minScoreValueForAuth;
    }

}
