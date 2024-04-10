package Payment;


import Payment.PaymentMethod.PaymentMethod;

public class PaymentPortal extends PaymentGateway{
    public PaymentPortal(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }
}
