package Payment.PaymentMethod.PaymentMethodImpl;

import Payment.PaymentMethod.PaymentMethod;

public class GooglePay implements PaymentMethod {
    @Override
    public void doPayment() {
        System.out.println("Doing Payment using GooglePay");
    }
}
