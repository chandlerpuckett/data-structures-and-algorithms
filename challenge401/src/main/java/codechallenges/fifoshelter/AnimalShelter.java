package codechallenges.fifoshelter;

import datastructures.stacksandqueues.Queue;

public class AnimalShelter extends Queue {

    private Queue<Animal> shelter = new Queue<>();

//    ----- constructor -----

    public AnimalShelter() {
    }

//    ---- EN Q ----
    public void enQ (Animal animal){
        shelter.enQueue(animal);
    }

//    ---- DE Q ----
    public Animal deQ (String animal) throws Exception {
        if (animal.equalsIgnoreCase("dog"))
            return getDog();
        else if (animal.equalsIgnoreCase("cat"))
            return getCat();
        else
            return null;
    }

    private Animal getDog() throws Exception {
        Animal animal = null;
        Queue<Animal> temp = new Queue();
        while (!shelter.isEmpty()) {
            if (shelter.peek().getClass().equals(Dog.class) && animal == null)
                animal = shelter.deQueue();
            else
                temp.enQueue(shelter.deQueue());
        }
        while (!temp.isEmpty()) {
            shelter.enQueue(temp.deQueue());
        }

        return animal;
    }

    private Animal getCat() throws Exception {
        Animal animal = null;
        Queue<Animal> temp = new Queue();
        while (!shelter.isEmpty()) {
            if (shelter.peek().getClass().equals(Cat.class) && animal == null)
                animal = shelter.deQueue();
            else
                temp.enQueue(shelter.deQueue());
        }
        while (!temp.isEmpty()) {
            shelter.enQueue(temp.deQueue());
        }

        return animal;
    }



}





