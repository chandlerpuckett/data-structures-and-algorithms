package datastructures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public Node root;

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

//    ----- find maximum value -----
    public int findMaxVal (){
        int max = Integer.MIN_VALUE;
        return findMaxValUtil(root,max);
    }

    private int findMaxValUtil (Node current,int max){
        // base case -> if node is empty return current max val
        if(current == null) return max;

        if (current.value > max)
            max = current.value;

        return current.value > max
                ? findMaxValUtil(current.left,max)
                : findMaxValUtil(current.right,max);

    }

//    ----- Breadth First -----
    public void bfsTraverse(){
        ArrayList<Integer> arr = new ArrayList<>();

        Queue<Node> queue = new LinkedList<Node>();
        if (root != null) queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.remove();
            arr.add(node.value);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        System.out.println(arr);
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
