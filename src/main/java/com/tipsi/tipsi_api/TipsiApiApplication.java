package com.tipsi.tipsi_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.tipsi.tipsi_api.repository")
@ComponentScan(basePackages = "com.tipsi.tipsi_api")
public class TipsiApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TipsiApiApplication.class, args);
    }

}