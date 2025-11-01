package main.models;

import main.interfaces.Docent;
import main.models.abstracts.User;
import main.models.auxiliary.DateTime;

public class Employee extends User implements Docent {

    private DateTime hireDate;
    private String[] faculties;
    private String service;

    public Employee() {}

    public Employee(String mechanographicNumber, String paymentMethod, DateTime hireDate, String[] faculties) {
        super(mechanographicNumber, paymentMethod);
        this.hireDate = hireDate;
        this.faculties = faculties;
    }

    public Employee(String mechanographicNumber, String paymentMethod, DateTime hireDate, String service) {
        super(mechanographicNumber, paymentMethod);
        this.hireDate = hireDate;
        this.service = service;
    }

    public DateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(DateTime hireDate) {
        this.hireDate = hireDate;
    }



    @Override
    public String[] getFaculties() {
        return faculties;
    }

    @Override
    public void setFaculties(String[] faculties) {
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
                ", faculties=" + String.join(", ", faculties) +
                ", service='" + service + '\'' +
                "} " + super.toString();
    }
}
