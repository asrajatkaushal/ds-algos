package _03_linked_list;

public interface Node<T> {
    T getData();
    void setData(T data);
    boolean hasData();
    Node<T> getNext();
    void setNext(Node<T> next);
    boolean hasNext();
    default Node<T> getPrev() { return null; }
    default void setPrev(Node<T> next) {}
    default boolean hasPrev() { return false; }
}