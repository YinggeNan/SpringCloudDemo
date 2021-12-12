package com.cdb.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author yingge
 * @Date 12/12/2021 7:15 PM
 */
@Slf4j
public class HandlerTest implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("implement HandlerInterceptor");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
