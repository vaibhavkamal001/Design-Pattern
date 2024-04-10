package StarbuzzCoffie.Decorator.BeverageImp;

import StarbuzzCoffie.Beverage;
import StarbuzzCoffie.Decorator.Size;

public class Expresso extends Beverage {
    public Expresso(Size size){
        super("Expresso "+size.name(),size);
    }
    @Override
    public double cost() {
        if(Size.LARGE==getSize()){
            return 15;
        }else if(Size.MEDIUM==getSize()){
            return 10;
        }else {
            return 5;
        }
    }
}
