package _03_linked_list.special;

import _03_linked_list.Node;

public class MemoryEfficientListNode <T> implements Node <T> {
    private T data;
    private MemoryEfficientListNode<T> ptrDiff;

    MemoryEfficientListNode() {}

    MemoryEfficientListNode(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public boolean hasData() {
        return this != null && this.data != null;
    }

    public void setPointerDifference(Node<T> ptrDiff) {
        this.ptrDiff = (MemoryEfficientListNode<T>) ptrDiff;
    }

    public Node<T> getPointerDifference() {
        return this.ptrDiff;
    }

    public boolean hasPointerDifference() {
        return this != null && this.ptrDiff != null;
    }
}
