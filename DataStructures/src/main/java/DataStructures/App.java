/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DataStructures;

import DataStructures.linkedlist.LinkedList;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws Exception {
        LinkedList L1 = new LinkedList();
        LinkedList L2 = new LinkedList();

        L1.addToFront(2);
        L1.addToFront(3);
        L1.addToFront(1);

        L2.addToFront(4);
        L2.addToFront(9);
        L2.addToFront(5);


//        System.out.println(L1);
//        System.out.println(L2);
//        System.out.println();

        LinkedList combo = new LinkedList();
        combo.mergeRecursive(L1,L2);
        System.out.println(combo);


//        returns nth value from end:

    }
}
