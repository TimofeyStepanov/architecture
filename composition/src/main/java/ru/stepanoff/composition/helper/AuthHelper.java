package ru.stepanoff.composition.helper;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import ru.stepanoff.composition.dto.AuthDTO;

@Component
@RequiredArgsConstructor
public class AuthHelper {

    @Value("${composition.authUrl}")
    private final String authUrl;

    private RestClient restScoreClient;

    @PostConstruct
    private void initRestClient() {
        restScoreClient = org.springframework.web.client.RestClient.builder()
                .requestFactory(new HttpComponentsClientHttpRequestFactory())
                .baseUrl(authUrl)
                .build();
    }

    public boolean isAuthSuccess(AuthDTO authDTO) {
        return restScoreClient.post()
                .body(authDTO)
                .retrieve()
                .body(Boolean.class);
    }
}
