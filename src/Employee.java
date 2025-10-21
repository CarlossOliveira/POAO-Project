public class Employee extends User {
    public Employee(){}

    public Employee(String mechanographicNumber, String paymentMethod) {
        super(mechanographicNumber, paymentMethod);
    }

    @Override
    public String toString() {
        return "Employee{} " + super.toString();
    }
}
