package DataStructures.linkedlist;

public class LinkedList {

    public Node head = null;
    public Node tail = null;

    // head first -- adds value to front of linked list
    public void addToFront (int newVal) {

        Node newNode = new Node (newVal);

        if (this.head == null) {

            this.head = newNode;
            this.tail = this.head;

        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

//    add value to end of singly linked list
    public void addToEnd (int newVal){

        Node newNode = new Node (newVal);

        if (this.head == null) {

            this.head = newNode;
            this.tail = this.head;

        } else {

            this.tail.next = newNode;
        }
    }

//    inserts new val before a specific node in a singly linked list
    public void addBeforeValue (int value, int newVal){

        Node newNode = new Node(newVal);

        Node pointer = head;

        for (int i=1; ;i++){
            if (pointer == null){
                break;
            }
            if (i == value){
                newNode.next = pointer.next;
                pointer.next = newNode;
                break;
            }
            pointer = pointer.next;
        }


    }




//    removes value from end of the list
//    this removal is not efficient : O(n)
//    efficiency should be O(1)

    public int removeFromEnd() throws Exception {
        if (this.head == null){
            throw new Exception("nothing to remove");
        } else {
            int valueToReturn = this.tail.value;
            Node twoFromTheEnd = this.head;

            while (twoFromTheEnd.next.next != null){
                twoFromTheEnd = twoFromTheEnd.next;
            }

            twoFromTheEnd.next = null;
            this.tail = twoFromTheEnd;

            return valueToReturn;
        }
    }

//    overloaded toString to format output
    public String toString () {

        return toString(this.head);
//      out {2} -> {6} -> {12} -> null

    }

    public String toString (Node current){
//  base case -- stops
        if (current == null){
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));

    }
}

class Node {
    int value;
    Node next;

    protected Node (int value){
        this.value = value;
    }
}

