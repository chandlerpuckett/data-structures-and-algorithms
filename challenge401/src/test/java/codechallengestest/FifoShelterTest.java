package codechallengestest;

import codechallenges.fifoshelter.AnimalShelter;
import codechallenges.fifoshelter.Cat;
import codechallenges.fifoshelter.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class FifoShelterTest {
    @Test public void testCanInstantiate() {
        AnimalShelter shelter = new AnimalShelter();
        assertNotNull(shelter);
    }

    @Test public void testCanEnqueueCatsAndDogs() {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        Dog cat1 = new Dog("Cat1");
        Dog cat2 = new Dog("Cat2");
        shelter.enQ(dog1);
        shelter.enQ(cat1);
        shelter.enQ(dog2);
        shelter.enQ(cat2);
        assertNotNull(shelter);
    }

    @Test public void testCanDequeueDog() throws Exception {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        shelter.enQ(dog1);
        shelter.enQ(cat1);
        shelter.enQ(dog2);
        shelter.enQ(cat2);
        assertEquals("Dog1", shelter.deQ("dog").getName());
    }

    @Test public void testCanDequeueCat() throws Exception {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        Cat cat1 = new Cat("Cat1");
        Cat cat2 = new Cat("Cat2");
        shelter.enQ(dog1);
        shelter.enQ(cat1);
        shelter.enQ(dog2);
        shelter.enQ(cat2);
        assertEquals("Cat1", shelter.deQ("cat").getName());
    }

    @Test public void testCanOnlyDequeueCatOrDog() throws Exception {
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        Dog cat1 = new Dog("Cat1");
        Dog cat2 = new Dog("Cat2");
        shelter.enQ(dog1);
        shelter.enQ(cat1);
        shelter.enQ(dog2);
        shelter.enQ(cat2);
        assertNull(shelter.deQ("bird"));
    }
}
