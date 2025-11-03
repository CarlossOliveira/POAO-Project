package main.models.abstracts;

import main.models.auxiliary.Location;

public abstract class Vehicle {
    int id;
    Location location;

    public Vehicle(){}

    public Vehicle(int id, Location location) {
        this.id = id;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
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
