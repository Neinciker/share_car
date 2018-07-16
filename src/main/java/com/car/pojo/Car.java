package com.car.pojo;

import java.util.List;

public class Car extends PassengerLocation {
    private int id ;
    private int car_size;
    private int rest_car_size;
    private List<Car_request> car_request;
    private String car_username;
    private String password;
    private boolean car_status;

    public boolean isCar_status() {
        return car_status;
    }

    public void setCar_status(boolean car_status) {
        this.car_status = car_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCar_size() {
        return car_size;
    }

    public void setCar_size(int car_size) {
        this.car_size = car_size;
    }

    public int getRest_car_size() {
        return rest_car_size;
    }

    public void setRest_car_size(int rest_car_size) {
        this.rest_car_size = rest_car_size;
    }

    public List<Car_request> getCar_request() {
        return car_request;
    }

    public void setCar_request(List<Car_request> car_request) {
        this.car_request = car_request;
    }

    public String getCar_username() {
        return car_username;
    }

    public void setCar_username(String car_username) {
        this.car_username = car_username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
