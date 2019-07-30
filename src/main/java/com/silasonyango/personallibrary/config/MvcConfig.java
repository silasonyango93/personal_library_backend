package com.silasonyango.personallibrary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

            @Bean
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/user/*").allowedOrigins("*");
                registry.addMapping("/resource_types/*").allowedOrigins("*");
            }


}
