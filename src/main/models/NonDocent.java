package main.models;    

import main.models.abstracts.Employee;
import main.models.auxiliary.DateTime;

public class NonDocent extends Employee {
    private String service;

    public NonDocent() {}

    public NonDocent(String mechanographicNumber, PaymentMethod paymentMethod, DateTime hireDate, String service) {
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
}
