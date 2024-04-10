package GumballMachine.StateImpls;

import GumballMachine.GumballMachine;
import GumballMachine.State;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot");
        gumballMachine.setCount(gumballMachine.getCount()-1);
        if (gumballMachine.getCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }
}
