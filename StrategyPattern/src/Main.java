import LegacyDatabase.Behavior.behaviorImpl.fly.FlyNoWay;
import LegacyDatabase.Behavior.behaviorImpl.fly.FlyWithWings;
import LegacyDatabase.Behavior.behaviorImpl.quack.Quack;
import LegacyDatabase.Behavior.behaviorImpl.quack.Squeak;
import LegacyDatabase.Duck;
import LegacyDatabase.TypesOfDuck.MallardDuck;
import Payment.PaymentGateway;
import Payment.PaymentMethod.PaymentMethodImpl.Card;
import Payment.PaymentMethod.PaymentMethodImpl.GooglePay;
import Payment.PaymentPortal;

public class Main {
    public static void main(String[] args) {
        testPayment();
    }

    public static  void testPayment(){
        PaymentGateway paymentPortal = new PaymentPortal(new GooglePay());
        paymentPortal.performPayment();
        paymentPortal.setPaymentMethod(new Card());
        paymentPortal.performPayment();
    }

    public static void testDuck(){
        Duck duck = new MallardDuck(new FlyWithWings(),new Quack());

        duck.display();
        duck.performFly();
        duck.performQuack();

        duck.setFlyable(new FlyNoWay());
        duck.performFly();
        duck.setQuckable(new Squeak());
        duck.performQuack();
    }
}


/**
 * In this Duck has-a relationship with Flyable and Quackable.
 * And MallardDuck is-a relationShip with Duck.
 */