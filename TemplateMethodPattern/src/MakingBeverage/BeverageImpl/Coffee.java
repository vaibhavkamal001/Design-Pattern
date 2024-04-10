package MakingBeverage.BeverageImpl;

import MakingBeverage.Beverage;

public class Coffee extends Beverage {

    // Implementation of primitive operations for preparing coffee
    @Override
    protected void boilWater() {
        System.out.println("Boiling water for coffee");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Adding coffee powder and sugar");
    }

    @Override
    protected void serveBeverage() {
        System.out.println("Serving coffee");
    }
}