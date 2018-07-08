package com.car.pojo;

public class PassengerLocation {
    private String startPlace;
    private String endPlace;
    private String nowPlace;
    private String passengerId;

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }


    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public String getNowPlace() {
        return nowPlace;
    }

    public void setNowPlace(String nowPlace) {
        this.nowPlace = nowPlace;
    }

    @Override
    public String toString() {
        return "PassengerLocation{" +
                "startPlace='" + startPlace + '\'' +
                ", endPlace='" + endPlace + '\'' +
                ", nowPlace='" + nowPlace + '\'' +
                ", passengerId='" + passengerId + '\'' +
                '}';
    }
}
