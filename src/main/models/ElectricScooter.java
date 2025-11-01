package main.models;

import java.lang.reflect.AccessFlag;
import main.interfaces.BatteryLevel;
import main.models.abstracts.Vehicle;

public class ElectricScooter extends Vehicle implements BatteryLevel {
    int batteryLevel;
    boolean hasLCD;

    public ElectricScooter() {};

    public ElectricScooter(int id, AccessFlag.Location location, int batteryLevel) {
        super(id, location);
        this.batteryLevel = batteryLevel;
        this.hasLCD = false;
    }

    public ElectricScooter(int id, AccessFlag.Location location, int batteryLevel, boolean hasLCD) {
        super(id, location);
        this.batteryLevel = batteryLevel;
        this.hasLCD = hasLCD;
    }

    public boolean isHasLCD() {
        return hasLCD;
    }

    public void setHasLCD(boolean hasLCD) {
        this.hasLCD = hasLCD;
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
                ", hasLCD=" + hasLCD +
                "} " + super.toString();
    }
}