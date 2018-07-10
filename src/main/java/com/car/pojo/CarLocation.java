package com.car.pojo;

import java.sql.Time;

public class CarLocation {
    private Time now_time;
    private String location;

    public Time getNow_time() {
        return now_time;
    }

    public void setNow_time(Time now_time) {
        this.now_time = now_time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
