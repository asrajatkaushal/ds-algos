package _03_linked_list;

import _03_linked_list.singly.SinglyLinkedList;
import _03_linked_list.doubly.DoublyLinkedList;
import _03_linked_list.circular.CircularLinkedList;

public class Test {
    public static void main(String args[]) {
        System.out.println("~! Singly Linked List !~");
        Test.testSinglyLinkedList();

        // System.out.println("\n~! Doubly Linked List !~");
        // Test.testDoublyLinkedList();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\n~! Circular Linked List !~");
        Test.testCircularLinkedList();
    }

    private static void testSinglyLinkedList() {
        Test.testList(new SinglyLinkedList<String>());
    }

    private static void testDoublyLinkedList() {
        Test.testList(new DoublyLinkedList<String>());
    }

    private static void testCircularLinkedList() {
        Test.testList(new CircularLinkedList<String>());
    }

    private static void testList(List list) {
        System.out.println("Initial State :: " + list + "  &  length :: " + list.length());

        list.insertAtBegining("Second");
        list.insert("Ninth", 1);
        list.insertAtEnd("Third");
        list.insertAtEnd("Sixth");
        list.insert("Zeroth", 0);
        list.insertAtBegining("First");
        list.insert("Fourth", 4);
        list.insert("Fifth", 5);

        System.out.println("State After Inserts :: " + list + "  &  length :: " + list.length());
        System.out.println("Index of Sixth After Inserts :: " + list.getIndex("Sixth"));

        list.remove(3);
        list.removeFromBegining();
        list.removeFromEnd();
        list.remove(0);

        System.out.println("State After Removes :: " + list + "  &  length :: " + list.length());
        System.out.println("Index of Third After Removes :: " + list.getIndex("Third"));
 
        list.clear();              
 
        System.out.println("State After Clearing List :: " + list + "  &  length :: " + list.length());
    }
}