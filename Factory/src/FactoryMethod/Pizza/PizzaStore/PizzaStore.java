package FactoryMethod.Pizza.PizzaStore;

import FactoryMethod.Pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String Type){
        Pizza pizza = createPizza(Type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    public abstract Pizza createPizza(String Type);
}
