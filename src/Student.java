public class Student extends User {
    private String curso;
    private int polo;

    public Student(){}

    public Student(String mechanographicNumber, String paymentMethod, String curso, int polo){
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

    public int getPolo() {
        return polo;
    }

    public void setPolo(int polo) {
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
