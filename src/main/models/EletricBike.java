package main.models;

import java.lang.reflect.AccessFlag;
import main.interfaces.BatteryLevel;
import main.interfaces.Capacity;
import main.models.abstracts.Vehicle;

public class EletricBike extends Vehicle implements BatteryLevel, Capacity {
    private int maxCapacity;
    private int batteryLevel;
    private boolean removableBattery;

    public EletricBike() {};

    public EletricBike(int id, AccessFlag.Location location, int batteryLevel, int maxCapacity) {
        super(id, location);
        this.batteryLevel = batteryLevel;
        this.maxCapacity = maxCapacity;
        this.removableBattery = false;
    }

    public EletricBike(int id, AccessFlag.Location location, int batteryLevel, int maxCapacity, boolean removableBattery) {
        super(id, location);
        this.batteryLevel = batteryLevel;
        this.maxCapacity = maxCapacity;
        this.removableBattery = removableBattery;
    }

        public boolean isRemovableBattery() {
        return removableBattery;
    }

    public void setRemovableBattery(boolean removableBattery) {
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
