package models;

import models.abstracts.EletricVehicles;
import models.auxiliary.Location;

public class EletricScooter extends EletricVehicles {
    public enum HasLCD {
        TRUE,
        FALSE
    }
    private HasLCD LCD;

    public EletricScooter() {};

    public EletricScooter(int id, Location location, int batteryLevel, HasLCD LCD) {
        super(id, location, batteryLevel);
        this.LCD = LCD;
    }

    public EletricScooter(int id, Location location, int batteryLevel) {
        super(id, location, batteryLevel);
        this.LCD = HasLCD.FALSE;
    }

    public HasLCD getLCD() {
        return LCD;
    }

    public void setLCD(HasLCD LCD) {
        this.LCD = LCD;
    }

    @Override
    public String toString() {
        return "EletricScooter{" +
                "LCD=" + LCD +
                "} " + super.toString();
    }

    // Pricing multiplier method
    @Override
    public double calculateRentalPrice(Docent user, long hours) {
        return (this.LCD == HasLCD.FALSE ? 2.50 : 2.60); // Base Price for students
    }
    
    @Override
    public double calculateRentalPrice(NonDocent user, long hours) {
        return (this.LCD == HasLCD.FALSE ? 2.50 : 2.60); // Base Price for employees
    }

    @Override
    public double calculateRentalPrice(Student user, long hours) {
        return (this.LCD == HasLCD.FALSE ? 1.0 : 1.10); // Base Price for students
    }
}