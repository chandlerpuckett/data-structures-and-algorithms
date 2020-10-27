package datastructures;

import datastructures.tree.BinaryTree;
import datastructures.treeintersection.TreeIntersection;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class TreeIntersectionTest {
    // Expected Outcome
    // Expected Failure
    // Edge Case

    @Test
    public void treeIntersectSuccess(){
        BinaryTree t1 = new BinaryTree();
        BinaryTree t2 = new BinaryTree();
        TreeIntersection commonVal = new TreeIntersection();

        t1.add(5);
        t1.add(10);
        t1.add(15);
        t1.add(20);

        t2.add(7);
        t2.add(10);
        t2.add(15);
        t2.add(12);

        ArrayList<Integer> ansList = new ArrayList<>();
        ansList.add(10);
        ansList.add(15);

        assertEquals(ansList, commonVal.treeIntersection(t1,t2));
    }

    @Test
    public void treeMergeFail(){
        BinaryTree t1 = new BinaryTree();
        BinaryTree t2 = new BinaryTree();
        TreeIntersection commonVal = new TreeIntersection();

        t1.add(12);
        t1.add(19);
        t1.add(21);
        t1.add(35);
        t1.add(45);

        t2.add(13);
        t2.add(20);
        t2.add(22);
        t2.add(36);
        t2.add(46);

        ArrayList<Integer> ansList = new ArrayList();

        assertEquals(ansList, commonVal.treeIntersection(t1,t2));
        assertFalse(t1.root == t2.root);
    }

    @Test
    public void treeMergeEdgeCase(){
        BinaryTree t1 = new BinaryTree();
        BinaryTree t2 = new BinaryTree();
        TreeIntersection commonVal = new TreeIntersection();
        ArrayList<Integer> ansList = new ArrayList<>();

        assertNull(t1.root);
        assertNull(t2.root);
        assertEquals(ansList, commonVal.treeIntersection(t1,t2));
    }
}
