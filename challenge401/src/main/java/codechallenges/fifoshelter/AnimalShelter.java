package codechallenges.fifoshelter;

import datastructures.stacksandqueues.Queue;

public class AnimalShelter extends Queue {

    Queue cat;
    Queue dog;

//    ----- constructor -----
    public AnimalShelter(Queue cat, Queue dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void enQ (Cat cat){
        this.cat.enQueue(cat);
    }

    public class Node <T> {

        T value;
        Node <T> next;

        Node (T value) {
            this.value = value;
        }

    }

//    public String toString () {
//
////        return toString(this.front.value);
////      out {2} -> {6} -> {12} -> null
//
//    }

    private String toString (Node current){
//  base case -- stops

        if (current == null){
            return "null";
        }

        return String.format("{%s} -> %s", current.value.getClass().getSimpleName(), toString(current.next));

    }
}





