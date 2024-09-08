package com.AhsokaVoice.exceptions;

public class ResourceNotfoundException extends RuntimeException{


    public ResourceNotfoundException() {
     super("usuario no encontrado");
    }
    public ResourceNotfoundException(String message) {
        super(message);
    }
}
