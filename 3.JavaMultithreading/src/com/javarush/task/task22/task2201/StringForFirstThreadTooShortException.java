package com.javarush.task.task22.task2201;

public class StringForFirstThreadTooShortException extends RuntimeException {
    Throwable cause;

    public StringForFirstThreadTooShortException(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public Throwable getCause() {
        return new StringIndexOutOfBoundsException("String index out of range: -1");
    }
}
