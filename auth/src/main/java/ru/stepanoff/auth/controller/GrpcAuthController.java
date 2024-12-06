package ru.stepanoff.auth.controller;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.stepanoff.auth.AuthRequest;
import ru.stepanoff.auth.AuthResponse;
import ru.stepanoff.auth.AuthServiceGrpc;
import ru.stepanoff.auth.dto.AuthDTO;
import ru.stepanoff.auth.service.AuthService;

@GrpcService
@RequiredArgsConstructor
public class GrpcAuthController extends AuthServiceGrpc.AuthServiceImplBase  {

    private final AuthService authService;

    @Override
    public void canUserBeAuth(AuthRequest request, StreamObserver<AuthResponse> responseObserver) {
        AuthDTO authDTO = AuthDTO.builder()
                .login(request.getLogin())
                .password(request.getPassword())
                .build();

        var scoreResponseBuilder = AuthResponse.newBuilder()
                .setCanBeAuth(authService.canUserBeAuth(authDTO));
        responseObserver.onNext(scoreResponseBuilder.build());
        responseObserver.onCompleted();
    }
}
