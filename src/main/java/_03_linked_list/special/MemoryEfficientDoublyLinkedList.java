package _03_linked_list.special;

import _03_linked_list.List;
import _03_linked_list.singly.MemoryEfficientListNode;

public class MemoryEfficientDoublyLinkedList<T> implements List<T> {
    private MemoryEfficientListNode<T> head;

    public String toString() {
    }

    public Node<T> getHead() {
    }

    public Node<T> getTail() {
    }

    public void insertAtBegining(T data) {
        MemoryEfficientListNode<T> newNode = new MemoryEfficientListNode<T>(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        MemoryEfficientListNode<T> ptrDiff = newNode ^ this.head.getPointerDifference();
        newNode.setPointerDifference(this.head);
        this.head.setPointerDifference(ptrDiff);
        this.head = newNode;
    }

    public void insertAtEnd(T data) {
        MemoryEfficientListNode<T> newNode = new MemoryEfficientListNode<T>(data);
        if (this.head == null) {
            this.head = newNode;
            return;
        } else if (this.head.getPointerDifference() == null) {
            newNode.setPointerDifference(this.head);
            this.head.setPointerDifference(newNode);
        } else {
            MemoryEfficientListNode<T> prevNode = this.head;
            MemoryEfficientListNode<T> currNode = this.head.getPointerDifference();

            while (currNode.getPointerDifference() != prevNode) {
                MemoryEfficientListNode<T> nextNode = prevNode ^ currNode.getPointerDifference();
                prevNode = currNode;
                currNode = nextNode;
            }

            newNode.setPointerDifference(currNode);
            currNode.setPointerDifference(prevNode ^ newNode);
        }
    }

    public void insert(T data, int index) {
        if (index < 0 || (this.head == null && index > 0) || index > this.length()) {
            throw new IndexOutOfBoundsException("Wrong Index Entered");
        } else if (index == 0) {
            this.insertAtBegining(data);
        } else {
            MemoryEfficientListNode<T> newNode = new MemoryEfficientListNode<T>(data);
            MemoryEfficientListNode<T> prevNode = this.head;
            MemoryEfficientListNode<T> currNode = this.head.getPointerDifference();
            MemoryEfficientListNode<T> nextNode;

            while (currNode != null && currNode.getPointerDifference() != prevNode && index > 2) {
                nextNode = prevNode ^ currNode.getPointerDifference();
                prevNode = currNode;
                currNode = nextNode;
                index--;
            }

            newNode.setPointerDifference(currNode);
            currNode.setPointerDifference(prevNode ^ newNode);
        }
    }

    public void removeFromBegining() {
    }

    public void removeFromEnd() {
    }

    public void remove(int index) {
    }

    public int getIndex(T data) {
    }

    public int length() {
    }

    public void clear() {
    }
}
