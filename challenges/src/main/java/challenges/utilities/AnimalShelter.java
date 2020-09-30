package challenges.utilities;

public class AnimalShelter {

    Node<Animal> front;
    Node<Animal> tail;

    public void enQ (Animal animal){

        Node<Animal> newNode = new Node<Animal> (animal);

        if (tail != null){
            tail.next = newNode;
        }

        tail = newNode;

        if (front == null){
            front = newNode;
        }
    }

    public class Node <T> {

        T value;
        Node <T> next;

        Node (T value) {
            this.value = value;
        }

    }

    public String toString () {

        return toString(this.front);
//      out {2} -> {6} -> {12} -> null

    }

    private String toString (Node current){
//  base case -- stops

        if (current == null){
            return "null";
        }

        return String.format("{%s} -> %s", current.value.getClass().getSimpleName(), toString(current.next));

    }
}





