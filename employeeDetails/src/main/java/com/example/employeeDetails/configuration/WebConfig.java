package com.example.employeeDetails.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/employees/api/**")
//                .allowedOrigins("http://localhost:3000")
//                .allowedMethods("POST")
//                .allowedHeaders("*");
//    }
}
