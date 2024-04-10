package FactoryMethod.PizzaIngredients;

import FactoryMethod.PizzaIngredients.Ingredients.*;

public interface PizzaIngredients {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
