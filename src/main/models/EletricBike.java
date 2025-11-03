package main.models;

import main.interfaces.*;
import main.models.abstracts.Vehicle;
import main.models.auxiliary.Location;

public class EletricBike extends Vehicle implements BatteryLevel, Capacity {
    public enum HasRemovableBattery {
        TRUE,
        FALSE
    }
    private HasRemovableBattery removableBattery;
    private int maxCapacity;
    private int batteryLevel;

    public EletricBike() {};

    public EletricBike(int id, Location location, int batteryLevel, int maxCapacity) {
        super(id, location);
        this.batteryLevel = batteryLevel;
        this.maxCapacity = maxCapacity;
        this.removableBattery = HasRemovableBattery.FALSE;
    }

    public EletricBike(int id, Location location, int batteryLevel, int maxCapacity, HasRemovableBattery removableBattery) {
        super(id, location);
        this.batteryLevel = batteryLevel;
        this.maxCapacity = maxCapacity;
        this.removableBattery = removableBattery;
    }

    public HasRemovableBattery getRemovableBattery() {
        return removableBattery;
    }

    public void setRemovableBattery(HasRemovableBattery removableBattery) {
        this.removableBattery = removableBattery;
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
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "EletricBike{" +
                "maxCapacity=" + maxCapacity +
                ", batteryLevel=" + batteryLevel +
                ", removableBattery=" + removableBattery +
                "} " + super.toString();
    }
}
