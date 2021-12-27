package com.cdb.exceptionhandler;

import com.cdb.interceptor.HandlerInterceptorAdapterTest;
import com.cdb.interceptor.HandlerTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author yingge
 * @Date 12/12/2021 7:44 PM
 */
@Configuration
public class MVCGloableConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截器的顺序,按照这个顺序来执行
        registry.addInterceptor(new HandlerInterceptorAdapterTest());
        registry.addInterceptor(new HandlerTest());
        super.addInterceptors(registry);
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }
}
