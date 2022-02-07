import nl.saxion.oop.week2.model.Airplane;
import nl.saxion.oop.week2.model.Bag;
import nl.saxion.oop.week2.model.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {

    /**
     * Note to the user: Please notice that you DO need to have methods with specific names. If you have named your method in the Airplane class differently, you must update the tests below.
     */
    private Airplane plane;
    private Passenger bob, jane;

    @BeforeEach
    public void init() {
        plane = new Airplane(1);
        bob = new Passenger("Bob", "TestSubject");
        jane = new Passenger("Jane", "TestSubject");
    }

    @Test
    public void testLockDoors() {
        plane.lockDoors();

        assertTrue(plane.hasLockedDoors());
    }

    @Test
    public void testUnlockUnlockedDoors() {
//        plane.lockDoors(); // we'll forget to lock the doors.. Should not matter
        plane.unlockDoors();

        assertFalse(plane.hasLockedDoors());
    }

    @Test
    public void testUnlockDoors() {
        plane.lockDoors();

        plane.unlockDoors();

        assertFalse(plane.hasLockedDoors());
    }

    @Test
    public void testBoardPassenger() {
        plane.boardPassenger(bob);
    }

    @Test
    public void testBoardPassengerWithLuggage() {
        Bag b = new Bag(10);
        bob.addLuggage(b);

        plane.boardPassenger(bob);
    }

    @Test
    public void testBoardPassengersWithLockedDoors() {
        plane.lockDoors();

        assertThrows(IllegalStateException.class, () -> { // We expect code inside these { } to throw an instance of the IllegalStateException class.
            plane.boardPassenger(bob); // We expect this to throw an Exception since the doors are closed!
        });
    }

    @Test
    public void testBoardPlaneWithoutCapacity() {
        plane.boardPassenger(jane);

        assertThrows(IllegalArgumentException.class, () -> {
            plane.boardPassenger(bob); // This should throw an IAE because there are no seats for Bob.
        });
    }

    @Test
    public void testBoardPassengerWithTooMuchLuggage() {
        Bag b = new Bag(100); // Too much weight!
        bob.addLuggage(b);

        assertThrows(IllegalArgumentException.class, () -> {
            plane.boardPassenger(bob); // This should throw an IAE because Bob's luggage is too heavy.
        });
    }
}