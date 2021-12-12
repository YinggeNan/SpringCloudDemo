package com.cdb.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author yingge
 * @Date 12/12/2021 8:26 PM
 */
@WebFilter(filterName = "myFilter",urlPatterns = "/*")
@Slf4j
@Order(value = 1)
public class Filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("Filter2 execute");
        log.info("order=1");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
