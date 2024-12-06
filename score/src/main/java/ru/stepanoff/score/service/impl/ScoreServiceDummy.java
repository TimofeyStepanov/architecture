package ru.stepanoff.score.service.impl;

import org.springframework.stereotype.Service;
import ru.stepanoff.score.service.ScoreService;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class ScoreServiceDummy implements ScoreService {

    @Override
    public double findScope() {
        return ThreadLocalRandom.current().nextDouble();
    }
}
