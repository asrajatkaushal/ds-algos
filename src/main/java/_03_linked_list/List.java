package _03_linked_list;

public interface List<T> {
    Node<T> getHead();
    void insertAtBegining(T data);
    void insertAtEnd(T data);
    void insert(T data, int index);
    void removeFromBegining();
    void removeFromEnd();
    void remove(int index);
    int getIndex(T data);
    int length();
    void clear();
}