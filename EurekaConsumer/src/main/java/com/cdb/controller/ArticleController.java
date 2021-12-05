package com.cdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yingge
 * @Date 12/4/2021 5:05 PM
 */
@RestController
public class ArticleController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("/article/call")
    public String callHello() {

//        return restTemplate.getForObject("http://localhost:8081/user/hello", String.class);
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
    }
}
