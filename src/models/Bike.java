package models;

import models.abstracts.Vehicle;
import models.auxiliary.Location;

public class Bike extends Vehicle {
    public enum BikeCapacity {
        SINGLE_SEATED,
        DOUBLE_SEATED
    }
    private BikeCapacity maxCapacity;

    public Bike() {}

    public Bike(int id, Location location, BikeCapacity maxCapacity) {
        super(id, location);
        this.maxCapacity = maxCapacity;
    }

    public BikeCapacity getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(BikeCapacity maxCapacity) {
        this.maxCapacity = maxCapacity;
    }   

    @Override
    public String toString() {
        return "Bike{" +
                "maxCapacity=" + maxCapacity +
                "} " + super.toString();
    }

    // Pricing methods
    @Override
    public double calculateRentalPrice(Docent user, long hours) {
        return (this.maxCapacity == BikeCapacity.SINGLE_SEATED ? 2.0 : 3.0); // Base Price for students
    }
    
    @Override
    public double calculateRentalPrice(NonDocent user, long hours) {
        return (this.maxCapacity == BikeCapacity.SINGLE_SEATED ? 2.0 : 3.0); // Base Price for employees
    }

    @Override
    public double calculateRentalPrice(Student user, long hours) {
        return (this.maxCapacity == BikeCapacity.SINGLE_SEATED ? 1.0 : 2.0); // Base Price for students
    }
}
