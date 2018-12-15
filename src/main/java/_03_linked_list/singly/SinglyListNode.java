package _03_linked_list.singly;

import _03_linked_list.Node;

public class SinglyListNode <T> implements Node <T> {
    private T data;
    private SinglyListNode<T> next;

    SinglyListNode() {}

    SinglyListNode(T data) {
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
        this.next = (SinglyListNode<T>) next;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public boolean hasNext() {
        return this != null && this.next != null;
    }
}
