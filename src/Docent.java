public class Docent {
    private String[] faculty;
    private String service;
    
    public Docent(){}

    public Docent(String service) {
        this.service = service;
    }

    public Docent(String[] faculty) {
        this.faculty = faculty;
    }

    public String[] getFaculty() {
        return faculty;
    }

    public void setFaculty(String[] faculty) {
        this.faculty = faculty;
    }
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
    }
}
