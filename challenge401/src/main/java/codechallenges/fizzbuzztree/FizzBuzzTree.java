package codechallenges.fizzbuzztree;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class FizzBuzzTree {
    public Tree fizzBuzzTree(Tree inputTree){
        Queue<String> answerQ = new Queue<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return null;
            }

            @Override
            public String poll() {
                return null;
            }

            @Override
            public String element() {
                return null;
            }

            @Override
            public String peek() {
                return null;
            }
        };

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
