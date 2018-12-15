package _04_stack;

import _04_stack.Stack;
import _04_stack.exceptions.*;
import _03_linked_list.singly.*;

public class LinkedListStack<T> implements Stack<T> {
    private SinglyLinkedList<T> list;
    int top;

    public LinkedListStack() {
        this.top = -1;
        this.list = new SinglyLinkedList<>();
    }

    public String toString() {
        if (this.isEmpty()) {
            return "Stack is Empty";
        }

        return this.list.toString();
    }

    public void push(T data) {
        this.top++;
        this.list.insertAtBegining(data);

        System.out.println("Pushing element '" + data + "' into the stack");
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Stack Underflow Exception");
        }

        this.top--;
        T data = this.list.getHead().getData();
        this.list.removeFromBegining();

        System.out.println("Popping element '" + data + "' from the stack");
        return data;
    }

    public T peek() {
        return this.list.getHead().getData();
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return false;
    }
}