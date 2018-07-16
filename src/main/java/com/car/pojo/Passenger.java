package com.car.pojo;

public class Passenger {
    private String id;
    private PassengerLocation passengerLocation;
    private String tel;
    private String email;
    private String username;
    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PassengerLocation getPassengerLocation() {
        return passengerLocation;
    }

    public void setPassengerLocation(PassengerLocation passengerLocation) {
        this.passengerLocation = passengerLocation;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
