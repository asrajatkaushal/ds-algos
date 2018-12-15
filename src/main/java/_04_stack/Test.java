package _04_stack;

import _04_stack.exceptions.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("\n~~~~~ FixedArrayStack ~~~~~");
        executeStackOperations(new FixedArrayStack<String>());
        System.out.println("\n~~~~~ IncrementalArrayStack ~~~~~");
        executeStackOperations(new IncrementalArrayStack<String>());
        System.out.println("\n~~~~~ MultiplicativeArrayStack ~~~~~");
        executeStackOperations(new MultiplicativeArrayStack<String>());
        System.out.println("\n~~~~~ LinkedListStack ~~~~~");
        executeStackOperations(new LinkedListStack<String>());
    }

    public static void executeStackOperations(Stack stack) {
        System.out.println("Initial State :: " + stack);

        try {
            // stack.pop();
            stack.push("Zero");
            stack.push("One");
            stack.push("Two");
            stack.push("Three");
            stack.pop();
            System.out.println("Top Element :: " + stack.peek());
            stack.pop();
            stack.push("Four");
            stack.push("Five");
            System.out.println("Top Element :: " + stack.peek());
            stack.push("Six");
            stack.push("Seven");
            stack.pop();
            System.out.println("Top Element :: " + stack.peek());
            stack.pop();
            stack.push("Eight");
            stack.push("Nine");
        } catch(StackOverflowException e) {
            System.out.println(e.getMessage());
        } catch(StackUnderflowException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("State after operations :: " + stack);
    }
}