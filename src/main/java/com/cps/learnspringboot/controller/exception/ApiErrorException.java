package com.cps.learnspringboot.controller.exception;

public class ApiErrorException extends RuntimeException{

    private final int code;
    private final String message;

    public ApiErrorException(int error, String message) {
        super(message);
        this.code = error;
        this.message = message;
    }

    public int getCode() { return code;}

    @Override
    public String getMessage() { return message; }
}
