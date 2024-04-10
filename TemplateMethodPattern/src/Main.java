import MakingBeverage.Beverage;
import MakingBeverage.BeverageImpl.Coffee;
import MakingBeverage.BeverageImpl.Tea;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();

        // Prepare tea
        Beverage tea = new Tea();
        tea.prepareBeverage();
    }
}