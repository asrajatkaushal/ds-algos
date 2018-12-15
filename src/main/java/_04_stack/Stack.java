package _04_stack;

public interface Stack<T> {
    void push(T data);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();
}