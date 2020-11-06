package datastructures;

import datastructures.tree.BinaryTree;
import datastructures.tree.Node;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeBreadthFirstTest {
    @Test
    public void emptyBFS(){
        BinaryTree bt = new BinaryTree();
        assertTrue("Should return empty / null", bt.bfsTraverse().isEmpty());
    }

    @Test
    public void smallBfsTraversal(){
        BinaryTree bt = new BinaryTree();
        bt.add(5);
        bt.add(8);
        bt.add(12);

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(5);
        answer.add(8);
        answer.add(12);

        assertEquals("Lists should be equal", answer, bt.bfsTraverse());
    }

    @Test
    public void bfsSpecificNodes(){
        BinaryTree bt = new BinaryTree();
        Node root = new Node(5);
        Node n1 = new Node(15);
        Node n2 = new Node(65);
        Node n3 = new Node(123);

        bt.root = root;
        bt.root.left = n1;
        bt.root.right = n2;
        bt.root.right.right = n3;

        assertArrayEquals("Arrays should be equal", new Integer[]{5,15,65,123},
                bt.bfsTraverse().toArray());
    }

}
