package com.cps.learnspringboot.controller.exception;

public class UnauthorizedException extends RuntimeException {

    private final String error;
    private final String message;

    public UnauthorizedException(String error, String message) {
        super(message);
        this.error = error;
        this.message = message;
    }

    public String getError() { return error;}

    @Override
    public String getMessage() { return message; }
}
