package LegacyDatabase.Behavior.behaviorImpl.fly;

import LegacyDatabase.Behavior.Flyable;

public class FlyWithWings implements Flyable {
    @Override
    public void fly(){
        System.out.println("Duck is Flying");
    }
}
