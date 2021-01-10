package test.java;

import main.java.EPlane;
import main.java.Flight;
import main.java.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTest {
    Flight flight;
    Passenger passenger;
    @Before public void setUp() {
        flight = new Flight(EPlane.BOEING747, 1,
                "Glasgow", "Edinburgh", "19:00");
        passenger = new Passenger("Jeff", 2);
    }
    @Test public void canBookPassenger() {
        assertTrue(this.flight.addPassenger(passenger));
        assertEquals(passenger, flight.getPassenger(0));
    }
    @Test public void cannotBookPassenger() {
        for(int i = 0; i < 40; i++) {
            this.flight.addPassenger(passenger);
        }
        assertFalse(this.flight.addPassenger(passenger));
        assertEquals(0, flight.getRemainingSeatCount());
    }
    @Test public void canGetCurrentCapacity() {
        assertEquals(40, this.flight.getRemainingSeatCount());
    }
    @Test public void can_GetCurrentCapacity() {
        assertTrue(this.flight.addPassenger(passenger));
        assertEquals(39, this.flight.getRemainingSeatCount());
    }
    @Test public void canReserveWeightForPassenger() {
        flight = new Flight(EPlane.LOW_WEIGHT_CAPACITY_PLANE, 1,
                "Glasgow", "Edinburgh", "19:00");
        flight.addPassenger(passenger);
        assertFalse(flight.addPassenger(passenger));
    }
}
