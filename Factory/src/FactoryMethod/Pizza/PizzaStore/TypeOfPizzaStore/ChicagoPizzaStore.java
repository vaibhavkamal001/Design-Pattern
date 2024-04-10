package FactoryMethod.Pizza.PizzaStore.TypeOfPizzaStore;

import FactoryMethod.Pizza.Pizza;
import FactoryMethod.Pizza.PizzaStore.PizzaStore;
import FactoryMethod.Pizza.TypeOfPizza.CheesePizza;
import FactoryMethod.Pizza.TypeOfPizza.ClamPizza;
import FactoryMethod.Pizza.TypeOfPizza.PepperoniPizza;
import FactoryMethod.Pizza.TypeOfPizza.VeggiePizza;
import FactoryMethod.PizzaIngredients.IngredientsByPlace.NewYorkPizzaIngredientFactory.NYPizzaIngredientFactory;
import FactoryMethod.PizzaIngredients.PizzaIngredients;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredients ingredientFactory =  new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
