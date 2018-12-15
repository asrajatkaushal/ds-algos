package _03_linked_list.singly;

import _03_linked_list.List;
import _03_linked_list.Node;

public class SinglyLinkedList<T> implements List<T> {
    private Node<T> head;

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

    public Node<T> getHead() {
        return this.head;
    }

    public void insertAtBegining(T data) {
        Node<T> newNode = new SinglyListNode<>(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new SinglyListNode<>(data);
        Node<T> currentNode = this.head;
        while(currentNode != null && currentNode.hasNext()){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    public void insert(T data, int index) {
        if (index == 0) {
            Node<T> newNode = new SinglyListNode<>(data);
            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            Node<T> currentNode = this.head;
            while(currentNode != null && index > 1) {
                currentNode = currentNode.getNext();
                index--;
            }
            if (index == 1) {
                Node<T> newNode = new SinglyListNode<>(data);
                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
            } else {
                throw new IndexOutOfBoundsException("Wrong Index Entered");
            }
        }
    }

    public void removeFromBegining() {
        Node<T> newNode = this.head;
        if(newNode != null && newNode.hasNext()) {
            this.head = newNode.getNext();
            newNode.setNext(null);
        } else {
            this.head.setData(null);
            this.head.setNext(null);
        }
    }

    public void removeFromEnd() {
        Node<T> currentNode = this.head;
        while (currentNode != null && currentNode.getNext().hasNext()) {
            currentNode = currentNode.getNext();
        }
        // Node<T> nodeToDelete = currentNode.getNext();
        currentNode.setNext(null);
    }

    public void remove(int index) {
        if(index == 0){
            Node<T> nodeToRemove = this.head;
            this.head = this.head.getNext();
            nodeToRemove.setNext(null);
        } else{
            Node<T> currentNode = this.head;
            while(currentNode != null && index > 1){
                currentNode = currentNode.getNext();
                index--;
            }
            if (index == 1) {
                Node<T> nodeToRemove = currentNode.getNext();
                currentNode.setNext(nodeToRemove.getNext());
            } else {
                throw new IndexOutOfBoundsException("Wrong Index Entered");
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
             length++;
             currentNode = currentNode.getNext();
         }
         return length;
    }

    public void clear() {
        this.head = null;
    }
}
