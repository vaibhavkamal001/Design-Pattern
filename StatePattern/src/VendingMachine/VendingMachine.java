package VendingMachine;

import VendingMachine.StateImpl.ReadyState;

public class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new ReadyState();
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }
}