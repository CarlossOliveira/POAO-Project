package models;

import java.time.*;
import java.util.Arrays;
import models.abstracts.User;
import models.abstracts.Vehicle;

public class Rental {
    // Enum for additional services
    public enum AddedServices {
        HELMET_RENTAL,
        LIGHT_RENTAL
    }

    // --- Attributes ---
    private LocalDateTime reservationStartTime; // Start time of the reservation
    private LocalDateTime reservationEndTime; // End time of the reservation

    private Vehicle vehicle;   // Can be Bike, EletricBike or EletricScooter
    private User user;  // Can be Student, Docent or NonDocent

    private AddedServices[] addedServices; // Array of additional services

    // --- Constructors ---
    
    // Default constructor
    public Rental() {}

    // Constructor with all attributes
    public Rental(LocalDateTime reservationStartTime, LocalDateTime reservationEndTime, Vehicle vehicle, User user, AddedServices[] addedServices) {
        this.reservationStartTime = reservationStartTime;
        this.reservationEndTime = reservationEndTime;
        this.vehicle = vehicle;
        this.user = user;
        this.addedServices = addedServices;
    }

    // Constructor without added services
    public Rental(LocalDateTime reservationStartTime, LocalDateTime reservationEndTime, Vehicle vehicle, User user) {
        this.reservationStartTime = reservationStartTime;
        this.reservationEndTime = reservationEndTime;
        this.vehicle = vehicle;
        this.user = user;
        this.addedServices = null;
    }

    // --- Getters, Setters and toString ---

    // Reservation Start Time
    public LocalDateTime getReservationStartTime() {
        return reservationStartTime;
    }

    public void setReservationStartTime(LocalDateTime reservationStartTime) {
        this.reservationStartTime = reservationStartTime;
    }

    // Reservation End Time
    public LocalDateTime getReservationEndTime() {
        return reservationEndTime;
    }

    public void setReservationEndTime(LocalDateTime reservationEndTime) {
        this.reservationEndTime = reservationEndTime;
    }

    // Vehicle
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // User
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Added Services
    public AddedServices[] getAddedServices() {
        return addedServices;
    }

    public void setAddedServices(AddedServices[] addedServices) {
        this.addedServices = addedServices;
    }

    // toString method
    @Override
    public String toString() {
        return "Rental{" +
                "reservationStartTime=" + reservationStartTime +
                ", reservationEndTime=" + reservationEndTime +
                ", vehicle=" + vehicle +
                ", user=" + user +
                (addedServices != null ? ", addedServices=" + Arrays.toString(addedServices) : "") +
                '}';
    }

    // --- Business Methods ---

    // Method to get the reservation duration in hours
    public long getReservationDuration() {
        return (long)Duration.between(reservationStartTime, reservationEndTime).toHours();
    }

    // Method to calculate total cost of the rental
    public double getTotalCost() {
        double totalCost = 0.0;
        long hours = getReservationDuration();

        // Calculate base cost from vehicle
        totalCost += user.getRentalPriceFor(vehicle, hours);
        
        // Add costs for additional services
        if (addedServices != null) {
            for (AddedServices service : addedServices) {
                if (service == AddedServices.HELMET_RENTAL) {
                    totalCost += (5.0 * (1 + (hours % 24))); // Additional cost for helmet rental per day
                } else if (service == AddedServices.LIGHT_RENTAL) {
                    totalCost += (2.5 * (1 + (hours % 24))); // Additional cost for light rental per day
                }
            }
        }

        return totalCost * user.getDiscount();
    }
}