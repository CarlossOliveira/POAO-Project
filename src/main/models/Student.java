package main.models;

import main.models.abstracts.User;

public class Student extends User {
    public enum polos {
        POLO_1,
        POLO_2,
        POLO_3
    }
    private polos polo;
    private String curso;

    public Student() {}

    public Student(String mechanographicNumber, PaymentMethod paymentMethod, String curso, polos polo) {
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

    public polos getPolo() {
        return polo;
    }

    public void setPolo(polos polo) {
        this.polo = polo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "curso='" + curso + '\'' +
                ", polo=" + polo +
                "} " + super.toString();
    }
}
