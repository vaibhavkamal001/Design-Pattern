package Payment.PaymentMethod.PaymentMethodImpl;

import Payment.PaymentMethod.PaymentMethod;

public class Paytm implements PaymentMethod {
    @Override
    public void doPayment() {
        System.out.println("Doing Payment using Paytm");
    }
}
