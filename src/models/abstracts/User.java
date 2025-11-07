package models.abstracts;

public abstract class User {
    public enum PaymentMethod {
        MBWAY,
        MULTIBANCO,
        CREDIT_CARD,
        SASUC,
        CASH
    }
    private PaymentMethod paymentMethod;
    private String mechanographicNumber;
    

    public User(){}

    public User(String mechanographicNumber, PaymentMethod paymentMethod) {
        this.mechanographicNumber = mechanographicNumber;
        this.paymentMethod = paymentMethod;
    }
    public String getMechanographicNumber() {
        return mechanographicNumber;
    }
    public void setMechanographicNumber(String mechanographicNumber) {
        this.mechanographicNumber = mechanographicNumber;
    }
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "User{" +
                "mechanographicNumber='" + mechanographicNumber + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public abstract double getRentalPriceFor(Vehicle vehicle); // Implements getRentalPriceFor in each subclass in order to call calculateRentalPrice of Vehicle

    public abstract double getDiscount();
}
