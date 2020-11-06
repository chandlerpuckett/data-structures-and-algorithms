package codechallenges.fizzbuzztree;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
    public Node<T> root;

    public Tree(){}

    public Tree(Node<T> node){
        this.root = node;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public List<Object> inOrder(){
        List<Object> list = new ArrayList<>();
        return inOrderHelp(list, this.root);
    }

    private List<Object> inOrderHelp(List<Object> list, Node<T> node){
        if (node != null){
            inOrderHelp(list, node.left);
            list.add(node.value);
            inOrderHelp(list, node.right);
        }
        return list;
    }
}

