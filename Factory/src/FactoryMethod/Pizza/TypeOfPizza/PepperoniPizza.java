package FactoryMethod.Pizza.TypeOfPizza;

import FactoryMethod.Pizza.Pizza;
import FactoryMethod.PizzaIngredients.PizzaIngredients;

public class PepperoniPizza extends Pizza {
    PizzaIngredients ingredientFactory;
    public PepperoniPizza(PizzaIngredients ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough().toString();
        sauce = ingredientFactory.createSauce().toString();
        cheese = ingredientFactory.createCheese().toString();
    }
}
