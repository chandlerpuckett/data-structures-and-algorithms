package DataStructures.tree;

public class BinarySearchTree extends BinaryTree {
    Node root;

    public BinarySearchTree(){}

//    ----- add to tree -----
    public void add (int value){
        root = addRecursive(root,value);
    }

    private Node addRecursive(Node current, int value) {

        // if current node is empty, return new Node(value)
        if (current == null){return new Node(value);}

        if (value < current.value){
            current.left = addRecursive(current.left,value);
        } else if (value > current.value){
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

//    ----- check tree for value -----
    public boolean contains(Node current, int value){
        if (current == null)
            return false;

        if (value == current.value)
            return true;

        return value < current.value
                ? contains(current.left, value)
                : contains(current.right,value);
    }
}
