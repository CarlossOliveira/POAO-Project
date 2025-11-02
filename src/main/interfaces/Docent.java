package main.interfaces;

public interface Docent {
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

    Faculties[] getFaculties();
    void setFaculties(Faculties[] facultie);
    String getService();
    void setService(String service);
}