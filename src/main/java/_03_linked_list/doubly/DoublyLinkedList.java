package _03_linked_list.doubly;

import _03_linked_list.List;
import _03_linked_list.Node;

public class DoublyLinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;

    public Node<T> getHead() {
        return this.head;
    }

    public Node<T> getTail() {
        return this.tail;
    }

    public String toString() {
        Node<T> currentNode = this.head;
        StringBuilder sb = new StringBuilder("[");
        while(currentNode != null && currentNode.hasData()) {
            sb.append(currentNode.getData());
            if (currentNode.hasNext()) {
                sb.append(", ");
            }
            currentNode = currentNode.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    public void insertAtBegining(T data) {
        Node<T> newNode = new DoublyListNode<T>(data);
        newNode.setNext(this.head);
        if (this.head != null) {
            this.head.setPrev(newNode);
        } else {
            this.tail = newNode;
        }
        this.head = newNode;
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new DoublyListNode<T>(data);
        newNode.setPrev(this.tail);
        if (this.tail != null) {
            this.tail.setNext(newNode);
        } else {
            this.head = newNode;
        }
        this.tail = newNode;
    }

    public void insert(T data, int index) {
        if (index == 0) {
            Node<T> newNode = new DoublyListNode<>(data);
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;
        } else {
            Node<T> currentNode = this.head;
            while(currentNode != null && index > 1) {
                currentNode = currentNode.getNext();
                index--;
            }
            if (index == 1) {
                Node<T> newNode = new DoublyListNode<T>(data);
                newNode.setPrev(currentNode);
                
                if (currentNode != null) {
                    newNode.setNext(currentNode.getNext());
                    currentNode.getNext().setPrev(newNode);
                    currentNode.setNext(newNode);
                }
            } else {
                throw new IndexOutOfBoundsException("Wrong Index Entered");
            }
        }
    }

    public void removeFromBegining() {
        this.head = this.head.getNext();
        this.head.setPrev(null);        
    }

    public void removeFromEnd() {
        this.tail = this.tail.getPrev();
        this.tail.setNext(null);
    }

    public void remove(int index) {
        if (index == 0) {
            this.head = this.head.getNext();
            this.head.getPrev().setNext(null);
            this.head.setPrev(null);
        } else {
            Node<T> currentNode = this.head;
            while(currentNode != null && index > 1) {
                currentNode = currentNode.getNext();
                index--;
            }
            if(index == 1) {
                Node<T> nodeToRemove = currentNode.getNext();
                nodeToRemove.getPrev().setNext(nodeToRemove.getNext());
                nodeToRemove.getNext().setPrev(nodeToRemove.getPrev());
                nodeToRemove.setPrev(null);
                nodeToRemove.setNext(null);
            }
        }
    }

    public int getIndex(T data) {
        int index = 0;
        Node<T> currentNode = this.head;
        while(currentNode != null){
            if(currentNode.getData().equals(data)){
                return index;
            }
            index++;
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    public int length() {
         Node<T> currentNode = this.head;
         int length = 0;
         while(currentNode != null){
             currentNode = currentNode.getNext();
             length++;
         }
         return length;
    }

    public void clear() {
        this.head = null;
        this.tail = null;
    }
}