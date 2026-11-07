package software.reuse;

public class Task1Main {
    public static void main(String[] args) {
        EcommerceCart cart1 = new EcommerceCart(new CreditCardPayment());
        cart1.checkout(5000);

        EcommerceCart cart2 = new EcommerceCart(new JazzCashPayment());
        cart2.checkout(2500);
    }
}
