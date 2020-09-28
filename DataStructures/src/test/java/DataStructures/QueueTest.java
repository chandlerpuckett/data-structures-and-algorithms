package DataStructures;

/*
Tests:
    1. successfully enqueue
    2. enqueue multiple values
    3. dequeue an expected value
    4. peek expected value
    5. empty queue w/ multiple deQueues
    6. instantiate empty queue
    7. peek & dequeue throws exception on empty queue
 */

import DataStructures.stacksandqueues.Queue;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    //    1.
    @Test
    public void testEnQueue () throws Exception {

        Queue test = new Queue();
        test.enQueue(5);
        int answer = test.peek();

        assertEquals(5, answer);

    }

    //    2.
    @Test
    public void testEnQueueMultiple () throws Exception {

        Queue test = new Queue();

        test.enQueue(5);
        test.enQueue(6);
        test.enQueue(7);

        assertEquals(test.isEmpty(),false);
        assertEquals(5, test.peek());
        assertEquals("{5} -> {6} -> {7} -> null", test.toString());

    }

    //    3.
    @Test
    public void testDeQueue () throws Exception {

        Queue test = new Queue();
        test.enQueue(5);
        test.enQueue(6);
        test.enQueue(7);
        int answer = test.deQueue();

        assertEquals(5,answer);

    }

    //    4.
    @Test
    public void testDeQueueEmpty () throws Exception {

        Queue test = new Queue();
        test.enQueue(5);
        test.enQueue(6);
        test.enQueue(7);
        test.deQueue();
        test.deQueue();
        test.deQueue();

        assertEquals(true, test.isEmpty());

    }

    //    5.
    @Test
    public void testPeek () throws Exception {

        Queue test = new Queue();
        test.enQueue(5);
        test.enQueue(6);
        test.enQueue(7);

        assertEquals(5, test.peek());

    }

    //    6.
    @Test
    public void testInitEmptyQueue () {

        Queue test = new Queue();
        assertEquals(true, test.isEmpty());

    }

    //    7.
    @Test
    public void testException () {
//        ----- not working -----

    }
}
