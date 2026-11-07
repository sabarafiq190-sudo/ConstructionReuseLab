package software.reuse;

public class EcommerceCart {
    private final PaymentMethod paymentMethod;   // sirf interface ka pata hai

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double total) {
        if (paymentMethod.pay(total)) {
            System.out.println("Order placed successfully!\n");
        } else {
            System.out.println("Payment failed!\n");
        }
    }
}
