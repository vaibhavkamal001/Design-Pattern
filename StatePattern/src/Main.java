import GumballMachine.GumballMachine;
import VendingMachine.StateImpl.OutOfStockState;
import VendingMachine.VendingMachine;

public class Main {
    public static void main(String[] args) {
//        testGumball();
        testVendingMachine();
    }

    private static void testVendingMachine() {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();

        vendingMachine.setState(new OutOfStockState());
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
    }

    private static void testGumball() {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println("");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("");
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        System.out.println("");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
        System.out.println("");
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("");
    }
}