package datastructures.stacksandqueues;

public class Node<T> {
    public T value;
    Node next;

    public Node(T value) {
        this.next = null;
        this.value = value;
    }

}
