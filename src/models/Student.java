package models;

import models.abstracts.User;
import models.abstracts.Vehicle;

public class Student extends User {
    public enum Polos {
        POLO_I,
        POLO_II,
        POLO_III
    }
    private Polos polo;
    private String curso;

    public Student() {}

    public Student(String mechanographicNumber, PaymentMethod paymentMethod, String curso, Polos polo) {
        super(mechanographicNumber, paymentMethod);
        this.curso = curso;
        this.polo = polo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Polos getPolo() {
        return polo;
    }

    public void setPolo(Polos polo) {
        this.polo = polo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "curso='" + curso + '\'' +
                ", polo=" + polo +
                "} " + super.toString();
    }

    @Override
    public double getRentalPriceFor(Vehicle vehicle) {
        return vehicle.calculateRentalPrice(this);
    }

    @Override
    public double getDiscount() {
        return 1; // No discount for Student users
    }
}
