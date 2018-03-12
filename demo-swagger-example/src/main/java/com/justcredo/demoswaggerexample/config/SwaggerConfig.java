package com.justcredo.demoswaggerexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.justcredo.demoswaggerexample"))
                .paths(regex("/rest.*"))
                .build()
                .apiInfo(metaInfo());


    }

    private ApiInfo metaInfo() {
    return new ApiInfo(
            "Title API Documentation",
            "API Description",
            "Version 1.0",
            "Terms Of Service",
            new Contact("JustCredo","www.juscredo.com","juscredo@gmail.com"),
            "JustCredo Licence Version 1.0",
            "https://www.justcredo.com/licesen.html"

        );
    }
}
