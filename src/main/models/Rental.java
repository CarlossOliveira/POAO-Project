package main.models;

import java.util.Arrays;
import main.models.auxiliary.DateTime;

public class Rental {
    // Start Time:
    private DateTime reservationStartTime;

    // End Time:
    private DateTime reservationEndTime;

    // Vehicle:
    private Bike bike;
    private EletricScooter electricScooter;
    private EletricBike eletricBike;

    // User:
    private Docent docent;
    private NonDocent nonDocent;

    // Added Services:
    public enum AddedServices {
        HELMET_RENTAL,
        LIGHT_RENTAL
    }
    private AddedServices[] addedServices;

    public Rental() {}

    // Bike Rental:
    public Rental(DateTime reservationStartTime, DateTime reservationEndTime, Bike bike, Docent docent, AddedServices... addedServices) {
        this.reservationStartTime = reservationStartTime;
        this.reservationEndTime = reservationEndTime;
        this.bike = bike;
        this.docent = docent;
        this.addedServices = addedServices;

        this.nonDocent = null;
        this.electricScooter = null;
        this. eletricBike = null;
    }

    public Rental(DateTime reservationStartTime, DateTime reservationEndTime, Bike bike, NonDocent nonDocent, AddedServices... addedServices) {
        this.reservationStartTime = reservationStartTime;
        this.reservationEndTime = reservationEndTime;
        this.bike = bike;
        this.nonDocent = nonDocent;
        this.addedServices = addedServices;

        this.docent = null;
        this.electricScooter = null;
        this.eletricBike = null;
    }

    // Eletric Scooter Rental:
    public Rental(DateTime reservationStartTime, DateTime reservationEndTime, EletricScooter electricScooter, Docent docent, AddedServices... addedServices) {
        this.reservationStartTime = reservationStartTime;
        this.reservationEndTime = reservationEndTime;
        this.electricScooter = electricScooter;
        this.docent = docent;
        this.addedServices = addedServices;

        this.nonDocent = null;
        this.bike = null;
        this.eletricBike = null;
    }

    public Rental(DateTime reservationStartTime, DateTime reservationEndTime, EletricScooter electricScooter, NonDocent nonDocent, AddedServices... addedServices) {
        this.reservationStartTime = reservationStartTime;
        this.reservationEndTime = reservationEndTime;
        this.electricScooter = electricScooter;
        this.nonDocent = nonDocent;
        this.addedServices = addedServices;

        this.docent = null;
        this.bike = null;
        this.eletricBike = null;
    }

    // Eletric Bike Rental:
    public Rental(DateTime reservationStartTime, DateTime reservationEndTime, EletricBike eletricBike, Docent docent, AddedServices... addedServices) {
        this.reservationStartTime = reservationStartTime;
        this.reservationEndTime = reservationEndTime;
        this.eletricBike = eletricBike;
        this.docent = docent;
        this.addedServices = addedServices;

        this.nonDocent = null;
        this.bike = null;
        this.electricScooter = null;
    }

    public Rental(DateTime reservationStartTime, DateTime reservationEndTime, EletricBike eletricBike, NonDocent nonDocent, AddedServices... addedServices) {
        this.reservationStartTime = reservationStartTime;
        this.reservationEndTime = reservationEndTime;
        this.eletricBike = eletricBike;
        this.nonDocent = nonDocent;
        this.addedServices = addedServices;

        this.docent = null;
        this.bike = null;
        this.electricScooter = null;
    }   

    public DateTime getReservationStartTime() {
        return reservationStartTime;
    }

    public void setReservationStartTime(DateTime reservationStartTime) {
        this.reservationStartTime = reservationStartTime;
    }

    public DateTime getReservationEndTime() {
        return reservationEndTime;
    }

    public void setReservationEndTime(DateTime reservationEndTime) {
        this.reservationEndTime = reservationEndTime;
    }

    public Bike getBike() {
        return bike;
    }
    
    public EletricScooter getElectricScooter() {
        return electricScooter;
    }

    public EletricBike getEletricBike() {
        return eletricBike;
    }

    public Docent getDocent() {
        return docent;
    }

    public NonDocent getNonDocent() {
        return nonDocent;
    }

    public AddedServices[] getAddedServices() {
        return AddedServices.values();
    }

    public void setAddedServices(AddedServices[] addedServices) {
        this.addedServices = addedServices;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "reservationStartTime=" + reservationStartTime +
                ", reservationEndTime=" + reservationEndTime +
                (bike != null ? ", bike=" + bike : "") +
                (electricScooter != null ? ", electricScooter=" + electricScooter : "") +
                (eletricBike != null ? ", eletricBike=" + eletricBike : "") +
                (docent != null ? ", docent=" + docent : "") +
                (nonDocent != null ? ", nonDocent=" + nonDocent : "") +
                (addedServices != null ? ", addedServices=" + Arrays.toString(addedServices) : "") +
                '}';
    }
}
