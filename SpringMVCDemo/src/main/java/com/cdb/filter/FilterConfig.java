package com.cdb.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author yingge
 * @Date 12/12/2021 8:05 PM
 */
@Slf4j
@Configuration
public class FilterConfig{

    @Bean
    @Order(value = 2)
    public Filter filter1(){
        return new Filter() {
            @Override
            public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {

            }

            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                log.info("Filter1 execute");
                log.info("order=2");
                chain.doFilter(request, response);
            }

            @Override
            public void destroy() {

            }
        };
    }
}
