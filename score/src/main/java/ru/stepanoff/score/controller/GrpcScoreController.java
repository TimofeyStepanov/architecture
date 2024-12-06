package ru.stepanoff.score.controller;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.stepanoff.score.ScoreRequest;
import ru.stepanoff.score.ScoreResponse;
import ru.stepanoff.score.ScoreServiceGrpc;
import ru.stepanoff.score.service.ScoreService;


@GrpcService
@RequiredArgsConstructor
public class GrpcScoreController extends ScoreServiceGrpc.ScoreServiceImplBase {

    private final ScoreService scoreService;

    @Override
    public void getScore(ScoreRequest request, StreamObserver<ScoreResponse> responseObserver) {
        var scoreResponseBuilder = ScoreResponse.newBuilder()
                        .setScore(scoreService.findScope());
        responseObserver.onNext(scoreResponseBuilder.build());
        responseObserver.onCompleted();
    }
}
