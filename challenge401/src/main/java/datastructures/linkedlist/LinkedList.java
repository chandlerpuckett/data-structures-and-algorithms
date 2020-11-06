package datastructures.linkedlist;


public class LinkedList {

    public Node head;
    public Node current;

    public LinkedList() {}


    //    ----- head first -> adds value to front of linked list
    public void insert (int newVal) {

        Node newNode = new Node (newVal);
        newNode.next = head;
        head = newNode;

    }


//    ----- checks for a value in the linked list -----
    public boolean includes (int value){
        current = head;

        while (current != null){
            if (current.value == value){
                return  true;
            }
            current = current.next;
        }
        return false;
    }

//    ----- add value to end of singly linked list -----
    public void addToEnd (int newVal){

        Node newNode = new Node (newVal);

        if (this.head == null) {

            this.head = newNode;
            this.current = this.head;

        } else {

            this.current.next = newNode;
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
    public int kthValueFromEnd(int n) {
        int lengthOfList = 0;
        Node current = head;

        while(current.next != null){
            lengthOfList += 1;
            current = current.next;
        }

        if(n > lengthOfList){
            throw new IllegalArgumentException("The kth value is greater than the length of the linked list");
        }

        int frontIndex = lengthOfList - n;
        current = head;

        while(frontIndex != 0){
            current = current.next;
            frontIndex -= 1;
        }

        return current.value;
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
    public LinkedList zipTwoLists(LinkedList list1, LinkedList list2){

        if(list1.head == null){
            return list2;
        }

        Node p1 = list1.head.next;
        Node p2 = list1.head;
        list2.current = list2.head;

        while(p1 != null){

            if(list2.current == null){
                return list1;
            }

            list2.head = list2.current.next;
            p2.next = list2.current;
            list2.current.next = p1;

            list2.current = list2.head;
            p2 = p1;
            p1 = p1.next;
        }

        p2.next = list2.current;
        return list1;
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
            int valueToReturn = this.current.value;
            Node twoFromTheEnd = this.head;

            while (twoFromTheEnd.next.next != null){
                twoFromTheEnd = twoFromTheEnd.next;
            }

            twoFromTheEnd.next = null;
            this.current = twoFromTheEnd;

            return valueToReturn;
        }
    }

//    overloaded toString to format output
    public String toString() {

        return toString(this.head);
//      out {2} -> {6} -> {12} -> null

    }

    private static String toString (Node current){
//  base case -- stops
        if (current == null){
            return null;
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));

    }
}

