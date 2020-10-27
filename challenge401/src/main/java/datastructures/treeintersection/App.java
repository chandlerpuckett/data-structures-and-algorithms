package datastructures.treeintersection;

import datastructures.tree.*;

public class App {
    public static void main(String[] args) {
        BinaryTree t1 = new BinaryTree().createTree();
        BinaryTree t2 = new BinaryTree();

        t2.add(12);
        t2.add(2);
        t2.add(9);
        t2.add(5);
        t2.add(8);
        t2.add(21);
        t2.add(7);

        System.out.println(t1.inOrder(t1.root));
        System.out.println(t2.inOrder(t2.root));

        TreeIntersection merge = new TreeIntersection();
        System.out.println(merge.treeIntersection(t1,t2));

    }
}
