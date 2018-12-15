package _03_linked_list.special;

import _03_linked_list.List;

public class UnrolledListBlock <T> implements List <T> {
    private UnrolledListNode<T> blockHead;
    private UnrolledListBlock<T> next;

    UnrolledListBlock() {}

    UnrolledListBlock(UnrolledListNode<T> blockHead) {
        this.blockHead = blockHead;
    }

    public void setBlockHead(UnrolledListNode<T> blockHead) {
        this.blockHead = blockHead;
    }

    public T getBlockHead() {
        return this.blockHead;
    }

    public boolean hasBlockHead() {
        return this != null && this.blockHead != null;
    }

    public void setNext(Node<T> next) {
        this.next = (UnrolledListBlock<T>) next;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public boolean hasNext() {
        return this != null && this.next != null;
    }

    public int length() {
        Node<T> currentNode = this.blockHead;
        int length = 0;

        while(currentNode != null) {
            length++;
            if(currentNode.getNext() == this.head)
                return length;
            currentNode = currentNode.getNext();
        }
        return length;
    }
}
