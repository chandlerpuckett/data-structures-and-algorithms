package codechallengestest;

import codechallenges.fizzbuzztree.FizzBuzzTree;
import codechallenges.fizzbuzztree.Node;
import codechallenges.fizzbuzztree.Tree;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    @Test
    public void testEmptyTree (){
        Tree tree = new Tree();
        assertNotNull(tree);
        assertNull("empty tree",tree.root);
    }


    @Test
    public void testFizzBuzzValues() {
        Tree tree = new Tree();
        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(15);
        Node<Integer> n3 = new Node<>(5);

        tree.root = n1;
        tree.root.left = n2;
        tree.root.right = n3;

        Tree expected = FizzBuzzTree.fizzBuzzTree(tree);

        assertSame("Should equal Fizz", "Fizz", expected.root.value);
    }
}
