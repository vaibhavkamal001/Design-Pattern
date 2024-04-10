package Payment.PaymentMethod.PaymentMethodImpl;

import Payment.PaymentMethod.PaymentMethod;

public class Card implements PaymentMethod {
    @Override
    public void doPayment() {
        System.out.println("Doing Payment using Card");
    }
}
