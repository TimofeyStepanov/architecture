package ru.stepanoff.composition.helper;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import ru.stepanoff.auth.AuthRequest;
import ru.stepanoff.auth.AuthServiceGrpc;
import ru.stepanoff.composition.dto.AuthDTO;
import ru.stepanoff.score.ScoreRequest;
import ru.stepanoff.score.ScoreServiceGrpc;

@Component
@RequiredArgsConstructor
public class AuthHelper {
    @GrpcClient("auth")
    private AuthServiceGrpc.AuthServiceBlockingStub authStub;

    public boolean isAuthSuccess(AuthDTO authDTO) {
        var authRequest = AuthRequest.newBuilder()
                .setLogin(authDTO.getLogin())
                .setPassword(authDTO.getPassword())
                .build();
        var response = authStub.canUserBeAuth(authRequest);
        return response.getCanBeAuth();
    }
}
