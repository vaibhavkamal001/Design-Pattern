package LegacyDatabase.Behavior.behaviorImpl.quack;

import LegacyDatabase.Behavior.Quackable;

public class Squeak implements Quackable {
    @Override
    public void quack() {
        System.out.println("Duck is Squeaking");
    }
}
