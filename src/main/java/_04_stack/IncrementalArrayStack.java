package _04_stack;

import _04_stack.Stack;
import _04_stack.exceptions.*;

public class IncrementalArrayStack<T> implements Stack<T> {
    private Object[] arr;
    int top;

    public IncrementalArrayStack() {
        this.arr = new Object[1];
        this.top = -1;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "Stack is Empty";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = this.top; i >= 0; i--) {
            sb.append((T) this.arr[i]);
            if (i != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    public void push(T data) {
        Object[] newArr = new Object[this.arr.length + 1];
        for (int i = 0; i <= this.top; i++) {
            newArr[i] = (T) this.arr[i];
        }

        this.arr = newArr;
        this.top++;
        this.arr[top] = data;

        System.out.println("Pushing element '" + data + "' into the stack");
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Stack Underflow Exception");
        }

        T data = (T) this.arr[top];
        this.top--;

        System.out.println("Popping element '" + data + "' from the stack");
        return data;
    }

    public T peek() {
        return (T) this.arr[this.top];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return false;
    }
}