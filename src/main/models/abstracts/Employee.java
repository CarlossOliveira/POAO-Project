package main.models.abstracts;

import main.models.auxiliary.DateTime;

public abstract class Employee extends User {
    private DateTime hireDate;

    public Employee() {}

    public Employee(String mechanographicNumber, PaymentMethod paymentMethod, DateTime hireDate) {
        super(mechanographicNumber, paymentMethod);
        this.hireDate = hireDate;
    }

    public DateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(DateTime hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                "} " + super.toString();
    }
}
