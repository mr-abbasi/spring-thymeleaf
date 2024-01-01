package com.abbasi.springThymeleaf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("file:src/main/resources/templates/");
    }

    @Override
    public  void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/aboutus").setViewName("aboutus");
        registry.addViewController("/contactus").setViewName("contactus");
    }
}
