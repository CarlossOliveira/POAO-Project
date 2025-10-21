public class User {
    private String mechanographicNumber;
    private String paymentMethod;

    public User(){}

    public User(String mechanographicNumber, String paymentMethod) {
        this.mechanographicNumber = mechanographicNumber;
        this.paymentMethod = paymentMethod;
    }
    public String getMechanographicNumber() {
        return mechanographicNumber;
    }
    public void setMechanographicNumber(String mechanographicNumber) {
        this.mechanographicNumber = mechanographicNumber;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "User{" +
                "mechanographicNumber='" + mechanographicNumber + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
