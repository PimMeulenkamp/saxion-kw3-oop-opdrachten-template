import nl.saxion.oop.week2.model.Bag;
import nl.saxion.oop.week2.model.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassengerTest {

    private Passenger bob;

    @BeforeEach
    public void init() {
        bob = new Passenger("Bob", "TestSubject");
    }

    @Test
    public void testToString() {
        assertEquals("Bob TestSubject", bob.toString());
    }

    @Test
    public void addLuggageTest() {
        Bag someBag = new Bag(10);

        bob.addLuggage(someBag);

        assertEquals(bob.getLuggage().size(), 1); // Check whether or not bob now has one bag
        assertEquals(bob.getLuggage().get(0), someBag); // Check if that bag is actually the created bag
    }

    @Test
    public void getLuggageTest() {
        Bag someBag = new Bag(10);
        Bag someOtherBag = new Bag(20);

        bob.addLuggage(someBag);
        bob.addLuggage(someOtherBag);

        assertEquals(bob.getLuggage().size(), 2); // Check whether or not bob now has two bags
        assertEquals(bob.getTotalLuggageWeight(), (someBag.getWeight() + someOtherBag.getWeight())); // Check if the weight matches
    }


}