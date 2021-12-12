package com.cdb.exceptionhandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author yingge
 * @Date 12/12/2021 5:46 PM
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {RuntimeException.class, Exception.class})
    public void peekException(Exception e){
        if(e instanceof  RuntimeException){
            log.info("check RuntimeException");
        }
        if(e instanceof  Exception){
            log.info("check Exception");
        }
    }
}
