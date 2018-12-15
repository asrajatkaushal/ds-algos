package _03_linked_list.special;

import _03_linked_list.Node;

public class UnrolledListNode <T> implements Node <T> {
    private T data;
    private UnrolledListNode<T> next;

    UnrolledListNode() {}

    UnrolledListNode(T data) {
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
        this.next = (UnrolledListNode<T>) next;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public boolean hasNext() {
        return this != null && this.next != null;
    }
}
