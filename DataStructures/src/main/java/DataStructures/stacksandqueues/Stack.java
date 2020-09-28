package DataStructures.stacksandqueues;

public class Stack {

    private Node top;

    public Stack(int size) {

    }


    public void push (int value){
//        adds a new node with -- value -- to the top
//        of the stack with an O(1) time performance

        Node node = new Node (value);
        node.next = top;
        top = node;

    }

    public int pop () {
//        removes node from top -> returns value
//        should raise exception when called on empty stack

        int data = top.value;
        top = top.next;
        return data;

    }

    public boolean isEmpty () throws Exception {
//        if stack is empty -> return true

        return top == null;
    }
}

