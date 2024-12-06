package ru.stepanoff.composition.helper;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class ScoreHelper {

    @Value("${composition.scoreUrl}")
    private final String scoreUrl;

    private RestClient restScoreClient;

    @PostConstruct
    private void initRestClient() {
        restScoreClient = RestClient.builder()
                .requestFactory(new HttpComponentsClientHttpRequestFactory())
                .baseUrl(scoreUrl + "/0")
                .build();
    }

    public double getScore() {
         return restScoreClient.get()
                .retrieve()
                .body(Double.class);
    }
}
