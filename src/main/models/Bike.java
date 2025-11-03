package main.models;

import main.interfaces.Capacity;
import  main.models.abstracts.Vehicle;
import main.models.auxiliary.Location;

public class Bike extends Vehicle implements Capacity {
    private int maxCapacity;

    public Bike() {};

    public Bike(int id, Location location, int maxCapacity) {
        super(id, location);
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "maxCapacity=" + maxCapacity +
                "} " + super.toString();
    }

}
