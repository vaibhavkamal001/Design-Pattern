package LegacyDatabase.Behavior.behaviorImpl.quack;

import LegacyDatabase.Behavior.Quackable;

public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Duck is Quacking");
    }
}
