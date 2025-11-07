package models;

import models.abstracts.EletricVehicles;
import models.auxiliary.Location;

public class EletricBike extends EletricVehicles {
    public enum HasRemovableBattery {
        TRUE,
        FALSE
    }
    private HasRemovableBattery removableBattery;

    public EletricBike() {};

    public EletricBike(int id, Location location, int batteryLevel, HasRemovableBattery removableBattery) {
        super(id, location, batteryLevel);
        this.removableBattery = removableBattery;
    }

    public EletricBike(int id, Location location, int batteryLevel) {
        super(id, location, batteryLevel);
        this.removableBattery = HasRemovableBattery.FALSE;
    }

    public HasRemovableBattery getRemovableBattery() {
        return removableBattery;
    }

    public void setRemovableBattery(HasRemovableBattery removableBattery) {
        this.removableBattery = removableBattery;
    }

    @Override
    public String toString() {
        return "EletricBike{" +
                "removableBattery=" + removableBattery +
                "} " + super.toString();
    }

    // Pricing methods
    @Override
    public double calculateRentalPrice(Docent user) {
        return (this.removableBattery == HasRemovableBattery.FALSE ? 2.75 : 3.0); // Base Price for students
    }
    
    @Override
    public double calculateRentalPrice(NonDocent user) {
        return (this.removableBattery == HasRemovableBattery.FALSE ? 2.75 : 3.0); // Base Price for employees
    }

    @Override
    public double calculateRentalPrice(Student user) {
        return (this.removableBattery == HasRemovableBattery.FALSE ? 1.25 : 1.50); // Base Price for students
    }
}
