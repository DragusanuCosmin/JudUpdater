package com.example.judupdater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class JudUpdaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(JudUpdaterApplication.class, args);
    }

}
