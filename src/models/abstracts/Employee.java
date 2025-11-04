package models.abstracts;

import java.time.*;


public abstract class Employee extends User {
    private LocalDate hireDate;

    public Employee() {}

    public Employee(String mechanographicNumber, PaymentMethod paymentMethod, LocalDate hireDate) {
        super(mechanographicNumber, paymentMethod);
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                "} " + super.toString();
    }
}
