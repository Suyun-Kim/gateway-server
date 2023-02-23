package com.example.rlotgatewayservice.exception.handler;

import com.example.rlotgatewayservice.exception.BadRequestException;
import com.example.rlotgatewayservice.exception.ResourceNotFoundException;
import com.example.rlotgatewayservice.exception.obj.Error;

import com.example.rlotgatewayservice.exception.obj.ResponseEnvelop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@Slf4j
@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST) //400
    public ResponseEnvelop<Void> handleBadRequestException(BadRequestException e){

        Error error = new Error(e.getMessage());
        return new ResponseEnvelop<Void>(false, error);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST) //400
    public ResponseEnvelop<Void> handleNotfoundException(ResourceNotFoundException e){

        Error error = new Error(e.getMessage());
        return new ResponseEnvelop<Void>(false, error);
    }

}
