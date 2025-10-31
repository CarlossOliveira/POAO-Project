package main.models;

import java.lang.reflect.AccessFlag;

public class Vehicle {
    int id;
    AccessFlag.Location location;

    public Vehicle(){}

    public Vehicle(int id, AccessFlag.Location location) {
        this.id = id;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccessFlag.Location getLocation() {
        return location;
    }

    public void setLocation(AccessFlag.Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", location=" + location +
                '}';
    }
}
