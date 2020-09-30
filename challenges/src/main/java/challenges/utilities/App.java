package challenges.utilities;

public class App {
    public static void main(String[] args) {
        Animal tater = new Dog("tater");
        Animal wilbur = new Dog("wilbur");
        Animal garfield = new Cat("garfield");

        AnimalShelter shelter = new AnimalShelter();

        shelter.enQ(tater);         // dog 1
        shelter.enQ(wilbur);        // dog 2
        shelter.enQ(garfield);      // dog 3

        System.out.println(shelter);
    }
}
