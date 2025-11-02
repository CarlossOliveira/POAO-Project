package main.models;

import java.util.Arrays;
import main.models.abstracts.Employee;
import main.models.auxiliary.DateTime;

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

    public Docent(String mechanographicNumber, PaymentMethod paymentMethod, DateTime hireDate, Faculties[] faculties) {
        super(mechanographicNumber, paymentMethod, hireDate);
        this.faculties = faculties;
    }

    Faculties[] getFaculties() {
        return faculties;
    }

    void setFaculties(Faculties[] facultie) {
        this.faculties = facultie;
    }

    @Override
    public String toString() {
        return "Docent{" +
                "faculties=" + Arrays.toString(faculties) +
                "} " + super.toString();
    }
}
