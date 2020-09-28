package DataStructures;

/*
Tests:
    1. push onto a stack
    2. push multiple values
    3. pop off the stack
    4. empty stack after multiple pops
    5. peek next item on stack
    6. instantiate empty stack
    7. empty stack throws exception
 */

import DataStructures.stacksandqueues.Stack;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class StackTest {

//    1.
    @Test
    public void testPushStack () throws Exception {

        Stack stack1 = new Stack();
        stack1.push(5);
        int answer = stack1.peek();

        assertEquals(5,answer);
    }

//    2.
    @Test
    public void testPushMultiple () throws Exception {

        Stack stack1 = new Stack();

        stack1.push(5);
        stack1.push(6);
        stack1.push(7);

        assertEquals(stack1.isEmpty(), false);
        assertEquals(7, stack1.peek());
        assertEquals("{7} -> {6} -> {5} -> null", stack1.toString());
    }

//    3.
    @Test
    public void testPop () throws Exception {

        Stack stack1 = new Stack();
        stack1.push(10);
        stack1.push(11);
        stack1.push(12);

        assertEquals(12,stack1.pop());

    }

//    4.
    @Test
    public void testPopUntilEmpty () throws Exception {

        Stack stack1 = new Stack();
        stack1.push(5);
        stack1.push(6);
        stack1.pop();
        stack1.pop();

        assertEquals(true,stack1.isEmpty());

    }

//    5.
    @Test
    public void testPeek () throws Exception {

        Stack stack1 = new Stack();

        stack1.push(5);
        stack1.push(6);
        stack1.push(7);

        assertEquals(7,stack1.peek());

    }

//    6.
    @Test
    public void testInitEmptyStack () throws Exception {

        Stack stack1 = new Stack();

        assertEquals(true, stack1.isEmpty());

    }

//    7.
    @Test
    public void testException () throws Exception {
//  ---- not working ----
        
    }



}
