package com.springbootfundamentals.exception;

public class AppNotFoundException extends RuntimeException{
    public  AppNotFoundException(String exception) {
        super(exception);
    }
}
