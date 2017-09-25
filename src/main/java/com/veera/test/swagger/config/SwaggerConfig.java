package com.veera.test.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Veeramani Bagavathi
 * on 9/11/2017.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createHelloDocket() {
        return new Docket(DocumentationType.SPRING_WEB).select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Veera", "veera.com", "mail@mail.com");

        ApiInfo apiInfo = new ApiInfo("Service API", "Simple REST Service", "0.0.1",
            "mail@mail.com", contact, " ", " ");
        return apiInfo;
    }
}
