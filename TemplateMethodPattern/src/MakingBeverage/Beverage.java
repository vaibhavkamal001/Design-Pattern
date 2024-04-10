package MakingBeverage;

public abstract class Beverage {

    // Template method outlining the algorithm for preparing a beverage
    public final void prepareBeverage() {
        boilWater();
        addIngredients();
        serveBeverage();
    }

    // Primitive operations to be implemented by subclasses
    protected abstract void boilWater();
    protected abstract void addIngredients();
    protected abstract void serveBeverage();
}