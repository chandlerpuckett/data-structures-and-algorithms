package datastructures;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ZipListTest {

    // Test when both LL are empty
    @Test
    public void testBothEmpty(){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList newList = new LinkedList();

        newList.zipTwoLists(list1,list2);

        assertNull(list1.toString());
        assertNull(list2.toString());
        assertNull(newList.toString());

    }

    // success case
    @Test
    public void zipListSucceed(){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insert(5);
        list1.insert(10);
        list1.insert(15);

        list2.insert(4);
        list2.insert(20);
        list2.insert(69);

        LinkedList newList = new LinkedList().zipTwoLists(list1,list2);

        assertEquals("{15} -> {69} -> {10} -> {20} -> {5} -> {4} -> null",
                newList.toString());

    }

    // test one list empty
    @Test
    public void zipListOneEmpty(){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insert(5);
        list1.insert(10);

        LinkedList zipList = new LinkedList().zipTwoLists(list1,list2);

        assertEquals("{10} -> {5} -> null", zipList.toString());
    }
}
