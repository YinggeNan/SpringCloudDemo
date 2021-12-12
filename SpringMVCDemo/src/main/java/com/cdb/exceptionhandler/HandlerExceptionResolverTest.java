package com.cdb.exceptionhandler;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;

/**
 * @Author yingge
 * @Date 12/12/2021 4:17 PM
 */
@Component
public class HandlerExceptionResolverTest implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println();
        Class c = handler.getClass();
        HandlerMethod handlerMethod = (HandlerMethod)handler;
        System.out.println("className:"+handlerMethod.getBeanType().getName());
        System.out.println("methodName:"+handlerMethod.getMethod().getName());
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
}
