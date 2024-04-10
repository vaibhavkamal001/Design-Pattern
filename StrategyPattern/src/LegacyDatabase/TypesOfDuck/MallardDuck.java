package LegacyDatabase.TypesOfDuck;

import LegacyDatabase.Behavior.Flyable;
import LegacyDatabase.Behavior.Quackable;
import LegacyDatabase.Duck;

public class MallardDuck extends Duck {

    public MallardDuck(Flyable flyable, Quackable quackable){
        super(flyable,quackable);
    }
    @Override
    public void display(){
        System.out.println("I’m a real Mallard duck");
    }
}
