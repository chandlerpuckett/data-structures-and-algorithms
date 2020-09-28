package DataStructures.stacksandqueues;

public class Queue {

    private Node front;
    private Node tail;

    public Queue() {
    }

    public void enQueue (int value){
//        adds new node with value to the BACK of the queue
//        with an O(1) time

        Node newNode = new Node(value);

        if (tail != null){
            tail.next = newNode;
        }

        tail = newNode;

        if (front == null){
            front = newNode;
        }
    }

    public int deQueue () throws Exception {
//        removes node from front of queue and returns value
//        raises exception when called on empty queue

        if (isEmpty()){throw new Exception("EMPTY: DOES NOT EXIST");}

        int value = front.value;
        front = front.next;

        if (front == null){
            tail = null;
        }

        return value;
    }

    public int peek () throws Exception {
//        returns value of the node located in front of the queue
//        does not alter / remove
//        raises exception when empty

        if (front == null) {throw new Exception("EMPTY: DOES NOT EXIST");}
        return front.value;
    }

    public boolean isEmpty () {
//        checks whether queue is empty or not -> return boolean
        return front == null;
    }

//    -------------------------------------------------

//    overloaded toString to format output
    public String toString () {

        return toString(this.front);
//      out {2} -> {6} -> {12} -> null

    }

    private String toString (DataStructures.stacksandqueues.Node current){
//  base case -- stops
        if (current == null){
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));

    }

}
