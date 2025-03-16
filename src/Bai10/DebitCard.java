package Bai10;

public class DebitCard extends PaymentMethod{

    public DebitCard(double amount) {
        super(amount);
    }

    @Override
    public double processPayment() {
        return getAmount() * 0.01;
    }

    @Override
    public double calculateFee() {
        return getAmount() + calculateFee();
    }

    @Override
    public String processPayment(String currency) {
        return processPayment() + " " + currency;
    }
}
