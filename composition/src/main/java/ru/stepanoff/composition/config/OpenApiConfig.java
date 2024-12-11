package ru.stepanoff.composition.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI getOpenApi() {
        return new OpenAPI()
               .info(new Info().title("Лабораторная по архитектуре")
                        .description("Композиция")
                        .version("1.0"));
    }
}
