package org.testspring.examenrev.confuguration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }
    public Info infoAPI() {
        return new Info().title("SpringDoc")
                .description("Donation")
                .contact(contactAPI());
    }


    public Contact contactAPI() {
        return new Contact().name("Equipe ASI II")
                .url("https://www.linkedin.com/in/**********/");
    }


}

