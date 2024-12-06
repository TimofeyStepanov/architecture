package ru.stepanoff.composition.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.stepanoff.composition.dto.AuthDTO;
import ru.stepanoff.composition.helper.AuthHelper;
import ru.stepanoff.composition.helper.ScoreHelper;
import ru.stepanoff.composition.service.CompositionService;
import ru.stepanoff.composition.validation.ScoreValidator;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompositionServiceImpl implements CompositionService {

    private final ScoreHelper scoreHelper;

    private final ScoreValidator scoreValidator;

    private final AuthHelper authHelper;

    @Override
    public boolean checkAuth(AuthDTO authDTO) {
        Optional<Double> scoreOptional = getScore();
        if (scoreOptional.isPresent() && scoreIsNotValidForAuth(scoreOptional.get())) {
            return false;
        }
        return canUserAuth(authDTO);
    }

    protected Optional<Double> getScore() {
        try {
            return Optional.of(scoreHelper.getScore());
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    private boolean scoreIsNotValidForAuth(Double score) {
        return !scoreValidator.isScoreValid(score);
    }

    private boolean canUserAuth(AuthDTO authDTO) {
        try {
            return authHelper.isAuthSuccess(authDTO);
        } catch (Exception e) {
            return false;
        }
    }
}
