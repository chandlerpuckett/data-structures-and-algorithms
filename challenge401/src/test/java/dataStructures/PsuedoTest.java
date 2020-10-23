package dataStructures;

import dataStructures.stacksandqueues.PsuedoQueue;
import org.junit.Test;
import static org.junit.Assert.*;

public class PsuedoTest {

    @Test
    public void testEnQueuePseudo () {
        PsuedoQueue test = new PsuedoQueue();
        test.enQueue(5);
        test.enQueue(6);

        assertEquals("{6} -> {5} -> null",test.toString());
    }

    @Test
    public void testDeQueuePseudo () throws Exception {

        PsuedoQueue test = new PsuedoQueue();
        test.enQueue(5);
        test.enQueue(6);
        test.enQueue(7);
        assertEquals(5, test.deQueue());
    }

}
