package dataStructures.linkedlist;

public class LinkedList {

    public Node head = null;
    public Node tail = null;

//    ----- head first -> adds value to front of linked list
    public void insert (int newVal) {

        Node newNode = new Node (newVal);

        if (this.head == null) {

            this.head = newNode;
            this.tail = this.head;

        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

//    ----- checks for a value in the linked list -----
    public boolean includes (int value){
        Node p1 = this.head;

        while (p1 != null){
            if (p1.value == value){
                return true;
            } else {
                p1 = p1.next;
            }
        }
        return false;
    }

//    ----- add value to end of singly linked list -----
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

//    ------ find kth value from end of singly linked list ----- //
    public int nthValueFromEnd (int n) throws Exception {
        Node p1 = head;
        Node p2 = head;

        for (int j=0; j < n; ++j){
            if (p2 == null){
                throw new Exception("Exception");
            }

            p2 = p2.next;
        }

        while (p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1.value;
    }



//    inserts new value after a specific node in a singly linked list
    public void addAfterValue (int value, int newVal){

        Node newNode = new Node(newVal);

        Node pointer = head;

        for (int i=1; ;i++){
            if (pointer == null){
                break;
            }
            if (i-1 == value){
                newNode.next = pointer.next;
                pointer.next = newNode;
                break;
            }
            pointer = pointer.next;
        }
    }


//    interleaves two lists, alternating nodes like a zipper
    public LinkedList zipTwoLists (LinkedList l1, LinkedList l2){

       LinkedList result = new LinkedList();

       Node n1 = l1.head;
       Node n2 = l2.head;

       result.insert(interleave(n1,n2).value);
       return result;

    }

    public Node interleave (Node n1, Node n2){

        if (n1 == null){return n2;}
        if (n2 == null){return n1;}

//  create new linked list in here then return that linked list
        Node result = n1;

        while (n1 != null && n2 != null){
            Node temp1 = n1.next;
            Node temp2 = n2.next;

            if (temp1.next != null){
                n2.next = temp1.next;
            }

            temp1.next = n2;

            n1 = temp1;
            n2 = temp2;
        }

        return result;

    }

//    RECURSIVE MERGE
    public static Node mergeRecursive (LinkedList l1, LinkedList l2){
//        return mergeRecursive(l1.head, l2.head);
        return l1.head;
    }

    private static Node mergeRecursive(Node n1, Node n2){
        if (n1 == null) return n2;
        if (n2 == null) return n1;

        Node temp1 = n1.next;
        Node temp2 = n2.next;
        n1.next = n2;
        n2.next = mergeRecursive(temp1,temp2);

        return n1;
    }

//    BEST MERGE
    private static Node mergeRecursiveBest (Node n1, Node n2){
        if (n1 == null) return n2;

        n1.next = mergeRecursiveBest(n2, n1.next);
        return n1;
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

    private String toString (Node current){
//  base case -- stops
        if (current == null){
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));

    }
}

