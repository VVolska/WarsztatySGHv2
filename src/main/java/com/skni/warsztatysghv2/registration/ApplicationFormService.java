package com.skni.warsztatysghv2.registration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.skni.warsztatysghv2")
public class ApplicationFormService {

    @Bean
    public ApplicationForm createMock() {
        return new ApplicationForm("Mikolaj", "Zimkowski", "email@gmail.com"); // new allowed here
    }
}
