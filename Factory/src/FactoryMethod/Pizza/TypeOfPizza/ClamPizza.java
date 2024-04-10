package FactoryMethod.Pizza.TypeOfPizza;

import FactoryMethod.Pizza.Pizza;
import FactoryMethod.PizzaIngredients.PizzaIngredients;

public class ClamPizza extends Pizza {
    PizzaIngredients ingredientFactory;
    public ClamPizza(PizzaIngredients ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough().toString();
        sauce = ingredientFactory.createSauce().toString();
        cheese = ingredientFactory.createCheese().toString();
    }
}
