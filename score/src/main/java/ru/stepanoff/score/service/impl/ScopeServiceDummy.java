package ru.stepanoff.score.service.impl;

import org.springframework.stereotype.Service;
import ru.stepanoff.score.service.ScopeService;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class ScopeServiceDummy implements ScopeService {

    @Override
    public double findScope(String login) {
        return ThreadLocalRandom.current().nextDouble();
    }
}
