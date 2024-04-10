package StarbuzzCoffie.Decorator.BeverageDecorateImp;

import StarbuzzCoffie.Beverage;
import StarbuzzCoffie.Decorator.BeverageDecorate;
import StarbuzzCoffie.Decorator.Size;

public class Milk extends BeverageDecorate {
    Beverage beverage;

    public Milk(Beverage beverage){
        super(beverage.getDescription(), beverage.getSize());
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        if(Size.LARGE==getSize()){
            return 10+beverage.cost();
        }else if(Size.MEDIUM==getSize()){
            return 8+beverage.cost();
        }else {
            return 5+beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }
}
