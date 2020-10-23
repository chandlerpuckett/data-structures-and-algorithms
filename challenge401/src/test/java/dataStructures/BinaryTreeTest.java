package dataStructures;


import dataStructures.tree.BinaryTree;
import dataStructures.tree.Node;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void emptyTree(){
        BinaryTree testTree = new BinaryTree();
        assertNull(testTree.root);
    }

    @Test
    public void singleRootNode(){
        BinaryTree testTree = new BinaryTree();
        testTree.add(10);
        assertEquals(10,testTree.root.value);
        assertNull(testTree.root.left);
        assertNull(testTree.root.right);
    }

    @Test
    public void leftRightChild(){
        BinaryTree testTree = new BinaryTree();
        testTree.add(10);
        Node nodeLeft = new Node (262);
        Node nodeRight = new Node (65);
        testTree.root.left = nodeLeft;
        testTree.root.right = nodeRight;

        assertEquals(262,testTree.root.left.value);
        assertEquals(65,testTree.root.right.value);
        assertEquals(10,testTree.root.value);
    }

    @Test
    public void preOrderTraversal(){
        BinaryTree testTree = new BinaryTree();
        testTree.add(5);
        testTree.add(12);
        testTree.add(21);
        testTree.add(4);
        testTree.add(3);
        testTree.add(8);
        testTree.add(6);

        ArrayList<Integer> testArr = new ArrayList<>();
        testArr.add(5);
        testArr.add(4);
        testArr.add(3);
        testArr.add(12);
        testArr.add(8);
        testArr.add(6);
        testArr.add(21);
        assertEquals(testArr,testTree.preOrder(testTree.root));
    }

    @Test
    public void inOrderTraversal(){
        BinaryTree testTree = new BinaryTree();
        testTree.add(5);
        testTree.add(12);
        testTree.add(21);
        testTree.add(4);
        testTree.add(3);
        testTree.add(8);
        testTree.add(6);

        ArrayList<Integer> testArr = new ArrayList<>();
        testArr.add(3);
        testArr.add(4);
        testArr.add(5);
        testArr.add(6);
        testArr.add(8);
        testArr.add(12);
        testArr.add(21);
        assertEquals(testArr,testTree.inOrder(testTree.root));
    }

    @Test
    public void postOrderTraversal(){
        BinaryTree testTree = new BinaryTree();
        testTree.add(5);
        testTree.add(12);
        testTree.add(21);
        testTree.add(4);
        testTree.add(3);
        testTree.add(8);
        testTree.add(6);

        ArrayList<Integer> testArr = new ArrayList<>();
        testArr.add(3);
        testArr.add(4);
        testArr.add(6);
        testArr.add(8);
        testArr.add(21);
        testArr.add(12);
        testArr.add(5);
        assertEquals(testArr,testTree.postOrder(testTree.root));
    }

}
