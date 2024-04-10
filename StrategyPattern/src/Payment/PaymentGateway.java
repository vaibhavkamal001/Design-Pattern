package Payment;

import Payment.PaymentMethod.PaymentMethod;

public abstract class PaymentGateway {
    private PaymentMethod paymentMethod;
    public PaymentGateway(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void performPayment(){
        paymentMethod.doPayment();
    }
}
