package StarbuzzCoffie.Decorator.BeverageImp;

import StarbuzzCoffie.Beverage;
import StarbuzzCoffie.Decorator.Size;

public class DarkRoast extends Beverage {
    public DarkRoast(Size size){
        super("DarkRoast "+size.name(),size);
    }
    @Override
    public double cost() {
        if(Size.LARGE==getSize()){
            return 20;
        }else if(Size.MEDIUM==getSize()){
            return 15;
        }else {
            return 10;
        }
    }
}
