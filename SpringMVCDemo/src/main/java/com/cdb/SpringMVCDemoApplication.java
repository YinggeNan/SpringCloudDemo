package com.cdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Author yingge
 * @Date 12/4/2021 12:15 PM
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.cdb.filter")
public class SpringMVCDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMVCDemoApplication.class, args);
    }
}
