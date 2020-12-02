package com.fh.config.interecptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MySpringMVCConfig extends WebMvcConfigurationSupport {

    @Autowired
    private CommonInterceptor commonInterceptor;


    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(commonInterceptor).addPathPatterns("/**");
    }
}
