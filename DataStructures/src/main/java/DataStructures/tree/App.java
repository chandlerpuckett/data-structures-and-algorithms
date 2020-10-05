package DataStructures.tree;

public class App {
    public static void main(String[] args) throws Exception {

        BinaryTree newTree = new BinaryTree().createTree();

        System.out.println("Pre Order: " + newTree.preOrder(newTree.root));
        System.out.println("In Order: " + newTree.inOrder(newTree.root));
        System.out.println("Post Order: " + newTree.postOrder(newTree.root));


    }
}
