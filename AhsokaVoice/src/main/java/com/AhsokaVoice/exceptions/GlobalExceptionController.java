package com.AhsokaVoice.exceptions;


import com.AhsokaVoice.Response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(ResourceNotfoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotfoundException resourceNotfoundException){
        String mensaje =resourceNotfoundException.getMessage();
        ApiResponse response= new ApiResponse().builder()
                .message(mensaje)
                .success(true)
                .status(HttpStatus.NOT_FOUND)
                .build();
        return  new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
