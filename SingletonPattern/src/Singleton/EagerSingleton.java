package Singleton;

public class EagerSingleton {
    private final EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){
    }

    public EagerSingleton getInstances(){
        return eagerSingleton;
    }
}
