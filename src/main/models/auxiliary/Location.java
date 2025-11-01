package main.models.auxiliary;

public class Location {
    public float latitude;
    public float longitude;
    public float altitude;

    public Location(){}

    public Location(float latitude, float longitude, float altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                '}';
    }
}
