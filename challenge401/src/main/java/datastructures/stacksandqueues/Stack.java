package datastructures.stacksandqueues;

public class Stack<T> {

    private Node<T> top;
    private Node<T> bottom;

    public Stack() {

    }

    public void push (T value){
//        adds a new node with -- value -- to the top
//        of the stack with an O(1) time performance

        Node<T> node = new Node<>(value);
        node.next = top;
        top = node;
    }

    public T pop () throws Exception {
//        removes node from top -> returns value
//        should raise exception when called on empty stack

        if (isEmpty()){
            throw new Exception("EMPTY STACK");
        }

        T data = (T) top.value;
        top = top.next;

        return data;
    }

    public T peek () throws Exception {
//        return value from top of the stack w/out removing

        if (isEmpty()){throw new Exception("EMPTY STACK");}
        return (T) top.value;
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
        return String.format("{%s} -> %s", current.value, toString(current.next));

    }
}

