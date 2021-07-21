package com.corey.springbootcrudjpah2.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handeException(Exception ex) {
        return new ResponseEntity<>("Advice Test Exception", HttpStatus.BAD_REQUEST);
    }
}
