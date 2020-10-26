package datastructures.tree;

public class App {
    public static void main(String[] args) throws Exception {

        BinaryTree newTree = new BinaryTree().createTree();

        System.out.println("Binary Tree -----");
        System.out.println("Pre Order: " + newTree.preOrder(newTree.root));
        System.out.println("In Order: " + newTree.inOrder(newTree.root));
        System.out.println("Post Order: " + newTree.postOrder(newTree.root));
        System.out.println();

        System.out.println("Find max value [newTree] (9) : " + newTree.findMaxVal());
        System.out.print("BFS traversal: "); newTree.bfsTraverse();
        System.out.println();
        System.out.println();

        BinarySearchTree bstTree = new BinarySearchTree();
        bstTree.add(5);
        bstTree.add(10);
        bstTree.add(14);
        bstTree.add(2);
        bstTree.add(8);

        System.out.println("Binary Search Tree -----");
        System.out.println("Pre Order: " + bstTree.preOrder(bstTree.root));
        System.out.println("In Order: " + bstTree.inOrder(bstTree.root));
        System.out.println("Post Order: " + bstTree.postOrder(bstTree.root));
        System.out.println("Contains? (8) " + bstTree.contains(bstTree.root, 8));
        System.out.println("Contains? (21) " + bstTree.contains(bstTree.root, 21));

    }
}
