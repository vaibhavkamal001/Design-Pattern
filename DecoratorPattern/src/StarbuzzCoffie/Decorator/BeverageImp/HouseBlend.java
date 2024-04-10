package StarbuzzCoffie.Decorator.BeverageImp;

import StarbuzzCoffie.Beverage;
import StarbuzzCoffie.Decorator.Size;

public class HouseBlend extends Beverage {
    public HouseBlend(Size size){
        super("HouseBlend "+size.name(),size);
    }

    @Override
    public double cost() {
        if(Size.LARGE==getSize()){
            return 30;
        }else if(Size.MEDIUM==getSize()){
            return 25;
        }else {
            return 20;
        }
    }
}
