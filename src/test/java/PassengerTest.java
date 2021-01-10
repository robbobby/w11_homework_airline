package test.java;

import main.java.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
        Passenger passenger;
    @Before public void setUp() {
        passenger = new Passenger("Jeff", 2);
    }
    @Test public void hasANameFromConstructor() {
        assertEquals("Jeff", passenger.getName());
    }
    @Test public void hasANumberOfBags() {assertEquals(2, passenger.getNumberOfBags());}
}
