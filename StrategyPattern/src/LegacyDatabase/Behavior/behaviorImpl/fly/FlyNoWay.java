package LegacyDatabase.Behavior.behaviorImpl.fly;

import LegacyDatabase.Behavior.Flyable;

public class FlyNoWay implements Flyable {
    @Override
    public void fly() {
        System.out.println("Duck cannot fly");
    }
}
