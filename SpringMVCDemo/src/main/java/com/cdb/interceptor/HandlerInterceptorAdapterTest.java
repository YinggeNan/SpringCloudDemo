package com.cdb.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author yingge
 * @Date 12/12/2021 7:11 PM
 */
@Slf4j
@Component
public class HandlerInterceptorAdapterTest extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("extends HandlerInterceptorAdapter");

        return super.preHandle(request, response, handler);
    }
}
