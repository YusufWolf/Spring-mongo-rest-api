package com.example.springmongorestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringMongoRestApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringMongoRestApiApplication.class, args);
    }

}
