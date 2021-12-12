package com.cdb.exceptionhandler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author yingge
 * @Date 12/12/2021 8:11 PM
 */
//@Configuration
public class MVCGloablConfig2 implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
