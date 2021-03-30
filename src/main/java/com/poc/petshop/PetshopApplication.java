package com.poc.petshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.poc.petshop.repository")
@SpringBootApplication
public class PetshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetshopApplication.class, args);
    }

}
