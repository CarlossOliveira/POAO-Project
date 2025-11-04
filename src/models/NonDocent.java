package models;    

import java.time.LocalDate;
import models.abstracts.Employee;
import models.abstracts.Vehicle;

public class NonDocent extends Employee {
    private String service;

    public NonDocent() {}

    public NonDocent(String mechanographicNumber, PaymentMethod paymentMethod, LocalDate hireDate, String service) {
        super(mechanographicNumber, paymentMethod, hireDate);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    
    @Override
    public String toString() {
        return "NonDocent{" +
                "service='" + service + '\'' +
                "} " + super.toString();
    }

    @Override
    public double getRentalPriceFor(Vehicle vehicle, long hours) {
        return vehicle.calculateRentalPrice(this, hours);
    }

    @Override
    public double getDiscount() {
        return 0.5; // 50% discount for NonDocent users
    }
}
