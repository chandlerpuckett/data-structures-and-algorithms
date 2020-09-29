package challenges.utilities;

public class App {
    public static void main(String[] args) {
        Animal tater = new Dog();
        Animal wilbur = new Dog();
        Animal garfield = new Cat();

        AnimalShelter shelter = new AnimalShelter();

        shelter.enQ(tater);         // dog 1
        shelter.enQ(wilbur);        // dog 2
        shelter.enQ(garfield);      // dog 3

        System.out.println(shelter);
    }
}
