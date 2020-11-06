package datastructures.stacksandqueues;

public class Queue<T> {

    private Node<T> front;
    private Node<T> back;
    private Node<T> temp;

    public Queue() {
    }

    public void enQueue (T value){
//        adds new node with value to the BACK of the queue
//        with an O(1) time

        temp = (Node<T>) new Node(value);

        if (back == null){
            front = temp;
        } else {
            back.next = temp;
        }
        back = temp;
    }

    public T deQueue () throws Exception {
//        removes node from front of queue and returns value
//        raises exception when called on empty queue

        if (isEmpty()){
            throw new Exception("EMPTY: DOES NOT EXIST");
        } else {
            temp = front;
            front = front.next;
            return (T) temp.value;
        }
    }

    public T peek () throws Exception {
//        returns value of the node located in front of the queue
//        does not alter / remove
//        raises exception when empty

        if (front == null){
            throw new Exception("EMPTY: DOES NOT EXIST");
        } else {
            return (T) front.value;
        }
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

    private String toString (datastructures.stacksandqueues.Node current){
//  base case -- stops
        if (current == null){
            return "null";
        }
        return String.format("{%s} -> %s", current.value, toString(current.next));

    }

}
