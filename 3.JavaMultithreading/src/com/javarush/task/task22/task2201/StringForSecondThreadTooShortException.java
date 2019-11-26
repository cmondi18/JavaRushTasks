package com.javarush.task.task22.task2201;

public class StringForSecondThreadTooShortException extends RuntimeException {
    Throwable e;

    public StringForSecondThreadTooShortException(Throwable e) {
        this.e = e;
    }

    @Override
    public Throwable getCause() {
        return new StringIndexOutOfBoundsException("String index out of range: -1");
    }
}
