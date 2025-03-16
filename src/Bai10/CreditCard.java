package Bai10;

public class CreditCard extends PaymentMethod{
    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public double processPayment() {
        return getAmount() * 0.02;
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
