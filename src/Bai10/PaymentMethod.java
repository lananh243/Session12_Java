package Bai10;

public abstract class PaymentMethod {
    private double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double processPayment();
    public abstract double calculateFee();
    public abstract String processPayment(String currency);
}
