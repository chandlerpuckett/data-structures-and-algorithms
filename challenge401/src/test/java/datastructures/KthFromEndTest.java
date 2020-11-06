package datastructures;

import datastructures.linkedlist.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthFromEndTest {

    @Test
    public void testFirstIndex() {
        LinkedList l1 = new LinkedList();
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);

        System.out.println(l1.toString());

        assertEquals("Should return 3 ", 3, l1.kthValueFromEnd(0));
    }

    @Test
    public void testKthIsMiddle() {
        LinkedList l1 = new LinkedList();
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);

        assertEquals("Should return 4 ", 4, l1.kthValueFromEnd(1));
    }

    @Test
    public void testKthLastIndex() {
        LinkedList l1 = new LinkedList();
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);

        assertEquals("Should return 5 ", 5, l1.kthValueFromEnd(2));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testKthIsInvalid() {
        LinkedList l1 = new LinkedList();
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);

        l1.kthValueFromEnd(20);
    }

    @Test
    public void testKthInvalidGreaterLength() {
        try{
            LinkedList l1 = new LinkedList();
            l1.insert(3);
            l1.insert(4);
            l1.insert(5);
            l1.kthValueFromEnd(20);
        }
        catch(IllegalArgumentException e){
            System.out.println("The kth value is greater than the length of the linked list");
        }
    }

    @Test
    public void testKthOneNode() {

        LinkedList l1 = new LinkedList();
        l1.insert(3);
        l1.kthValueFromEnd(0);

        assertEquals("Should return 3 ", 3, l1.kthValueFromEnd(0));
    }
}
