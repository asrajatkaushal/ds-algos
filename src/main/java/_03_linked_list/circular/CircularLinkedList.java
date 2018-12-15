package _03_linked_list.circular;

import _03_linked_list.List;
import _03_linked_list.Node;

public class CircularLinkedList<T> implements List<T> {
    private Node<T> head;

    public String toString() {
        Node<T> currentNode = this.head;
        StringBuilder sb = new StringBuilder("[");
        while(currentNode != null) {
            sb.append(currentNode.getData());
            if (currentNode.hasNext() && currentNode.getNext() != this.head) {
                sb.append(", ");
            } else {
                break;
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
        Node<T> newNode = new CircularListNode<>(data);
        Node<T> currentNode = this.head;

        while (currentNode != null && currentNode.getNext() != this.head) {
            currentNode = currentNode.getNext();
        }

        if (currentNode == null) {
            currentNode = newNode;
        }
        newNode.setNext(this.head);
        this.head = newNode;
        currentNode.setNext(newNode);
    }

    public void insertAtEnd(T data) {
        Node<T> newNode = new CircularListNode<>(data);
        Node<T> currentNode = this.head;

        while (currentNode != null && currentNode.getNext() != this.head) {
            currentNode = currentNode.getNext();
        }

        if (currentNode == null) {
            currentNode = newNode;
        }
        newNode.setNext(this.head);
        currentNode.setNext(newNode);
    }

    public void insert(T data, int index) {
        if (index == 0) {
            this.insertAtBegining(data);
        } else {
            Node<T> newNode = new CircularListNode<>(data);
            Node<T> currentNode = this.head;

            while (currentNode != null && index > 1) {
                currentNode = currentNode.getNext();
                index--;
            }

            if (currentNode == null) {
                currentNode = newNode;
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
    }

    public void removeFromBegining() {
        Node<T> currentNode = this.head;

        while (currentNode != null && currentNode.getNext() != this.head) {
            currentNode = currentNode.getNext();
        }

        if(currentNode != null) {
            if(currentNode.getNext() != null) {
                currentNode.setNext(currentNode.getNext().getNext());
            } else {
                currentNode.setNext(currentNode);
            }
            this.head.setNext(null);
            this.head = currentNode.getNext();
        }
    }

    public void removeFromEnd() {
        Node<T> currentNode = this.head;
        while (currentNode != null && currentNode.getNext().getNext() != this.head) {
            currentNode = currentNode.getNext();
        }
        if(currentNode != null) {
            Node<T> nodeToRemove = currentNode.getNext();
            if(currentNode.getNext() != null) {
                currentNode.setNext(currentNode.getNext().getNext());
            } else {
                currentNode.setNext(currentNode);
            }
            nodeToRemove.setNext(null);     
        }
    }

    public void remove(int index) {
        if (index == 0) {
            this.removeFromBegining();
        } else {
            Node<T> currentNode = this.head;

            while (currentNode != null && currentNode.getNext() != this.head && index > 1) {
                currentNode = currentNode.getNext();
                index--;
            }

            if(currentNode != null) {
                Node<T> nodeToRemove = currentNode.getNext();
                if(currentNode.getNext() != null) {
                    currentNode.setNext(currentNode.getNext().getNext());
                } else {
                    currentNode.setNext(currentNode);
                }
                nodeToRemove.setNext(null);     
            }
        }
    }

    public int getIndex(T data) {
        Node<T> currentNode = this.head;
        int index = 0;

        while(currentNode != null && currentNode.getNext() != this.head) {
            if(currentNode.getData().equals(data))
                break;
            currentNode = currentNode.getNext();
            index++;
        }
        if(currentNode.getData().equals(data))
            return index;
        return -1;
    }

    public int length() {    
        Node<T> currentNode = this.head;
        int length = 0;

        while(currentNode != null) {
            length++;
            if(currentNode.getNext() == this.head)
                return length;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    public void clear() {
        this.head = null;
    }
}