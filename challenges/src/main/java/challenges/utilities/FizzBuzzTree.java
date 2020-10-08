package challenges.utilities;

import java.util.ArrayList;
import java.util.Queue;

public class FizzBuzzTree {
    public Tree fizzBuzzTree(Tree inputTree){
        Queue<String> answerQ = new Queue<String>();

        Node current = inputTree.root;
        Tree answerTree = new Tree();

        while (current != null){

            if(current.value % 3 == 0){
//                answerQ.add
            } else if (current.value % 5 == 0){
//                BUZZ
            } else if (current.value % 3 == 0 && current.value % 5 == 0){
//                FIZZBUZZ
            } else ; // STRINGIFY

        }
        return answerTree;
    }
}

class Tree {
    public Node root;

    Tree(){}

    public void add (int value){root = addRecursive(root,value);}

    private Node addRecursive(Node current, int value){
        if (current == null){return new Node(value);}

        if (value < current.value)
            current.left = addRecursive(current.left,value);
        else if (value > current.value)
            current.right = addRecursive(current.right,value);
        else return current;
        return current;
    }
}

class Node{
    int value;
    Node left, right;

    public Node() {

    }

    Node (int value){
        this.value = value;
        left = right = null;
    }

}
