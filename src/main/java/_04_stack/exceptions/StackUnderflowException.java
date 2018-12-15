package _04_stack.exceptions;

import java.lang.RuntimeException;

public class StackUnderflowException extends RuntimeException {
    private String message;

    public StackUnderflowException() {}

    public StackUnderflowException(String message) {
        super(message);
        this.message = message;
    }
}