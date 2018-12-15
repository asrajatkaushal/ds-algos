package _03_linked_list.special;

import _03_linked_list.special.UnrolledListBlock;
import _03_linked_list.special.UnrolledListNode;

public class UnrolledLinkedList<T> {
    private UnrolledListBlock<T> listHead;

    public String toString() {
    }

    public void insert(T data) {
    }

    public void remove(int index) {
    }

    Node<T> getHead() {
    }

    int getIndex(T data) {
    }

    int length() {
    }

    void clear() {
    }

    int getBlockSize() {
        return Math.ceil(Math.sqrt(this.length()));
    }

    int getElementBlock() {
        return Math.ceil(this.length() / this.getBlockSize());
    }

    int getElementLocation() {
        return this.length() % Math.floor(Math.sqrt(this.length()));
    }
}