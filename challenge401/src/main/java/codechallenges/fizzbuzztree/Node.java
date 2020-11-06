package codechallenges.fizzbuzztree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    public T value;
    public Node<T> left;
    public Node<T> right;
    private List<Node<T>> children = new ArrayList<>();

    public Node(T value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    @Override
    public String toString() {
        return "data=" + value + " right= "+ right+" left= "+ left + " | ";
    }

    public boolean addChild(Node<T> child) {
        return this.children.add(child);
    }

    public T getValue() {
        return value;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

}
