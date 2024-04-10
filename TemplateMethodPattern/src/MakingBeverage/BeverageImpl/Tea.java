package MakingBeverage.BeverageImpl;

import MakingBeverage.Beverage;

public class Tea extends Beverage {

    // Implementation of primitive operations for preparing tea
    @Override
    protected void boilWater() {
        System.out.println("Boiling water for tea");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Adding tea leaves, milk, and sugar");
    }

    @Override
    protected void serveBeverage() {
        System.out.println("Serving tea");
    }
}