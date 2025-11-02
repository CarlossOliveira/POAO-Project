package main.models;

import java.lang.reflect.AccessFlag;
import main.interfaces.BatteryLevel;
import main.models.abstracts.Vehicle;

public class ElectricScooter extends Vehicle implements BatteryLevel {
    public enum HasLCD {
        TRUE,
        FALSE
    }
    private HasLCD LCD;
    private int batteryLevel;

    public ElectricScooter() {};

    public ElectricScooter(int id, AccessFlag.Location location, int batteryLevel) {
        super(id, location);
        this.batteryLevel = batteryLevel;
        this.LCD = HasLCD.FALSE;
    }

    public ElectricScooter(int id, AccessFlag.Location location, int batteryLevel, HasLCD LCD) {
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