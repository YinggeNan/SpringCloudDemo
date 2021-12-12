package com.cdb.exceptionhandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * @Author yingge
 * @Date 12/12/2021 5:53 PM
 */
@Configuration
public class MVCconfig {
    @Bean
    HandlerExceptionResolver errorHandler () {
        SimpleMappingExceptionResolver s =
                new SimpleMappingExceptionResolver();

        //exception to view name mapping
        Properties p = new Properties();
        p.setProperty(NullPointerException.class.getName(), "npeView");
        s.setExceptionMappings(p);
        //mapping status code with view response.
        s.addStatusCode("npeView", 404);
        //setting default error view
        s.setDefaultErrorView("defaultErrorView");
        //setting default status code
        s.setDefaultStatusCode(400);
        return s;
    }
}
