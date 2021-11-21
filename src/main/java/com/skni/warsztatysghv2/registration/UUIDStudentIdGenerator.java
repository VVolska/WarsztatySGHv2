package com.skni.warsztatysghv2.registration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
@ComponentScan("com.skni.warsztatysghv2")
public class UUIDStudentIdGenerator {

    @Bean
    public String getNext() {
        return UUID.randomUUID().toString();
    }
}
