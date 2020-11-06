package datastructures;

import datastructures.stacksandqueues.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoTest {

    @Test
    public void testEnQueuePseudo () {
        PseudoQueue test = new PseudoQueue();
        test.enQueue(5);
        test.enQueue(6);

        assertEquals("{6} -> {5} -> null",test.toString());
    }

    @Test
    public void testDeQueuePseudo () throws Exception {
        PseudoQueue test = new PseudoQueue();
        test.enQueue(5);
        test.enQueue(6);
        test.enQueue(7);
        assertEquals(5, test.deQueue());
    }

    //test enqueue multiple nodes
    @Test
    public void testEnqueueMultipleNode() throws Exception {
        PseudoQueue test = new PseudoQueue();
        test.enQueue(34);
        test.enQueue(35);

        assertEquals("Should return 34", 34 , test.deQueue());
    }

    // Test dequeue method
    @Test(expected = Exception.class)
    public void testDequeue() throws Exception {
        PseudoQueue test = new PseudoQueue();
        test.enQueue(100);
        test.enQueue(101);
        test.deQueue();
        test.deQueue();
        test.deQueue();
    }

}
