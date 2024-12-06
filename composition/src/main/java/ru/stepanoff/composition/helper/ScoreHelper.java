package ru.stepanoff.composition.helper;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import ru.stepanoff.score.ScoreRequest;
import ru.stepanoff.score.ScoreServiceGrpc;

@Component
@RequiredArgsConstructor
public class ScoreHelper {
    @GrpcClient("score")
    private ScoreServiceGrpc.ScoreServiceBlockingStub scoreServiceStub;

    public double getScore() {
        var response = scoreServiceStub.getScore(ScoreRequest.newBuilder().build());
        return response.getScore();
    }
}
