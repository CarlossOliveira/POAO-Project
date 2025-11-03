package main.models;

import main.interfaces.BatteryLevel;
import main.models.abstracts.Vehicle;
import main.models.auxiliary.Location;

public class EletricScooter extends Vehicle implements BatteryLevel {
    public enum HasLCD {
        TRUE,
        FALSE
    }
    private HasLCD LCD;
    private int batteryLevel;

    public EletricScooter() {};

    public EletricScooter(int id, Location location, int batteryLevel) {
        super(id, location);
        this.batteryLevel = batteryLevel;
        this.LCD = HasLCD.FALSE;
    }

    public EletricScooter(int id, Location location, int batteryLevel, HasLCD LCD) {
        super(id, location);
        this.batteryLevel = batteryLevel;
        this.LCD = LCD;
    }

    public HasLCD getLCD() {
        return LCD;
    }

    public void setLCD(HasLCD LCD) {
        this.LCD = LCD;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "ElectricScooter{" +
                "batteryLevel=" + batteryLevel +
                ", hasLCD=" + LCD +
                "} " + super.toString();
    }
}