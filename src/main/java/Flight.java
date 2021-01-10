package main.java;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private EPlane plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int numberOfSeatsTaken = 0;
    private final int BAG_WEIGHT = 15;
    private int currentWeight = 0;

    public int getCurrentWeight() {
        return currentWeight;
    }

    public Flight(EPlane plane, int flightNumber,
                  String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public boolean addPassenger(Passenger passenger) {
        if(getRemainingSeatCount() > 0 && addNewBags(passenger.getNumberOfBags()))
            return passengers.add(passenger);
        return false;
    }

    private boolean addNewBags(int bagCount) {
        if(hasEnoughWeightCapacity(bagCount)) {
            this.currentWeight += (bagCount * BAG_WEIGHT);
            return true;
        }
        return false;
    }

    private boolean hasEnoughWeightCapacity(int newBagCount) {
        return ((this.plane.getTOTAL_WEIGHT_CAPACITY() -  this.currentWeight) - (newBagCount * BAG_WEIGHT)) >= 0;
    }


    public int getRemainingSeatCount() {
        return this.plane.getCAPACITY() - this.numberOfSeatsTaken();
    }

    private int numberOfSeatsTaken() {
        return this.passengers.size();
    }

    public Passenger getPassenger(int index) {
        return passengers.get(index);
    }
}
