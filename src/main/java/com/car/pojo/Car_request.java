package com.car.pojo;

public class Car_request {
    private Passenger passenger;
    private PassengerLocation passengerLocation;
    private String distance;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public PassengerLocation getPassengerLocation() {
        return passengerLocation;
    }

    public void setPassengerLocation(PassengerLocation passengerLocation) {
        this.passengerLocation = passengerLocation;
    }
}
