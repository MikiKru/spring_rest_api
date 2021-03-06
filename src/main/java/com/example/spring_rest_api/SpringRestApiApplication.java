package com.example.spring_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2     // annotation for running swagger ui enviroment localhost:8080/swagger-ui.html
@SpringBootApplication
public class SpringRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApiApplication.class, args);
    }

}
