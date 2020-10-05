package DataStructures.tree;

import java.util.ArrayList;

public class BinaryTree {
    Node root;

    public BinaryTree(){}

    public BinaryTree createTree (){
        BinaryTree newTree = new BinaryTree();

        newTree.add(6); // root
        newTree.add(4);
        newTree.add(8);
        newTree.add(3);
        newTree.add(5);
        newTree.add(7);
        newTree.add(9);

        return newTree;
    }

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

//  ----- Depth First Search Methods -----
//  ----- Pre Order -----
    public ArrayList<Integer> preOrder (Node node){
        ArrayList<Integer> arrPre = new ArrayList<>();
        return preOrderUtil(arrPre,node);
    }

    private ArrayList<Integer> preOrderUtil (ArrayList<Integer> arrPre, Node node){

        if (node != null) {
            arrPre.add(node.value);
            preOrderUtil(arrPre,node.left);
            preOrderUtil(arrPre,node.right);
        }
        return arrPre;
    }

//  ----- In Order -----
    public ArrayList<Integer> inOrder (Node node){
        ArrayList<Integer> arrIn = new ArrayList<>();
        return inOrderUtil(arrIn,node);
    }

    private ArrayList<Integer> inOrderUtil (ArrayList<Integer> arrIn, Node node){

        if (node != null){
            inOrderUtil(arrIn,node.left);
            arrIn.add(node.value);
            inOrderUtil(arrIn,node.right);
        }
        return arrIn;
    }

//  ----- Post Order -----
    public ArrayList<Integer> postOrder (Node node){
        ArrayList<Integer> arrPost = new ArrayList<>();
        return postOrderUtil(arrPost, node);
    }

    private ArrayList<Integer> postOrderUtil (ArrayList<Integer> arrPost,Node node){
        if (node != null){
            postOrderUtil(arrPost, node.left);
            postOrderUtil(arrPost, node.right);
            arrPost.add(node.value);
        }
        return arrPost;
    }
}
