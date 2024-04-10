package VendingMachine.StateImpl;

import VendingMachine.VendingMachineState;

public class OutOfStockState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin cannot be inserted, machine out of stock");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selection not available, machine out of stock");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensing not available, machine out of stock");
    }
}