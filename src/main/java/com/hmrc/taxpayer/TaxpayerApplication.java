package com.hmrc.taxpayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.hmrc.taxpayer.repository")
@SpringBootApplication
public class TaxpayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxpayerApplication.class, args);
    }

}
