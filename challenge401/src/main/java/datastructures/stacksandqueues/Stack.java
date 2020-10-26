package datastructures.stacksandqueues;

public class Stack <Generic> {

    private Node top;
    private Node bottom;

    public Stack() {

    }

    public void push (int value){
//        adds a new node with -- value -- to the top
//        of the stack with an O(1) time performance

        Node node = new Node (value);
        node.next = top;
        top = node;
    }

    public int pop () throws Exception {
//        removes node from top -> returns value
//        should raise exception when called on empty stack

        if (isEmpty()){throw new Exception("EMPTY STACK");}

        int data = top.value;
        top = top.next;

        return data;
    }

    public int peek () throws Exception {
//        return value from top of the stack w/out removing

        if (isEmpty()){throw new Exception("EMPTY STACK");}
        return top.value;
    }

    public boolean isEmpty () throws Exception {
//        if stack is empty -> return true

        return top == null;
    }


//    ------------------- Output Format -------------------
//    overloaded toString to format output

    public String toString () {

        return toString(this.top);
//      out {2} -> {6} -> {12} -> null

    }

    private String toString (datastructures.stacksandqueues.Node current){
//  base case -- stops
        if (current == null){
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));

    }
}

