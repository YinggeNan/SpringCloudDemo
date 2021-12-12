package com.cdb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yingge
 * @Date 12/12/2021 1:52 PM
 */
@RestController
@Slf4j
public class TestController {

    @RequestMapping(value = "/hello")
    public String hello() throws Exception {
        log.info("visit hello");
        throw new RuntimeException("S");
    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleIOException(Exception ex) {
//        // prepare responseEntity
//        ResponseEntity responseEntity = new ResponseEntity("hello exception", HttpStatus.BAD_REQUEST);
//        return responseEntity;
//    }
}

