package _03_linked_list.doubly;

import _03_linked_list.Node;

public class DoublyListNode <T> implements Node <T> {
    private T data;
    private DoublyListNode<T> next;
    private DoublyListNode<T> prev;

    DoublyListNode() {}
    
    DoublyListNode(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
            this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }
    
    public void setNext(Node<T> next) {
        this.next = (DoublyListNode<T>) next;
    }

    public Node<T> getPrev() {
        return this.prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = (DoublyListNode<T>) prev;
    }

    public boolean hasData() {
        return this != null && this.data != null;
    }

    public boolean hasNext() {
        return this != null && this.next != null;
    }

    public boolean hasPrev() {
        return this != null && this.prev != null;
    }
}
