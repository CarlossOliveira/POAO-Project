package main.models;

import java.util.Arrays;
import main.interfaces.Docent;
import main.models.abstracts.User;
import main.models.auxiliary.DateTime;

public class Employee extends User implements Docent {
    private Faculties[] faculties;
    private DateTime hireDate;
    private String service;
    private static String role = "Docent"; // Default role for Docents
    private static Faculties[] noFaculties = new Faculties[0]; // Default empty faculties array for non-Docents

    public Employee() {}

    // Constructor for Employee that is also a Docent
    public Employee(String mechanographicNumber, PaymentMethod paymentMethod, DateTime hireDate, Faculties[] faculties) {
        super(mechanographicNumber, paymentMethod);
        this.hireDate = hireDate;
        this.faculties = faculties;
        this.service = role; // Default service for Docents
    }

    // Constructor for Employee that is not a Docent
    public Employee(String mechanographicNumber, PaymentMethod paymentMethod, DateTime hireDate, String service) {
        super(mechanographicNumber, paymentMethod);
        this.hireDate = hireDate;
        this.service = service;
        this.faculties = noFaculties; // Not a Docent
    }

    public DateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(DateTime hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public Faculties[] getFaculties() {
        return faculties;
    }

    @Override
    public void setFaculties(Faculties[] faculties) {
        this.faculties = faculties;
    }

    @Override
    public String getService() {
        return service;
    }

    @Override
    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                ", faculties=" + Arrays.toString(faculties) +
                ", service='" + service + '\'' +
                "} " + super.toString();
    }
}
