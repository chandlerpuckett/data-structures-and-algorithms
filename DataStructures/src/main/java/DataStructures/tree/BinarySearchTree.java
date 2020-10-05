package DataStructures.tree;

public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree(){}

    public boolean contains(Node root, int value){
        if (root.value == value)
            return true;

        if (root.value > value) {
            return contains(root.left, value);
        } else {
            return contains(root.right, value);
        }

    }
}
