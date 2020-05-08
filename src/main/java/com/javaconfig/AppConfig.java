package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/salidas.properties")
public class AppConfig {
    
    @Bean
    public Saludator saludator() {
        return new Saludator();
    }

}