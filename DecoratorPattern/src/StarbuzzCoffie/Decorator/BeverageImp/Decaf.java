package StarbuzzCoffie.Decorator.BeverageImp;

import StarbuzzCoffie.Beverage;
import StarbuzzCoffie.Decorator.Size;

public class Decaf extends Beverage {
    public Decaf(Size size){
        super("Decaf "+size.name(),size);
    }
    @Override
    public double cost() {
        if(Size.LARGE==getSize()){
            return 25;
        }else if(Size.MEDIUM==getSize()){
            return 20;
        }else {
            return 15;
        }
    }
}
