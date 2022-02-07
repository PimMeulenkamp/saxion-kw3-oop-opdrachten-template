import nl.saxion.oop.week5.model.Cage;
import nl.saxion.oop.week5.model.animals.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CageTest {
    private Cage cage;
    private Elephant animal1, animal2;
    private Giraffe animal3;

    @BeforeEach
    public void init() {
        cage = new Cage(3);
        animal1 = new Elephant("Dombo", true, 5000);
        animal2 = new Elephant("Jumbo", true, 6000);
        animal3 = new Giraffe("Marty", true, 540);
    }

    @Test
    void addAnimalsSucess() {
        assertEquals(0, cage.getNumberOfAnimals());
        cage.addAnimal(animal1);
        cage.addAnimal(animal2);
        assertEquals(2, cage.getNumberOfAnimals());
    }

    @Test
    void addAnimalCageFull() {
        cage = new Cage(1);
        cage.addAnimal(animal1);

        assertThrows(IllegalStateException.class, () -> {
            cage.addAnimal(animal2); // Add an animal when the cage is full
        });
    }

    @Test
    void addAnimalWrongType() {
        cage.addAnimal(animal1);

        assertThrows(IllegalStateException.class, () -> {
            cage.addAnimal(animal3); // Adds an animal of a different type. Should fail.
        });
    }

    @Test
    void emptyCage() {
        assertEquals(0, cage.getNumberOfAnimals());
        cage.addAnimal(animal1);
        cage.addAnimal(animal2);
        cage.empty();
        assertEquals(0, cage.getNumberOfAnimals());
    }
}
