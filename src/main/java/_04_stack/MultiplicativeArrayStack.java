package _04_stack;

import _04_stack.Stack;
import _04_stack.exceptions.*;

public class MultiplicativeArrayStack<T> implements Stack<T> {
    private Object[] arr;
    int top;

    public MultiplicativeArrayStack() {
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
        if (this.isFull()) {
            Object[] newArr = new Object[this.arr.length * 2];
            for(int i = 0; i < this.arr.length; i++) {
                newArr[i] = (T) this.arr[i];
            }
            this.arr = newArr;
        }

        this.top++;
        this.arr[this.top] = data;

        System.out.println("Pushing element '" + data + "' into the stack");
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Stack Underflow Exception");
        }

        T data = (T) this.arr[this.top];
        this.top--;

        System.out.println("Popping element '" + data + "' from the stack");
        return data;
    }

    public T peek() {
        return (T) this.arr[top];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return (this.top + 1) == this.arr.length;
    }
}