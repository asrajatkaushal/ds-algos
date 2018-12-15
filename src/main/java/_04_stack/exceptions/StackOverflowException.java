package _04_stack.exceptions;

import java.lang.RuntimeException;

public class StackOverflowException extends RuntimeException {
    private String message;

    public StackOverflowException() {}

    public StackOverflowException(String message) {
        super(message);
        this.message = message;
    }
}