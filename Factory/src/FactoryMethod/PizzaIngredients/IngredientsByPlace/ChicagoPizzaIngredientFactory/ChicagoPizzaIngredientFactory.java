package FactoryMethod.PizzaIngredients.IngredientsByPlace.ChicagoPizzaIngredientFactory;

import FactoryMethod.PizzaIngredients.Ingredients.*;
import FactoryMethod.PizzaIngredients.Ingredients.IngredientsImplement.*;
import FactoryMethod.PizzaIngredients.PizzaIngredients;

public class ChicagoPizzaIngredientFactory implements PizzaIngredients {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Clams createClam() {
        return new FreshClams();
    }
}
