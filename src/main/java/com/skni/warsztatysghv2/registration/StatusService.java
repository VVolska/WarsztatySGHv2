package com.skni.warsztatysghv2.registration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Configuration
@ComponentScan("com.skni.warsztatysghv2")
public class StatusService {

    @Bean
    public Status randomStatus() {
        List<Status> statuses = new ArrayList<>(Arrays.asList(Status.values())); // new allowed here
        int randomIndex = ThreadLocalRandom.current().nextInt(0, statuses.size());
        return statuses.get(randomIndex);
    }

}
