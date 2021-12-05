package com.cdb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yingge
 * @Date 12/4/2021 5:03 PM
 */
@RestController
public class UserController {
    @GetMapping("/user/hello")
    public String hello() {
        return "hello";
    }
}
