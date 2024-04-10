package VendingMachine.StateImpl;


import VendingMachine.VendingMachineState;

public class ReadyState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed");
    }
}