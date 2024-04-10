package StarbuzzCoffie;

import StarbuzzCoffie.Decorator.Size;

public abstract class Beverage {
    protected String description;
    protected Size size;

    public Beverage(String description,Size size){
        this.description = description;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
