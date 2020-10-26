package datastructures;

import datastructures.tree.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindMaxValTest {
    @Test
    public void initTree(){
        BinaryTree tree = new BinaryTree();
        assertNull("instantiate an empty tree",tree.root);
    }

    @Test
    public void findMaxTest(){
        BinaryTree tree = new BinaryTree();
        tree.add(50);
        tree.add(42);
        tree.add(5);
        tree.add(666); // max val
        tree.add(80);
        tree.add(596);
        assertEquals(666,tree.findMaxVal());
    }

    @Test
    public void allValsTheSame(){
        BinaryTree tree = new BinaryTree();
        tree.add(42);
        tree.add(42);
        tree.add(42);
        tree.add(42);
        tree.add(42);
        tree.add(42);
        tree.add(41);
        assertEquals(42,tree.findMaxVal());
    }

    @Test
    public void reallyBigTree(){
        BinaryTree tree = new BinaryTree();

        for (int i = -1000; i <= 10000; i++){
            tree.add(i);
        }

        assertEquals("MAX=10k really big tree",10000, tree.findMaxVal());
    }
}
