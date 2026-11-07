package software.reuse;

public class JazzCashPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        if (amount <= 0) return false;
        System.out.println("Paid Rs. " + amount + " using JazzCash");
        return true;
    }
}
