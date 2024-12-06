package ru.stepanoff.auth.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.stepanoff.auth.dto.AuthDTO;
import ru.stepanoff.auth.model.User;
import ru.stepanoff.auth.repository.UserRepository;
import ru.stepanoff.auth.service.AuthService;

import java.util.Optional;

import static ru.stepanoff.auth.utils.PasswordUtils.matches;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    @Override
    public boolean canUserBeAuth(AuthDTO authDTO) {
        Optional<User> userOptional = userRepository.findUserByLogin(authDTO.getLogin());
        if (userOptional.isEmpty()) {
            return false;
        }

        User user = userOptional.get();
        return matches(authDTO.getPassword(), user.getPassword());
    }
}
