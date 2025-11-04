package models.abstracts;

import models.auxiliary.Location;

public abstract class EletricVehicles extends Vehicle {
    private int batteryLevel;

    public EletricVehicles() {}

    public EletricVehicles(int id, Location location, int batteryLevel) {
        super(id, location);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "EletricVehicles{" +
                "batteryLevel=" + batteryLevel +
                "} " + super.toString();
    }
}
