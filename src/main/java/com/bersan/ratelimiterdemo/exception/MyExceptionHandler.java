package com.bersan.ratelimiterdemo.exception;

import io.github.resilience4j.ratelimiter.RequestNotPermitted;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(RequestNotPermitted.class)
    public ResponseEntity<String> handle(RequestNotPermitted requestNotPermitted){
        return new ResponseEntity<>("Bir Dakikada En Fazla 3 Sorgu Atabilirsiniz ! \n" + requestNotPermitted.getMessage(), HttpStatus.TOO_MANY_REQUESTS);
    }
}
