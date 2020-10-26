package datastructures.stacksandqueues;

public class PsuedoQueue {

    Stack s1 = new Stack();
    Stack s2 = new Stack();

    public void enQueue(int value) {
        s1.push(value);
    }

    public int deQueue () throws Exception {

        if (s2.isEmpty()){
            if (s1.isEmpty()) {
                throw new Exception("EMPTY");
            }

            while (!s1.isEmpty()){
                int p = s1.pop();
                s2.push(p);
            }
        }
        return s2.pop();
    }


    //    ------------------- Output Format -------------------
//    overloaded toString to format output

    public String toString () {

        return s1.toString();
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
