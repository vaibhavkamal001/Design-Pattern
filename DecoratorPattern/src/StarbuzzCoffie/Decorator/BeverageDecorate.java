package StarbuzzCoffie.Decorator;

import StarbuzzCoffie.Beverage;

public abstract class BeverageDecorate extends Beverage {
    public BeverageDecorate(String description, Size size) {
        super(description, size);
    }

    public abstract String getDescription();
}
