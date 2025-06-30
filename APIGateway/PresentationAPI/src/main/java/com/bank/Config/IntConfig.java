package com.bank.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Configuration
public class IntConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
