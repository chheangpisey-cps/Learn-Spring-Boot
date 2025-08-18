package com.cps.learnspringboot.controller.exception;

public class ResourceNotFoundException extends RuntimeException {

    private final int code;
    private final String message;

    public ResourceNotFoundException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public int getCode() { return code;}

    @Override
    public String getMessage() { return message; }
}
