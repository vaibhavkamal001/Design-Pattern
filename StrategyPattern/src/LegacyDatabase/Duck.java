package LegacyDatabase;

import LegacyDatabase.Behavior.Flyable;
import LegacyDatabase.Behavior.Quackable;

public abstract class Duck {
    private Flyable flyable;
    private Quackable quackable;

    public Duck(Flyable flyable, Quackable quackable) {
        this.flyable = flyable;
        this.quackable = quackable;
    }

    public void performFly(){
        flyable.fly();
    }
    public void performQuack(){
        quackable.quack();
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuckable(Quackable quackable) {
        this.quackable = quackable;
    }

    public abstract void display();
}
