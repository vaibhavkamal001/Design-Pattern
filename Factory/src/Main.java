import FactoryMethod.Pizza.Pizza;
import FactoryMethod.Pizza.PizzaStore.PizzaStore;
import FactoryMethod.Pizza.PizzaStore.TypeOfPizzaStore.ChicagoPizzaStore;
import FactoryMethod.Pizza.PizzaStore.TypeOfPizzaStore.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore ChicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizzaChicago = ChicagoPizzaStore.orderPizza("veggie");
        System.out.println("------------------------------------------------------------");
        PizzaStore NYPizzaStore = new NYPizzaStore();
        Pizza pizzaNY = NYPizzaStore.orderPizza("pepperoni");

    }
}