package _03_linked_list.circular;

import _03_linked_list.Node;

public class CircularListNode <T> implements Node <T> {
    private T data;
    private CircularListNode<T> next;

    CircularListNode() {}

    CircularListNode(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public boolean hasData() {
        return this != null && this.data != null;
    }

    public void setNext(Node<T> next) {
        this.next = (CircularListNode<T>) next;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public boolean hasNext() {
        return this != null && this.next != null;
    }
}