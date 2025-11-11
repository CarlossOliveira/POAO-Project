package models;

import java.time.*;
import java.util.Arrays;
import models.abstracts.Employee;
import models.abstracts.Vehicle;

public class Docent extends Employee {
    public enum Faculties {
        FLUC,
        FDUC,
        FMUC,
        FCTUC,
        FFUC,
        FEUC,
        FPCEUC,
        FCDEFUC
    }
    private Faculties[] faculties;

    public Docent() {}

    public Docent(String mechanographicNumber, PaymentMethod paymentMethod, LocalDate hireDate, Faculties[] faculties) {
        super(mechanographicNumber, paymentMethod, hireDate);
        this.faculties = faculties;
    }

    public Faculties[] getFaculties() {
        return faculties;
    }

    public void setFaculties(Faculties[] faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "Docent{" +
                "faculties=" + Arrays.toString(faculties) +
                "} " + super.toString();
    }

    @Override
    public double getRentalPriceFor(Vehicle vehicle) {
        return vehicle.calculateRentalPrice(this);
    }
}
