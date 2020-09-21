package linkedlist;

public class LinkedList {

    public Node head = null;
    public Node tail = null;

    public void main(String[] args) {
        LinkedList newList = new LinkedList();
        newList.addToFront(2);
        newList.addToFront(6);
        newList.addToFront(12);

        try {
            newList.removeFromEnd();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(newList);
    }

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
